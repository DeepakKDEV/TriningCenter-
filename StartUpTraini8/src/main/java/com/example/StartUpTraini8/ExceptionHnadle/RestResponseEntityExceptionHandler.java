package com.example.StartUpTraini8.ExceptionHnadle;

import com.example.StartUpTraini8.Model.ErrorMessage.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException .class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException exception){
        ErrorMessage  errorMessage=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
        return  errorMessage;
    }

    @ExceptionHandler(RuntimeException .class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericException(RuntimeException exception){
        ErrorMessage  errorMessage=new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
        return  errorMessage;
    }

}
