package org.landa.wiidget.library.template;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.annotation.DefaultField;
import org.landa.wiidget.validator.Required;

/**
 * 
 * @author lzsolt
 *
 */
public class Placeholder extends Wiidget {

	public static final String PLACEHOLDER_PREFIX = "{{";
	
	public static final String PLACEHOLDER_SUFFIX = "}}";
	
	
	@DefaultField
	@Required(message = "Placeholder name is required.")
	private String name;

	@Override
	public void run() {
		write(PLACEHOLDER_PREFIX + getName() + PLACEHOLDER_SUFFIX );
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
