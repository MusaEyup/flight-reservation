package com.flightreservation.exception;

public class NoEmptySeatException extends RuntimeException{
    public NoEmptySeatException() {
        super();
    }

    public NoEmptySeatException(String message) {
        super(message);
    }
}
