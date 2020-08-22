package org.tain.object2;

public class SubString {

	private String strStream = null;
	private int offset = 0;
	
	public SubString(String strStream) {
		this.strStream = strStream;
		this.offset = 0;
	}
	
	public String get(int size) {
		String ret = this.strStream.substring(this.offset, size);
		this.offset += size;
		return ret;
	}
}
