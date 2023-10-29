package assignment.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Execute {
	
	int Sequence() default 1;
}
