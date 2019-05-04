package com.sartorilucas.lojavirtualudemy.resources.excepitons;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sartorilucas.lojavirtualudemy.services.excepitions.DataIntegrityExcepition;
import com.sartorilucas.lojavirtualudemy.services.excepitions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExcepitonHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DataIntegrityExcepition.class)
	public ResponseEntity<StandardError> objectIntegrity(DataIntegrityExcepition e, HttpServletRequest request) {
		StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}

}
