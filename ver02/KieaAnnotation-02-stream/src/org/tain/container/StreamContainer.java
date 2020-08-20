package org.tain.container;

import java.lang.reflect.Field;

import org.tain.annotation.StreamAnnotation;

public class StreamContainer <T extends Object> {

	@SuppressWarnings("unchecked")
	public String get(T obj) throws IllegalArgumentException, IllegalAccessException {
		StringBuffer sb = new StringBuffer();
		
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			StreamAnnotation annotation = field.getAnnotation(StreamAnnotation.class);
			if (annotation != null) {
				int length = annotation.length();
				field.setAccessible(true);
				if (field.getType() == String.class) {
					sb.append(String.format("%-" + length + "." + length + "s", field.get(obj)));
				} else if (field.getType() == Integer.class) {
					sb.append(String.format("%-" + length + "." + length + "d", field.get(obj)));
				} else if (field.getType() == Long.class) {
					sb.append(String.format("%-" + length + "." + length + "d", field.get(obj)));
				} else {
					//String ret = this.get((T)field.get(obj));
				}
			} else {
				this.get((T)field.get(obj));
			}
		}
		
		return sb.toString();
	}
	
	@SuppressWarnings("hiding")
	@Deprecated
	private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
		Field[] fields = instance.getClass().getDeclaredFields();
		for (Field field : fields) {
			StreamAnnotation streamAnnotation = field.getAnnotation(StreamAnnotation.class);
			if (streamAnnotation != null && field.getType() == String.class) {
				field.setAccessible(true);
				field.set(instance, streamAnnotation.value());
			}
		}
		return instance;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes", "hiding" })
	@Deprecated
	public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
		T instance = (T) clazz.newInstance();
		instance = invokeAnnotations(instance);
		return instance;
	}
}
