package org.tain.object;

import org.tain.annotation.AbstractStream;
import org.tain.annotation.StreamAnnotation;

public class Book extends AbstractStream {

	@StreamAnnotation(length = 10)
	private String title;
	
	@StreamAnnotation(length = 10)
	private String subTitle;
	
	@StreamAnnotation
	private Page page = new Page();
	
	@StreamAnnotation(length = 10)
	private int pageSize;
	
	@StreamAnnotation(length = 10)
	private String author;
}
