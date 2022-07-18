package com.ifernandez.dev.test.ProductsApi.exceptionHandler;

import com.ifernandez.dev.test.products.model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.format.DateTimeParseException;

@ControllerAdvice
public class exceptionHandlerResponse {
    Product result;

    private static final Logger logger = LogManager.getLogger(exceptionHandlerResponse.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Product> runtimeException(RuntimeException e) {
        result = new Product();
        logger.error(e.getMessage());
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Product> exception(Exception e) {
        result = new Product();
        logger.error(e.getMessage());
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<Product> indexOutOfBoundsException(IndexOutOfBoundsException e) {
        result = new Product();
        logger.error(e.getMessage());
        return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DateTimeParseException.class)
    public ResponseEntity<Product> DateTimeParseException(DateTimeParseException e) {
        result = new Product();
        logger.error(e.getMessage());
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }
}
