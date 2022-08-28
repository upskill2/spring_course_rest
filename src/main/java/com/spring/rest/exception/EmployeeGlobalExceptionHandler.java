package com.spring.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmpNotFoundInfo> hadleException(EmployeeException employeeException) {
        EmpNotFoundInfo response = new EmpNotFoundInfo();
        response.setInfo(employeeException.getMessage());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<EmpNotFoundInfo> hadleException(Exception employeeException) {
        EmpNotFoundInfo response = new EmpNotFoundInfo();
        response.setInfo(employeeException.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }
}
