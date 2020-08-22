package org.tain.object;

public class SampleObject {

	private String title = null;
	
	public SampleObject(String title) {
		this.title = title;
	}
	
	public SampleObject() {
		this("No title");
	}
	
	public String method001(String str, int num, Integer value) {
		StringBuffer sb = new StringBuffer();
		
		sb.append(String.format("Title: %s%n", this.title));
		sb.append(String.format("String: %s%n", str));
		sb.append(String.format("int: %d%n", num));
		sb.append(String.format("Integer: %d%n", value));
		
		return sb.toString();
	}
}
