package com.eazybytes.loans.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

/**
 * Handles MethodArgumentNotValidException by extracting field errors and their messages.
 *
 * This method overrides the default behavior to handle validation errors in method arguments.
 * It collects all validation errors from the exception, maps field names to their respective
 * validation messages, and returns them in the response body.
 *
 * @param ex The MethodArgumentNotValidException containing validation errors.
 * @param headers The HTTP headers of the request.
 * @param status The HTTP status code.
 * @param request The WebRequest instance.
 * @return A ResponseEntity containing a map of field names and error messages with HTTP status BAD_REQUEST.
 */

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, String> validationErrors = new HashMap<>();
        List<ObjectError> validationErrorList = ex.getBindingResult().getAllErrors();

        validationErrorList.forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String validationMsg = error.getDefaultMessage();
            validationErrors.put(fieldName, validationMsg);
        });
        return new ResponseEntity<>(validationErrors, HttpStatus.BAD_REQUEST);
    }

    /**
     * Handles any uncaught exceptions by returning a ResponseEntity with HTTP Status code as INTERNAL_SERVER_ERROR.
     * This method is a global exception handler that captures all exceptions not specifically handled elsewhere.
     * It constructs an ErrorResponseDto containing details about the error and returns it with a 500 status code.
     *
     * @param exception The exception that was thrown.
     * @param webRequest The WebRequest object that contains the request details.
     * @return A ResponseEntity containing an ErrorResponseDto object with HTTP status code INTERNAL_SERVER_ERROR.
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
 * Constructs an ErrorResponseDto with details about the error, including the request path, status code,
 * error message, and timestamp of the error.
 *
 * @param exception The ResourceNotFoundException object thrown from the service layer.
 * @param webRequest The WebRequest object that contains the request details.
 * @return A ResponseEntity containing an ErrorResponseDto object with HTTP status code NOT_FOUND.
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
     * Handles the LoanAlreadyExistsException by returning a ResponseEntity with HTTP Status code as BAD_REQUEST.
     * This method is an exception handler that captures LoanAlreadyExistsException and constructs an ErrorResponseDto
     * containing details about the error, including the request path, status code, error message, and timestamp of the error.
     *
     * @param exception The LoanAlreadyExistsException object thrown from the service layer.
     * @param webRequest The WebRequest object that contains the request details.
     * @return A ResponseEntity containing an ErrorResponseDto object with HTTP status code BAD_REQUEST.
     */
    @ExceptionHandler(LoanAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleLoanAlreadyExistsException(LoanAlreadyExistsException exception,
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
