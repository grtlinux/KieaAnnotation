package org.tain.annotation;

// to NIO
public class SubString {

	private static boolean flag = true;
	
	private String strStream = null;
	private int offset = 0;
	
	public SubString(String strStream) {
		this.strStream = strStream;
		this.offset = 0;
	}
	
	public String get(int size) {
		String ret = this.strStream.substring(this.offset, this.offset + size);
		if (flag) System.out.printf("SubString >>>>> [%3d:%3d][%s]\n", this.offset, size, ret);
		this.offset += size;
		return ret;
	}
}
