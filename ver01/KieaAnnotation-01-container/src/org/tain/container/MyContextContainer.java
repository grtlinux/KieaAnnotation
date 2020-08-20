package org.tain.container;

import java.lang.reflect.Field;

import org.tain.annotation.StringInjector;

public class MyContextContainer {

	public MyContextContainer() {}
	
	private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
		Field[] fields = instance.getClass().getDeclaredFields();
		for (Field field : fields) {
			StringInjector stringInjector = field.getAnnotation(StringInjector.class);
			if (stringInjector != null && field.getType() == String.class) {
				field.setAccessible(true);
				field.set(instance, stringInjector.value());
			}
		}
		return instance;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	//@Deprecated
	public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
		T instance = (T) clazz.newInstance();
		instance = invokeAnnotations(instance);
		return instance;
	}
}
