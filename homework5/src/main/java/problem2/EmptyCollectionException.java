package problem2;

public class EmptyCollectionException extends Exception{

  /**
   * excep if empty collection
   */
  public EmptyCollectionException(){
    super("Empty collection.");
  }

}
