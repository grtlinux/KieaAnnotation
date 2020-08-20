package org.tain.object;

import java.lang.reflect.Field;

import org.tain.annotation.StreamAnnotation;

@SuppressWarnings("unused")
public class Source {

	@StreamAnnotation(length = 10)
	private String name = "Hello";
	
	private Info info = new Info();
	
	@StreamAnnotation(length = 10)
	private String title = "Hello title12345";
	
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
						sb.append(String.format("%-" + length + "." + length + "s", field.get(this).toString()));
					//} else {
					//	sb.append(field.get(this));
					}
				} else {
					sb.append(field.get(this).toString());
				}
			}
		} catch (Exception e) {
		}
		
		return sb.toString();
	}
}
