package org.tain;

import org.tain.working.BookObjectWorking;
import org.tain.working.ReflectWorking;

public class KieaAnnotation04Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (!flag) job01();  // reflect
		if (flag) job02();  // BookObject and PageObject
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job01() {
		if (!flag) ReflectWorking.test001();
		if (flag) ReflectWorking.test002();
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job02() {
		if (flag) BookObjectWorking.test001();
	}
}
