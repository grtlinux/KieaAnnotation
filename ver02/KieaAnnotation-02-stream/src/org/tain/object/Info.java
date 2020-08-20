package org.tain.object;

import java.lang.reflect.Field;

import org.tain.annotation.StreamAnnotation;

public class Info {

	@StreamAnnotation(length = 10)
	private String code1 = "ABCDE";
	
	@StreamAnnotation(length = 10)
	private String code2 = "1234";
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field : fields) {
				StreamAnnotation annotation = field.getAnnotation(StreamAnnotation.class);
				if (annotation != null) {
					int length = annotation.length();
					field.setAccessible(true);
					
					if (field.getType() == String.class) {
						sb.append(String.format("%-" + length + "." + length + "s", field.get(this)));
					} else {
						sb.append(field.get(this));
					}
				}
			}
		} catch (Exception e) {
		}
		
		return sb.toString();
	}
}
