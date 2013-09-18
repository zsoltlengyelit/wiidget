package org.landa.wiidget.ninja;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import ninja.Context;
import ninja.i18n.Messages;

import com.google.common.base.Optional;

public class WiidgetMessages implements Map<String, String> {

	private final Messages messages;
	private final Context context;

	public WiidgetMessages(final Messages messages, final Context context) {
		this.messages = messages;
		this.context = context;
	}

	@Override
	public void clear() {

	}

	public Optional<String> getLanguage() {

		return Optional.of(context.getAcceptLanguage());
	}

	@Override
	public boolean containsKey(final Object key) {

		return get(key) != null;
	}

	@Override
	public boolean containsValue(final Object arg0) {
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {

		return null;
	}

	@Override
	public String get(final Object arg0) {
		// TODO Auto-generated method stub
		return messages.get(arg0.toString(), getLanguage()).get();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String put(final String arg0, final String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(final Map<? extends String, ? extends String> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String remove(final Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
