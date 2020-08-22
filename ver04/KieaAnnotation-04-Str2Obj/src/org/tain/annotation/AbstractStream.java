package org.tain.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class AbstractStream {

	private static boolean flag = true;
	
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	
	public String getStream() {
		StringBuffer sb = new StringBuffer();
		
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				if (flag) System.out.println("FIELD: " + field.getName());
				field.setAccessible(true);
				StreamAnnotation annotation = field.getAnnotation(StreamAnnotation.class);
				if (annotation != null) {
					int length = annotation.length();
					
					Class<?> type = field.getType();
					if (type == String.class) {
						if (flag) System.out.println("\tString: " + field.get(this));
						sb.append(String.format("%-" + length + "." + length + "s", (String) field.get(this)));
					} else if (type == int.class) {
						if (flag) System.out.println("\tint: " + field.get(this));
						sb.append(String.format("%" + length + "d", (int) field.get(this)));
					} else {
						Object object = field.get(this);
						Class<?> cls = object.getClass();
						if (flag) System.out.println("\tCLASS: " + cls.getName());
						
						Method method = cls.getMethod("getStream");
						sb.append(method.invoke(object));
					}
				} else {
					// sb.append(field.get(this).toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	
	public SubString setStream(SubString subString) {
		
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				if (flag) System.out.println("FIELD: " + field.getName());
				field.setAccessible(true);
				StreamAnnotation annotation = field.getAnnotation(StreamAnnotation.class);
				if (annotation != null) {
					int length = annotation.length();
					
					Class<?> type = field.getType();
					if (type == String.class) {
						String value = subString.get(length).trim();
						if (flag) System.out.printf("\tString: [%s][%s]\n", field.getName(), value);
						field.set(this, value);
					} else if (type == int.class) {
						int value = Integer.parseInt(subString.get(length).trim());
						if (flag) System.out.printf("\tint: [%s][%d]\n", field.getName(), value);
						field.setInt(this, value);
					} else {
						Object object = field.get(this);
						Class<?> cls = object.getClass();
						if (flag) System.out.println("\tCLASS: " + cls.getName());
						
						Class<?>[] param = new Class<?>[] { SubString.class };
						Method method = cls.getMethod("setStream", param);
						
						Object[] paramObject = new Object[] { subString };
						subString = (SubString) method.invoke(object, paramObject);
						
					}
				} else {
					// sb.append(field.get(this).toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return subString;
	}
}
