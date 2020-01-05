package be.intecbrussel.exceptionsChapter12.exercises.ex6;

public class ex6NegativeSizeException extends IllegalArgumentException {
    public ex6NegativeSizeException() {
        super();
    }

    public ex6NegativeSizeException(String s) {
        super(s);
    }

    public ex6NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ex6NegativeSizeException(Throwable cause) {
        super(cause);
    }
}
