package customValidator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({FIELD})
@Constraint(validatedBy = DescValidator.class)
public @interface Desc {
	String message() default "Description has words which are not allowed";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
