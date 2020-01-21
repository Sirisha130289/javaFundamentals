package be.intecbrussel.IceCreamShop.exception;

public class NoMoreIceCreamException extends Exception{
    public NoMoreIceCreamException() {
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(Throwable cause) {
        super(cause);
    }
}
