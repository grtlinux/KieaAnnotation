package org.tain;

import org.tain.working.InvokeWorking;
import org.tain.working.SampleBeanWorking;

public class KieaAnnotation03Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (!flag) job01();
		if (flag) job02();
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job01() {
		if (flag) InvokeWorking.testInvoke();
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job02() {
		if (flag) SampleBeanWorking.testRefelct();
	}
}
