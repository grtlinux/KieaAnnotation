package org.tain.object;

import org.tain.annotation.AbstractStream;
import org.tain.annotation.StreamAnnotation;

public class Page extends AbstractStream {

	@StreamAnnotation(length = 10)
	private int pageNo = 2048;
	
	@StreamAnnotation(length = 10)
	private String content = "this's a page content.";
	
	@StreamAnnotation(length = 10)
	private String date = "2020-08-22";
}
