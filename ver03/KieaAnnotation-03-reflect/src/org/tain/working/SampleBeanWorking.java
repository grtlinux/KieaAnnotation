package org.tain.working;

import java.lang.reflect.Field;

import org.tain.bean.SampleBean;

public class SampleBeanWorking {

	private static boolean flag = true;
	
	public static void testRefelct() {
		if (flag) {
			try {
				SampleBean bean = new SampleBean();
				Class<?> cls = bean.getClass();
				// public  <--
				//for (Field field : cls.getDeclaredFields()) {
				//	field.setAccessible(true);
				//}
				//cls.getDeclaredField("name").set(bean, "this's outter name.");
				//cls.getDeclaredField("age").setInt(bean,  27);
				
				Field fieldName = cls.getDeclaredField("name");
				fieldName.setAccessible(true);
				fieldName.set(bean, "this's outter name.");
				
				Field fieldAge = cls.getDeclaredField("age");
				fieldAge.setAccessible(true);
				fieldAge.setInt(bean, 27);
				
				SampleBean innerBean = new SampleBean();
				innerBean.setName("this's inner name.");
				innerBean.setAge(17);
				
				Field fieldBean = cls.getDeclaredField("innerBean");
				fieldBean.setAccessible(true);
				fieldBean.set(bean, innerBean);
				
				System.out.println("001-1 >>>>> " + bean.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			try {
				SampleBean bean = new SampleBean();
				Class<?> cls = bean.getClass();
				//
				Field fieldName = cls.getDeclaredField("name");
				fieldName.setAccessible(true);
				fieldName.set(bean, "this's outter name.");
				String name = (String) fieldName.get(bean);
				
				Field fieldAge = cls.getDeclaredField("age");
				fieldAge.setAccessible(true);
				fieldAge.setInt(bean, 27);
				int age = (int) fieldAge.get(bean);
				
				SampleBean innerBean = new SampleBean();
				innerBean.setName("this's inner name.");
				innerBean.setAge(17);
				
				Field fieldBean = cls.getDeclaredField("innerBean");
				fieldBean.setAccessible(true);
				fieldBean.set(bean, innerBean);
				SampleBean bean2 = (SampleBean) fieldBean.get(bean);
				
				System.out.println("002-1 >>>>> outter: " + name + ", " + age);
				System.out.println("002-2 >>>>> inner: " + bean2.getName() + ", " + bean2.getAge());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
