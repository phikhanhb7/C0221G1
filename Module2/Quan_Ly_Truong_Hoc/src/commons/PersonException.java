package commons;

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
