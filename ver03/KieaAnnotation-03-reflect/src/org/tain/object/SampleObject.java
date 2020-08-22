package org.tain.object;

public class SampleObject {

	public String method001(String str, int num, Integer value) {
		StringBuffer sb = new StringBuffer();
		
		sb.append(String.format("String: %s%n", str));
		sb.append(String.format("int: %d%n", num));
		sb.append(String.format("Integer: %d%n", value));
		
		return sb.toString();
	}
}
