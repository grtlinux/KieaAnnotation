package org.tain.object2;

import org.tain.annotation.StreamAnnotation;

public class _Info extends AbstractSetterGetter {

	@StreamAnnotation(length = 10)
	private String code1 = "ABCDE";
	
	@StreamAnnotation(length = 5)
	private String code2 = "1234";

	/////////////////////////////////////////////////
	
	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
}
