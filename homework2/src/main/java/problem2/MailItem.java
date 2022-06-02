package problem2;
/**
 *  Class MailItem
 *  A width in inches, an integer greater than or equal to 1.
 *  A height in inches, an integer greater than or equal to 1.
 *  A depth in inches, an integer greater than or equal to 1.
 *
 */
public class MailItem {
  private double Width;
  private double Height;
  private double Depth;
  private Recipient recipient;
  /**
   * Constructs a new Room object
   *
   * @param max_width -width,encoded as an integer
   * @param max_height- height name,encoded as an integer
   * @param max_depth - depth,encoded as an integer
   */
  public MailItem(double max_width,double max_height,double max_depth,Recipient receipt){
    this.Width = max_width;
    this.Depth = max_depth;
    this.Height = max_height;
    this.recipient = receipt;
  }
  /**
   * Getter
   *
   * @return width
   */
  public double getWidth() throws IllegalArgumentException{
    return Width;
  }
  /**
   * Setter
   *
   * @param width
   */
  public void setWidth(double width) throws IllegalArgumentException{
    if(width >=1){
      this.Width = width;
    }
    else {
      throw new IllegalArgumentException("maxWidth can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return height
   */
  public double getHeight() {
    return Height;
  }
  /**
   * Setter
   *
   * @param height
   */
  public void setHeight(double height) throws IllegalArgumentException{
    if(height >=1){
      this.Height = height;
    }
    else {
      throw new IllegalArgumentException("maxHeight can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return depth
   */
  public double getDepth() {
    return Depth;
  }
  /**
   * Setter
   *
   * @param depth
   */
  public void setDepth(double depth) {
    if(depth >=1){
      this.Depth = depth;
    }
    else {
      throw new IllegalArgumentException("maxDepth can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return recipient
   */
  public Recipient getRecipient() {
    return recipient;
  }
  /**
   * Setter
   *
   * @param recipient
   */
  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }

}
