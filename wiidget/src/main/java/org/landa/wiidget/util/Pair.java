package org.landa.wiidget.util;

public class Pair<T, V> {

	private T left;

	private V right;

	public Pair() {
		super();
	}

	public Pair(final T left, final V right) {
		super();
		this.left = left;
		this.right = right;
	}

	public T getLeft() {
		return left;
	}

	public void setLeft(final T left) {
		this.left = left;
	}

	public V getRight() {
		return right;
	}

	public void setRight(final V right) {
		this.right = right;
	}

}
