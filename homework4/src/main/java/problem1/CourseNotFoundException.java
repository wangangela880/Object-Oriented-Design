package problem1;

public class CourseNotFoundException extends Exception {

  /**
   * exception
   */
  public CourseNotFoundException() {
    super("We could not find the course");
  }

}
