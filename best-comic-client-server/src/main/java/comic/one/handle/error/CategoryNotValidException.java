package comic.one.handle.error;

@SuppressWarnings("serial")
public class CategoryNotValidException extends RuntimeException {
	CategoryNotValidException() {
		super("Category Error");
	}
}
