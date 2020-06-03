package com.revature.tourofheroes.exceptions;

public class InvalidHealthValueException extends RuntimeException {

    /**
     *
     * @param error
     */
    public InvalidHealthValueException(String error) {
        super(error);
    }
}
