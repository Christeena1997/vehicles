package com.vehicles.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vehicles.exception.InvalidMileageException;
import com.vehicles.exception.InvalidSeatsException;
import com.vehicles.exception.InvalidStateException;
import com.vehicles.exception.TypeNotValidException;
import com.vehicles.idnotexception.IdNotFoundException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(TypeNotValidException.class)
	public ResponseEntity<Object> globalHanding() {
		return new ResponseEntity<>("This is not a proper type bus", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidStateException.class)
	public ResponseEntity<Object> globalHandingstate() {
		return new ResponseEntity<>("This is not a proper state bus", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidMileageException.class)
	public ResponseEntity<Object> globalHandingMileage() {
		return new ResponseEntity<>("invalid mileage exception", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidSeatsException.class)
	public ResponseEntity<Object> globalHandingseats(Exception e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

//		return new ResponseEntity<>("invalid Seats exception", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> globalHandingid() {
		return new ResponseEntity<>("invalid id exception", HttpStatus.BAD_REQUEST);
	}
}
