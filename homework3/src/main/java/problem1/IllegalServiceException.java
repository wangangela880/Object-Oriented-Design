package problem1;

/**
 * Represents an exception dedicated towards an invalid destruction level.
 */
public class IllegalServiceException extends Exception{
  /**
   * Constructs a new IllegalServiceException object and initializes it with the given
   * message.
   *
   * @param message the message of this invalid destruction level exception.
   */
  public IllegalServiceException(String message) {
    super(message);
  }
}


