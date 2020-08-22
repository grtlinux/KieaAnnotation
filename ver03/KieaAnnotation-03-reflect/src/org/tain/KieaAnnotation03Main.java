package org.tain;

import org.tain.working.InvokeWorking;

public class KieaAnnotation03Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (flag) job01();
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job01() {
		if (flag) InvokeWorking.testInvoke();
	}
}
