package org.tain.object;

import org.tain.annotation.AbstractStream;
import org.tain.annotation.StreamAnnotation;

public class TipObject extends AbstractStream {

	@StreamAnnotation(length = 10)
	private String division = "TIP01";
	
	@StreamAnnotation(length = 10)
	private String content = "Tip's content is for your health.";
	
	@StreamAnnotation(length = 5)
	private int depth = 3;
}
