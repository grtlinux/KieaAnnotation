package org.tain;

import org.tain.container.MyContextContainer;
import org.tain.object.MyObject;

public class KieaAnnotation01Main {

	private static boolean flag = true;

	public static void main(String[] args) throws Exception {
		if (flag) job01();
	}
	
	private static void job01() throws Exception {
		MyContextContainer demo = new MyContextContainer();
		MyObject myObject = demo.get(MyObject.class);
		
		System.out.println(">>>> " + myObject.getName());
		System.out.println(">>>> " + myObject.getDefaultValue());
		System.out.println(">>>> " + myObject.getInvalidType());
	}
}
