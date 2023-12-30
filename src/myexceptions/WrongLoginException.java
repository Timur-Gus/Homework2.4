package myexceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String massage) {
        super(massage);
    }
}
