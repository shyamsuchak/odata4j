package org.odata4j.core;

import java.util.List;

public interface OEntity {

    public abstract List<OProperty<?>> getProperties();
    public abstract OProperty<?> getProperty(String propName);
    public abstract <T> OProperty<T> getProperty(String propName, Class<T> propClass);
}