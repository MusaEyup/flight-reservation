package com.flightreservation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

    //handling EntityNotFoundException
    @ExceptionHandler
    public ResponseEntity<String> handleException(NoEmptySeatException exc) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
