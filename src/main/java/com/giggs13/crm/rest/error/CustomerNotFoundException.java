package com.giggs13.crm.rest.error;

public class CustomerNotFoundException
        extends RuntimeException {

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(int id) {
        super("Customer id not found - " + id);
    }

    public CustomerNotFoundException(String message,
                                     Throwable cause) {
        super(message, cause);
    }

    public CustomerNotFoundException(Throwable cause) {
        super(cause);
    }
}
