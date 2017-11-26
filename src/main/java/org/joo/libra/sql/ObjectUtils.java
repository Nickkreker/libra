package org.joo.libra.sql;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

import lombok.NonNull;

public class ObjectUtils {
    
    private ObjectUtils() {
        
    }

    public static Object getValue(final Object obj, final @NonNull String variableName) throws ReflectiveOperationException {
        if (obj == null) return null;
        try {
            return PropertyUtils.getNestedProperty(obj, variableName);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw e;
        }
    }
}
