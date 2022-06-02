package problem1;

/**
 * This interface contains operations that all types of service in the system
 * should support.
 */
public interface IService {
  /**
   * Return the final price.
   *
   * @return the final price.
   */
  double calculatePrice() throws IllegalServiceException;
}
