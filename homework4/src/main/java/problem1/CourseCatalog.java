package problem1;

public interface CourseCatalog {

  /**
   * @param c
   */
  void append(Course c);

  /**
   * @param c
   * @throws CourseNotFoundException
   */
  void remove(Course c) throws CourseNotFoundException;

  /**
   * @param c
   * @return
   */
  boolean contains(Course c);

  /**
   * @param c
   * @return
   */
  int indexOf(Course c);

  /**
   * @return
   */
  int count();

  /**
   * @param c
   * @return
   * @throws InvalidIndexException
   */
  Course get(int c) throws InvalidIndexException;

  /**
   * @return
   */
  boolean isEmpty();

}
