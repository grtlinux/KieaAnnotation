package org.tain.object;

import org.tain.annotation.StreamAnnotation;

public class ToString extends AbstractToString {

	@StreamAnnotation(length = 10)
	private String code1 = "ABCDE";
	
	@StreamAnnotation(length = 10)
	private String code2 = "1234";
	
	@SuppressWarnings("unused")
	private Info info = new Info();
}
