package org.landa.wiidget.javaee.scope;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;

import org.jboss.weld.context.AbstractBoundContext;

public class ViewContext implements Context {

	private static ViewContext viewContextInstance = new ViewContext();
	
	private Map viewMap;

	public <T> T get(Contextual<T> contextual, CreationalContext<T> creationalContext) {
		Bean bean = (Bean) contextual;
		Map viewMap = getViewMap();
		if (viewMap.containsKey(bean.getName())) {
			return (T) viewMap.get(bean.getName());
		} else {
			T t = (T) bean.create(creationalContext);
			viewMap.put(bean.getName(), t);
			return t;
		}
	}

	private Map getViewMap() {
		if(null == viewMap){
			clean();
		}
		return viewMap;
	}

	public <T> T get(Contextual<T> contextual) {
		Bean bean = (Bean) contextual;
		Map viewMap = getViewMap();
		if (viewMap.containsKey(bean.getName())) {
			return (T) viewMap.get(bean.getName());
		} else {
			return null;
		}
	}

	@Override
	public Class<? extends Annotation> getScope() {
		return ViewScoped.class;
	}
	


	@Override
	public boolean isActive() {
		return true;
	}

	public static ViewContext instance(){
		return viewContextInstance;
	}

	public void clean() {
		viewMap = new HashMap<>();
	}
	
}
