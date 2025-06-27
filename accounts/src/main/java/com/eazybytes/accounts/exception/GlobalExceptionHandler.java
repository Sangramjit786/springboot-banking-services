package com.eazybytes.accounts.exception;

import com.eazybytes.accounts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles any unexpected exceptions that are not handled by other exception handlers.
     * @param exception The exception that was thrown.
     * @param webRequest The WebRequest object that contains the request details.
     * @return A ResponseEntity containing an ErrorResponseDto object with the HTTP status code
     *         set to INTERNAL_SERVER_ERROR and a message indicating an unexpected error occurred.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalException(Exception exception,
                                                                  WebRequest webRequest) {
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Handles the ResourceNotFoundException by returning a ResponseEntity with HTTP Status code as NOT_FOUND.
     * The ErrorResponseDto object is created with the exception message and other details, which are then passed
     * to the ResponseEntity.
     *
     * @param exception The ResourceNotFoundException object thrown from the service layer.
     * @param webRequest The WebRequest object that contains the request details.
     * @return ResponseEntity with HTTP Status code as NOT_FOUND and ErrorResponseDto object as body.
     */

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                            WebRequest webRequest) {
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

    /**
     * This method handles the CustomerAlreadyExistsException by returning a ResponseEntity with HTTP Status code as BAD_REQUEST.
     * The ErrorResponseDto object is created with the exception message and other details which are then passed to the ResponseEntity.
     *
     * @param exception The CustomerAlreadyExistsException object thrown from the service layer.
     * @param webRequest The WebRequest object that contains the request details.
     * @return ResponseEntity with HTTP Status code as BAD_REQUEST and ErrorResponseDto object as body.
     */
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception,
                                                                                 WebRequest webRequest){
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
    }

}
