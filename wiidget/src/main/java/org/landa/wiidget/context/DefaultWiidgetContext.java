package org.landa.wiidget.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.landa.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultWiidgetContext implements WiidgetContext {

    private final DataMap dataMap;

    public DefaultWiidgetContext() {
        this(new DataMap());
    }

    public DefaultWiidgetContext(final Map<String, Object> data) {
        this.dataMap = new DataMap(data);

        // refer to ownself
        set(CONTEXT_VARIABLE, this);
    }

    @Override
    public Object get(final String variable) {

        return dataMap.get(variable);
    }

    @Override
    public void set(final String variable, final Object value) {
        dataMap.put(variable, value);
    }

    @Override
    public void remove(final String variable) {
        dataMap.remove(variable);
    }

    @Override
    public boolean isSet(final String variable) {
        return dataMap.containsKey(variable);
    }

    @Override
    public void setAll(final Map<String, Object> data) {
        dataMap.putAll(data);
    }

    @Override
    public Map<String, Object> getAll() {
        return new HashMap<String, Object>(dataMap);
    }

    @Override
    public Set<String> getKeys() {
        return dataMap.keySet();
    }

}
