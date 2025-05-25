package level2.exercise1.exception;

public class CountryNotSupporterException extends RuntimeException {
    public CountryNotSupporterException(String message) {
        super(message);
    }
}
