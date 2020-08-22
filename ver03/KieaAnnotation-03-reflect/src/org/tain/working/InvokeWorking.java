package org.tain.working;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.tain.object.SampleObject;

public class InvokeWorking {

	private static boolean flag = true;
	
	public static void testInvoke() {
		if (flag) {
			String ret = new SampleObject().method001("Hello, world..", 123, 1234567);
			System.out.println("001 >>>>> " + ret);
		}
		
		if (flag) {
			try {
				Class<?> myClass = new SampleObject("ha ha ha").getClass();
				//Class<?> myClass = SampleObject.class;
				
				Class<?>[] myParam = new Class<?>[] { String.class, int.class, Integer.class };
				Method myMethod = myClass.getMethod("method001", myParam);
				
				Object[] myParamObject = new Object[] { "Hello, world..", 123, 1234567 };
				String ret = (String) myMethod.invoke(new SampleObject(), myParamObject);
				System.out.println("002 >>>>> " + ret);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			try {
				Class<?> myClass = Class.forName("org.tain.object.SampleObject");
				
				Constructor<?> myConstuctor = myClass.getConstructor( new Class[] { String.class });
				Object myObject = myConstuctor.newInstance("sample title");
				
				Class<?>[] myParam = new Class<?>[] { String.class, int.class, Integer.class };
				Method myMethod = myClass.getMethod("method001", myParam);
				
				Object[] myParamObject = new Object[] { "Hello, world..", 123, 1234567 };
				String ret = (String) myMethod.invoke(myObject, myParamObject);
				System.out.println("003 >>>>> " + ret);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			try {
				Class<?> myClass = Class.forName("org.tain.object.SampleObject");
				
				Constructor<?> myConstuctor = myClass.getConstructor( new Class[] { String.class });
				Object myObject = myConstuctor.newInstance("sample title");
				
				Field myField = myClass.getDeclaredField("title");
				myField.setAccessible(true);    // private일경우 secAccessible(true)로 해줘야 접근가능하다.
				myField.set(myObject, "Hello, Kiea.. This's a title.");
				String title = (String) myField.get(myObject);
				System.out.println("004 >>>>> title: " + title);
				
				Class<?>[] myParam = new Class<?>[] { String.class, int.class, Integer.class };
				Method myMethod = myClass.getMethod("method001", myParam);
				
				Object[] myParamObject = new Object[] { "Hello, world..", 123, 1234567 };
				String ret = (String) myMethod.invoke(myObject, myParamObject);
				System.out.println("004 >>>>> " + ret);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
