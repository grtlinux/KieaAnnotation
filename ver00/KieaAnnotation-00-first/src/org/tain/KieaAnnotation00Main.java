package org.tain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.tain.annotation.PrintAnnotation;
import org.tain.object.PrintObject;

public class KieaAnnotation00Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (flag) job01();
	}
	
	private static void job01() throws Exception {
		Field[] fields = PrintObject.class.getDeclaredFields();
		Method[] methods = PrintObject.class.getDeclaredMethods();
		
		for (Field field : fields) {
			System.out.println("FIELD: " + field.getName());
		}
		
		for (Method method: methods) {
			System.out.println("DMETHOD: " + method.getName());
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + method.getName() + "]");
				for (int i=0; i < printAnnotation.number(); i++)
					System.out.print(printAnnotation.value());
				System.out.println();
				String[] lang = printAnnotation.language();
				System.out.println("LANG: " + Arrays.asList(lang));
				System.out.println("QUALITY: " + printAnnotation.quality());
				method.invoke(new PrintObject());
			} else {
				System.out.println(".....");
			}
			System.out.println();
		}
	}
}
