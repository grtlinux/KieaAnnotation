package org.tain;

import org.tain.working.BookWorking;
import org.tain.working.ReflectWorking;

public class KieaAnnotation04Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (flag) job01();  // reflect
		if (flag) job02();  // Book and Page
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job01() {
		if (flag) ReflectWorking.test001();
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job02() {
		if (flag) BookWorking.test001();
	}
}
