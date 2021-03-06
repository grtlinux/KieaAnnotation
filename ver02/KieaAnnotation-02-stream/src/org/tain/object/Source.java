package org.tain.object;

import org.tain.annotation.StreamAnnotation;

public class Source extends AbstractToString {

	@StreamAnnotation(length = 10)
	private String name = "Hello";
	
	private Info info = new Info();
	
	@StreamAnnotation(length = 5)
	private String title = "Hello title12345";

	/////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
