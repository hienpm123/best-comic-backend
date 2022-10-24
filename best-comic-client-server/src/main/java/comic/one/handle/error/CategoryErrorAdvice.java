package comic.one.handle.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CategoryErrorAdvice {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CategoryNotValidException.class)
	String CategoryHandleValidationExceptions(CategoryNotValidException ex)
	{
		return ex.getMessage();
	}
}
