package problem2;

/**
 *
 */
public interface Set {

  /**
   * @return
   */
  Set emptySet();

  /**
   * @return
   */
  Boolean isEmpty();

  /**
   * @param n
   * @return
   */
  Set add(Integer n);

  /**
   * @param n
   * @return
   */
  Boolean contains(Integer n);

  /**
   * @param n
   * @return
   */
  Set remove(Integer n);

  /**
   * @return
   */
  Integer size();

}
