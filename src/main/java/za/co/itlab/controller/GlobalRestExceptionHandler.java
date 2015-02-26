package za.co.itlab.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import za.co.itlab.dto.CardUsageResponse;

@ControllerAdvice
public class GlobalRestExceptionHandler {
	
    @ExceptionHandler(Exception.class) 
    public @ResponseBody CardUsageResponse handleBadInput(Exception ex) {
    	CardUsageResponse cardUsageResponse = new CardUsageResponse();
    	cardUsageResponse.setErrorMsg("Invalid Request");
        return cardUsageResponse;
    }

}
