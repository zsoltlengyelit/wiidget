package org.landa.wiidget.parser.control;

public class ForeachControl {

	private final String variable;

	private final Iterable<?> iterable;

	public ForeachControl(String variable, Iterable<?> iterable) {
		super();
		this.variable = variable;
		this.iterable = iterable;
	}

	public String getVariable() {
		return variable;
	}

	public Iterable<?> getIterable() {
		return iterable;
	}

}
