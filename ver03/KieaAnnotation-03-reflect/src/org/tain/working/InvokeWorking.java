package org.tain.working;

import org.tain.object.SampleObject;

public class InvokeWorking {

	private static boolean flag = true;
	
	public static void testInvoke() {
		if (flag) {
			String ret = new SampleObject().method001("Hello, world..", 123, 1234567);
			System.out.println(">>>>> " + ret);
		}
	}
}
