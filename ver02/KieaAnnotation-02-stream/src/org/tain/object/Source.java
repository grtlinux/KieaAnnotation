package org.tain.object;

import java.lang.reflect.Field;

import org.tain.annotation.StreamAnnotation;

@SuppressWarnings("unused")
public class Source extends AbstractToString {

	@StreamAnnotation(length = 10)
	private String name = "Hello";
	
	private Info info = new Info();
	
	@StreamAnnotation(length = 10)
	private String title = "Hello title12345";
}
