package org.tain.working;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.tain.annotation.SubString;
import org.tain.object.Book;
import org.tain.object.Page;

public class ReflectWorking {

	private static boolean flag = true;
	
	public static void test001() {
		if (!flag) {
			try {
				//Page page = new Page(); Class<?> cls = page.getClass();
				//Class<?> cls = Class.forName("org.tain.object.Page");
				Class<?> cls = Page.class;
				
				Field[] fields = cls.getDeclaredFields();
				for (Field field : fields) {
					System.out.println("001-01: Field: " + field.getName());
				}
				
				//Method[] methods = cls.getDeclaredMethods();
				Method[] methods = cls.getMethods();  // include inherited class
				for (Method method : methods) {
					System.out.println("001-01: Method: " + method.getName());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (!flag) {
			try {
				Page page = new Page();
				
				Class<?> cls = page.getClass();
				
				Field field;
				field = cls.getDeclaredField("pageNo");
				field.setAccessible(true);
				field.setInt(page, 123);
				
				field = cls.getDeclaredField("content");
				field.setAccessible(true);
				field.set(page, "Hello, world... this's a content");
				
				field = cls.getDeclaredField("date");
				field.setAccessible(true);
				field.set(page, "2020-08-22");
				
				Method method = cls.getMethod("getStream");
				String ret = (String) method.invoke(page);
				System.out.println(">>>>> [" + ret + "]");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			try {
				Book book = new Book();
				
				Class<?> cls = book.getClass();
				
				Field field;
				field = cls.getDeclaredField("title");
				field.setAccessible(true);
				field.set(book, "book title");
				
				field = cls.getDeclaredField("subTitle");
				field.setAccessible(true);
				field.set(book, "Hello, world... this's a content");
				
				field = cls.getDeclaredField("page");
				field.setAccessible(true);
				field.set(book, new Page());
				
				field = cls.getDeclaredField("pageSize");
				field.setAccessible(true);
				field.setInt(book, 1024);
				
				field = cls.getDeclaredField("author");
				field.setAccessible(true);
				field.set(book, "Kiea");
				
				Method method = cls.getMethod("getStream");
				String ret = (String) method.invoke(book);
				System.out.println(">>>>> [" + ret + "]");
				// [book title|Hello, wor|      2048|this's a p|2020-08-22|      1024|Kiea      |]
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void test002() {
		if (flag) {
			try {
				String data = "book titleHello, wor      2048this's a p2020-08-22      1024Kiea      ";
				SubString subString = new SubString(data);
				
				Book book = new Book();
				book.setStream(subString);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
