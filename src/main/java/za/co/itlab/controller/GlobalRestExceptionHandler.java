package za.co.itlab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalRestExceptionHandler {
	
    @ExceptionHandler(Exception.class) 
    public ResponseEntity handleBadInput(Exception ex) {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
