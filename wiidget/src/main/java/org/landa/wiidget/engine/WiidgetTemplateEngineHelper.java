package org.landa.wiidget.engine;

import ninja.Result;
import ninja.Route;
import ninja.utils.NinjaConstant;

import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.util.WiidgetProperties;

import com.google.inject.Inject;

public class WiidgetTemplateEngineHelper {

	private final WiidgetProperties properties;

	@Inject
	public WiidgetTemplateEngineHelper(final WiidgetProperties properties) {
		this.properties = properties;
	}

	public String getResource(final Route route, final Result result) {

		if (result.getTemplate() == null) {

			final Class<?> controller = route.getControllerClass();

			// Calculate the correct path of the template.
			// We always assume the template in the subdir "views"

			// 1) If we are in the main project =>
			// /controllers/ControllerName
			// to
			// /views/ControllerName/templateName.ftl.html
			// 2) If we are in a plugin / subproject
			// =>
			// /controllers/some/packages/submoduleName/ControllerName
			// to
			// views/some/packages/submoduleName/ControllerName/templateName.ftl.html

			// So let's calculate the parent package of the controller:
			final String controllerPackageName = controller.getPackage().getName();
			// This results in something like controllers or
			// some.package.controllers

			// Replace controller prefix with views prefix
			final String parentPackageOfController = controllerPackageName.replaceFirst(NinjaConstant.CONTROLLERS_DIR, NinjaConstant.VIEWS_DIR);

			// And now we rewrite everything from "." notation to directories /
			final String parentControllerPackageAsPath = parentPackageOfController.replaceAll("\\.", "/");

			final String methodName = route.getControllerMethod().getName();

			final String viewName = methodName + properties.getString(WiidgetProperties.WIIDGET_FILE_EXTENSION);

			// and the final path of the controller will be something like:
			return String.format("/%s/%s/%s", parentControllerPackageAsPath, controller.getSimpleName(), viewName);
		}

		return "";
	}

	@SuppressWarnings("unchecked")
	public <V extends WiidgetView> Class<V> getViewClass(final Route route, final Result result) {

		String className = null;

		if (result.getTemplate() == null) {

			final Class<?> controller = route.getControllerClass();

			// Calculate the correct path of the template.
			// We always assume the template in the subdir "views"

			// 1) If we are in the main project =>
			// /controllers/ControllerName
			// to
			// /views/ControllerName/templateName.ftl.html
			// 2) If we are in a plugin / subproject
			// =>
			// /controllers/some/packages/submoduleName/ControllerName
			// to
			// views/some/packages/submoduleName/ControllerName/templateName.ftl.html

			// So let's calculate the parent package of the controller:
			final String controllerPackageName = controller.getPackage().getName();
			// This results in something like controllers or
			// some.package.controllers

			// Replace controller prefix with views prefix
			final String parentPackageOfController = controllerPackageName.replaceFirst(NinjaConstant.CONTROLLERS_DIR, NinjaConstant.VIEWS_DIR);

			// And now we rewrite everything from "." notation to directories /
			final String parentControllerPackageAsPath = parentPackageOfController.replaceAll("\\.", "/");

			final String methodName = route.getControllerMethod().getName();

			final String viewName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);

			// and the final path of the controller will be something like:
			className = String.format("%s.%s.%s", parentControllerPackageAsPath, controller.getSimpleName(), viewName);

		} else {
			className = result.getTemplate();
		}

		try {
			return (Class<V>) Class.forName(className);
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
}
