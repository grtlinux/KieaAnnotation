package org.tain.object;

import org.tain.annotation.PrintAnnotation;
import org.tain.annotation.PrintAnnotation.Quality;

public class PrintObject {

	@PrintAnnotation
	private String name1;
	
	@PrintAnnotation
	private String name2 = "Hello name2";
	
	@PrintAnnotation
	private String name3;
	
	@PrintAnnotation
	private long id = 12345L;
	
	@PrintAnnotation
	private String name4;
	
	@PrintAnnotation
	private String name5;
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println(">>>>> method2....");
	}
	
	@PrintAnnotation(value = "*", number = 10, quality = Quality.VERYGOOD)
	public void method3() {
		System.out.println(">>>>> method3....");
	}
	
	@PrintAnnotation(language = {"java", "c++", "python"})
	public void method1() {
		System.out.println(">>>>> method1....");
	}
}
