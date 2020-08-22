package org.tain.object2;

import java.lang.reflect.Field;

import org.tain.annotation.StreamAnnotation;

public abstract class AbstractSetterGetter {

	public String get() {
		StringBuffer sb = new StringBuffer();
		
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				StreamAnnotation streamAnnotation = field.getAnnotation(StreamAnnotation.class);
				if (streamAnnotation != null) {
					int length = streamAnnotation.length();
					
					if (field.getType() == String.class) {
						String value = (String) field.get(this);
						if (value == null) value = "";
						sb.append(String.format("%-" + length + "." + length + "s", value));
					} else if (field.getType() == AbstractSetterGetter.class) {
						//System.out.println(">>>>> AbstractSetterGetter.class");
						//sb.append(field.get(this));
					} else {
						sb.append(field.get(this));
					}
				} else {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	public void set(SubString subString) {
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				StreamAnnotation streamAnnotation = field.getAnnotation(StreamAnnotation.class);
				if (streamAnnotation != null) {
					int length = streamAnnotation.length();
					
					if (field.getType() == String.class) {
						String value = subString.get(length).trim();
						field.set(this, value);
					} else if (field.getType() == AbstractSetterGetter.class) {
						//System.out.println(">>>>> AbstractSetterGetter.class");
						//sb.append(field.get(this));
					} else {
						field.set(this, subString);
					}
				} else {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				StreamAnnotation annotation = field.getAnnotation(StreamAnnotation.class);
				if (annotation != null) {
					int length = annotation.length();
					
					if (field.getType() == String.class) {
						String value = (String) field.get(this);
						if (value == null) value = "";
						sb.append(String.format("%-" + length + "." + length + "s", value));
					} else {
						sb.append(field.get(this).toString());
					}
				} else {
					// sb.append(field.get(this));
				}
			}
		} catch (Exception e) {
		}
		
		return sb.toString();
	}
}
