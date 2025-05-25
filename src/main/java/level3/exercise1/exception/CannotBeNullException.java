package level3.exercise1.exception;

public class CannotBeNullException extends RuntimeException {
    public CannotBeNullException(String message) {
        super(message);
    }
}
