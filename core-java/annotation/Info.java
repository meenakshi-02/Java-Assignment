package assignment.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
	
	long AuthorID();

	String Author() default "Meenakshi";

	String Supervisor() default "Amit";

	String Date();

	String Time();

	double Version();

	String Description() default "Learning Annotation";
}
