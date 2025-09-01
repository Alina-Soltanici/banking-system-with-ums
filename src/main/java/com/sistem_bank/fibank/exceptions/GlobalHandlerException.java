package com.sistem_bank.fibank.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<?> handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) {
        Map<String, Object> errorMap = new HashMap<> ();
        errorMap.put ("timestamp", LocalDateTime.now ());
        errorMap.put ("status", HttpStatus.BAD_REQUEST.value ());
        errorMap.put ("error", "Bad Request");
        errorMap.put ("message", userAlreadyExistsException.getMessage ());
        return new ResponseEntity<> (errorMap, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RoleNotFoundException.class)
    public ResponseEntity<?> handleRoleNotFoundException(RoleNotFoundException roleNotFoundException){
        Map<String, Object> errorMap = new HashMap<> ();
        errorMap.put ("timestamp", LocalDateTime.now ());
        errorMap.put ("status", HttpStatus.NOT_FOUND.value ());
        errorMap.put ("error", "Not found");
        errorMap.put ("message", roleNotFoundException.getMessage ());
        return new ResponseEntity<> (errorMap, HttpStatus.NOT_FOUND);
    }
}
