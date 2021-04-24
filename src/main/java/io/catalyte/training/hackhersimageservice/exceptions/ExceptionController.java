package io.catalyte.training.hackhersimageservice.exceptions;

import org.hibernate.JDBCException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static io.catalyte.training.hackhersimageservice.constants.StringConstants.*;


/**
 * A controller advice allows you to use exactly the same exception handling techniques but apply
 * them across the whole application, not just to an individual controller. You can think of them as
 * an annotation driven interceptor. More info: https://www.baeldung.com/exception-handling-for-rest-with-spring
 */
@ControllerAdvice
public class ExceptionController {

  private final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

  /**
   * Catch validation errors triggered by using @Valid on parameters in controllers
   *
   * @param ex : the validation exception generated by Spring
   * @return the ResponseEntity containing the validation exception list
   */
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Object> handleValidationExceptions(
      MethodArgumentNotValidException ex) {
    List<String> errors = new ArrayList<>();
    String method = ex.getParameter().getMethod().getName();
    String controller = ex.getParameter().getDeclaringClass().getSimpleName();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
      String errorMessage = error.getDefaultMessage();
      errors.add(errorMessage);
    });

    ValidationExceptionResponse response =
        new ValidationExceptionResponse(VALIDATION_ERROR, new Date(),
            "One or more validation errors occurred in:" + controller + " : " + method, errors);

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }

  /**
   * Triggered when the ResourceNotFound exception is thrown.
   *
   * @param exception the ResourceNotFound exception containing the custom message.
   * @return the ResponseEntity containing the custom exception and the status code 404
   */
  @ExceptionHandler(ResourceNotFound.class)
  protected ResponseEntity<ExceptionResponse> resourceNotFound(ResourceNotFound exception) {

    ExceptionResponse response =
        new ExceptionResponse(NOT_FOUND, new Date(), exception.getMessage());

    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }

  /**
   * Triggered when the BadDataResponse exception is thrown.
   *
   * @param exception - the BadDataResponse exception containing the custom message.
   * @return - the ResponseEntity containing the custom exception and the status code 400
   */
  @ExceptionHandler(BadDataResponse.class)
  protected ResponseEntity<ExceptionResponse> badDataResponse(BadDataResponse exception) {

    ExceptionResponse response =
        new ExceptionResponse(BAD_DATA, new Date(), exception.getMessage());

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }

  /**
   * Triggered when the BadDataResponse exception is thrown.
   *
   * @param exception - the BadDataResponse exception containing the custom message.
   * @return - the ResponseEntity containing the custom exception and the status code 400
   */
  @ExceptionHandler(UniqueFieldViolation.class)
  protected ResponseEntity<ExceptionResponse> uniqueFieldViolation(UniqueFieldViolation exception) {

    ExceptionResponse response =
        new ExceptionResponse(BAD_DATA, new Date(), exception.getMessage());

    return new ResponseEntity<>(response, HttpStatus.CONFLICT);
  }

  /**
   * Triggered when the ServiceUnavailable exception is thrown.
   *
   * @param ex the ServiceUnavailable exception containing the custom message.
   * @return the ResponseEntity containing the custom exception and the status code 503 or 500
   * depending on the cause of the exception
   */
  @ExceptionHandler(ServiceUnavailable.class)
  protected ResponseEntity<ExceptionResponse> serverError(ServiceUnavailable ex) {

    String exceptionMessage = ex.getMessage();
    ExceptionResponse response;
    // if it's a sql exception, get sql error and throw a 503
    if (ex.getCause() instanceof JDBCException) {
      exceptionMessage = ((JDBCException) ex.getCause()).getSQLException().getMessage();

      response = new ExceptionResponse(SERVER_ERROR, new Date(), exceptionMessage);
      logger.error(exceptionMessage);
      return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    } else //it's an unexpected error, throw a 500
    {
      exceptionMessage = "Error: " + exceptionMessage
          + "   Class: " + ex.getStackTrace()[0].getClassName()
          + "   Method: " + ex.getStackTrace()[0].getMethodName()
          + "   Line: " + ex.getStackTrace()[0].getLineNumber();
      response = new ExceptionResponse(UNEXPECTED_ERROR, new Date(), exceptionMessage);
      logger.error(exceptionMessage);
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }


}


