package problem2;

public class ItemAlreadyInException extends Exception{

  /**
   * except if item is already present
   */
  public ItemAlreadyInException(){
    super("Item already exist.");
  }

}
