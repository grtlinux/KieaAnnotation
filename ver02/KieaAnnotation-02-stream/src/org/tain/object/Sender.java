package org.tain.object;

import org.tain.annotation.StreamAnnotation;

public class Sender {

	@StreamAnnotation(length = 10)
	private String name;
	
	@StreamAnnotation(length = 20)
	private String title;
	
	@StreamAnnotation(length = 30)
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
