package io.catalyte.training.hackhersimageservice.constants;

/**
 * holds constants used throughout the project
 */
public class StringConstants {

  public static final String GENERATED_ID = "The database generated id";

  //status constants
  public static final String ID_NOT_FOUND = "The id of the path parameter does not exist in the database";
  public static final String BAD_REQUEST_IMAGE_NOT_FOUND = "The image does not exist in the database";
  public static final String SERVICE_UNAVAILABLE = "The database is not running, service is unavailable at the moment";
  public static final String UNEXPECTED_SERVER_ERROR = "An unexpected server error has occurred";
  public static final String NOT_FOUND = "Not Found";
  public static final String BAD_DATA = "Bad Data";
  public static final String SERVER_ERROR = "Server Error";
  public static final String UNEXPECTED_ERROR = "Unexpected Server Error";
  public static final String VALIDATION_ERROR = "Validation Error";

  //endpoint constants
  public static final String CONTEXT_IMAGES = "/images";
  public static final String ID_ENDPOINT = "/{id}";
  public static final Long FIRST_ID = 1L;

}
