package com.fd.javabase.exception;

public class ViewException extends RuntimeException {
    public ViewException() {
    }

    public ViewException(String message) {
        super(message);
    }

    public ViewException(String message, Throwable cause) {
        super(message, cause);
    }
}
