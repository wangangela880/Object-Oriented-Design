package problem2;

/**
 * ADT representing the methods to be implemented by a Set object
 */
public interface ISet {

    /**
     * Returns an empty Set
     * @return (ISet), an EmptySet object
     */
    ISet emptySet();

    /**
     * Returns whether the Set is empty
     * @return (Boolean), indicating whether the Set object is empty
     */
    Boolean isEmpty();

    /**
     * Returns a new Set with the added Integer
     *      if the Integer is not already in the Set
     * @param n, (Integer), the Integer to be added
     * @return (ISet), a Set object containing the new Integer if not already in Set
     */
    ISet add(Integer n);

    /**
     * Indicates whether the specified Integer is contained in the Set
     * @param n, (Integer), the Integer to search for in the Set
     * @return (Boolean), indicating
     */
    Boolean contains(Integer n);

    /**
     * Returns a Set object with the specified Integer removed, if it was present
     * @param n, (Integer), the Integer to be removed
     * @return (ISet), a Set with the specified Integer n removed, if it was present
     */
    ISet remove(Integer n);

    /**
     * Returns the size of the Set
     * @return (Integer), representing the size of the Set
     */
    Integer size();
}
