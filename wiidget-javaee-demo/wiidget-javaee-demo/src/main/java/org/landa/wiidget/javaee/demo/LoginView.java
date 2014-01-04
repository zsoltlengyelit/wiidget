package org.landa.wiidget.javaee.demo;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.Stateful;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Provider;

import org.jboss.resteasy.util.GetRestful;
import org.landa.wiidget.WiidgetView;
import org.landa.wiidget.engine.WiidgetFactory;
import org.landa.wiidget.javaee.View;
import org.landa.wiidget.library.annotation.ContextVariable;
import org.landa.wiidget.parser.WiidgetLangProcessor;
import org.landa.wiidget.parser.WiidgetParserException;

/**
 * 
 * @author
 * 
 */
@org.landa.wiidget.javaee.scope.ViewScoped
public class LoginView extends View{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7227838179220223284L;
	
	public LoginView() {
	super();
	}

	@ContextVariable
	private String username;

	@ContextVariable
	private Integer count = 0;

	@Inject
	private Provider<WiidgetFactory> mywiidgetFactory;

	@Override
	protected WiidgetFactory getWiidgetFactory() {
		return mywiidgetFactory.get();
	}

	@Override
	public String render() {
		return super.render();
	}

	@Override
	public void init() {
		super.init();
		
		count++;
		
		renderAndWrite("/login/login.wdgt");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	

}
