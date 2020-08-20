package org.tain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Inherited
//@Documented
@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	public enum Quality{BAD, GOOD, VERYGOOD}
	String value() default "-";
	int number() default 20;
	String[] language() default {};
	Quality quality() default Quality.GOOD;
}
