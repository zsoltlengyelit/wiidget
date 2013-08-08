package org.landa.wiidget.engine;

import org.landa.wiidget.WiidgetView;

import ninja.Result;
import ninja.Route;
import ninja.utils.NinjaConstant;

public class WiidgetTemplateEngineHelper {

	public String getResource(Route route, Result result) {
		String className = null;

		if (result.getTemplate() == null) {

			Class controller = route.getControllerClass();

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
			String controllerPackageName = controller.getPackage().getName();
			// This results in something like controllers or
			// some.package.controllers

			// Replace controller prefix with views prefix
			String parentPackageOfController = controllerPackageName.replaceFirst(NinjaConstant.CONTROLLERS_DIR, NinjaConstant.VIEWS_DIR);

			// And now we rewrite everything from "." notation to directories /
			String parentControllerPackageAsPath = parentPackageOfController.replaceAll("\\.", "/");

			String methodName = route.getControllerMethod().getName();

			String viewName = methodName + ".wdgt";

			// and the final path of the controller will be something like:
			return String.format("/%s/%s/%s", parentControllerPackageAsPath, controller.getSimpleName(), viewName);
		}

		return "";
	}

	@SuppressWarnings("unchecked")
	public <V extends WiidgetView> Class<V> getViewClass(Route route, Result result) {

		String className = null;

		if (result.getTemplate() == null) {

			Class<?> controller = route.getControllerClass();

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
			String controllerPackageName = controller.getPackage().getName();
			// This results in something like controllers or
			// some.package.controllers

			// Replace controller prefix with views prefix
			String parentPackageOfController = controllerPackageName.replaceFirst(NinjaConstant.CONTROLLERS_DIR, NinjaConstant.VIEWS_DIR);

			// And now we rewrite everything from "." notation to directories /
			String parentControllerPackageAsPath = parentPackageOfController.replaceAll("\\.", "/");

			String methodName = route.getControllerMethod().getName();

			String viewName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);

			// and the final path of the controller will be something like:
			className = String.format("%s.%s.%s", parentControllerPackageAsPath, controller.getSimpleName(), viewName);

		} else {
			className = result.getTemplate();
		}

		try {
			return (Class<V>) Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
}
