package org.tain.object;

import org.tain.annotation.AbstractStream;
import org.tain.annotation.StreamAnnotation;

public class BookObject extends AbstractStream {

	@StreamAnnotation(length = 10)
	private String title = "BOOK_This is a title";
	
	@StreamAnnotation(length = 10)
	private String subTitle = "Have a good time to YOU";
	
	@StreamAnnotation
	private PageObject pageObject = new PageObject();
	
	@StreamAnnotation(length = 10)
	private int pageSize = 1024;
	
	@StreamAnnotation
	private AuthorObject authorObject = new AuthorObject();
}
