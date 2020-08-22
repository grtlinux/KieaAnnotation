package org.tain.object;

import org.tain.annotation.AbstractStream;
import org.tain.annotation.StreamAnnotation;

public class AuthorObject extends AbstractStream {

	@StreamAnnotation(length = 10)
	private String firstName = "Kiea";
	
	@StreamAnnotation(length = 10)
	private String lastName = "Kang";
	
	@StreamAnnotation(length = 5)
	private int age = 27;
}
