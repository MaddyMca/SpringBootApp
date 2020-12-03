package customValidator;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.tqdp.demo.service.OffenciveWordsServices;

public class DescValidator implements ConstraintValidator<Desc, String> {
	List<String> wd = new OffenciveWordsServices().getAllWords();

	@Override
	public void initialize(Desc constraintAnnotation) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		for (String i : wd) {
			System.out.println(i);
			if (value.contains(i))

				return false;
		}
		return true;
	}

}
