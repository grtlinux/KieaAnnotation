package org.tain.object2;

import org.tain.annotation.StreamAnnotation;

public class _Source extends AbstractSetterGetter {

	@StreamAnnotation(length = 10)
	private String name = "Hello";
	
	@StreamAnnotation
	private _Info info = new _Info();
	
	@StreamAnnotation(length = 5)
	private String title = "Hello title12345";

	/////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public _Info getInfo() {
		return info;
	}

	public void setInfo(_Info info) {
		this.info = info;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
