package main.java.exceptions;

public class DelUserAtualException extends Exception {

    /**
     * Creates a new instance of <code>DelUserAtualException</code> without
     * detail message.
     */
    public DelUserAtualException() {
    }

    /**
     * Constructs an instance of <code>DelUserAtualException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DelUserAtualException(String msg) {
        super(msg);
    }
}
