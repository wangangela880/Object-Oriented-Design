package problem2;
/**
 *  Class MailItem
 *  A maximum width in inches, an integer greater than or equal to 1.
 *  A maximum height in inches, an integer greater than or equal to 1.
 *  A maximum depth in inches, an integer greater than or equal to 1.
 *  A mail item—the item stores in the locker
 */
public class Locker {

  double maxWidth,maxHeight,maxDepth;
  MailItem mailItem;
  /**
   * Constructs a new Room object
   *
   * @param width -max width,encoded as an integer
   * @param height- max height,encoded as an integer
   * @param depth - max depth,encoded as an integer
   * @param mail - mail
   */
  public Locker(double width,double height,double depth,MailItem mail){
    this.maxWidth = width;
    this.maxHeight = height;
    this.maxDepth = depth;
    this.mailItem = mail;
  }
  /**
   * Getter
   *
   * @return max width
   */
  public double getMaxWidth() {
    return maxWidth;
  }
  /**
   * Setter
   *
   * @param maxWidth
   */
  public void setMaxWidth(double maxWidth) throws IllegalArgumentException{
    if(maxWidth >=1){
      this.maxWidth = maxWidth;
    }
    else {
      throw new IllegalArgumentException("maxWidth can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return max height
   */
  public double getMaxHeight() {
    return maxHeight;
  }
  /**
   * Setter
   *
   * @param maxHeight
   */
  public void setMaxHeight(double maxHeight) throws IllegalArgumentException{
    if(maxHeight >=1){
      this.maxHeight = maxHeight;
    }
    else {
      throw new IllegalArgumentException("maxHeight can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return max depth
   */
  public double getMaxDepth() {
    return maxDepth;
  }
  /**
   * Setter
   *
   * @param maxDepth
   */
  public void setMaxDepth(double maxDepth) {
    if(maxDepth >=1){
      this.maxDepth = maxDepth;
    }
    else {
      throw new IllegalArgumentException("maxDepth can not smaller than 1");
    }
  }
  /**
   * Getter
   *
   * @return mail item
   */
  public MailItem getMailItem() {
    return mailItem;
  }
  /**
   * Setter
   *
   * @param mailItem
   */
  public void setMailItem(MailItem mailItem) {
    this.mailItem = mailItem;
  }

  /**
   *  addMail, that consumes a mail item and stores it in a locker
   *
   * @param newItem
   */
  public void addMail(MailItem newItem) throws IllegalArgumentException{
    if(this.mailItem == null && newItem.getWidth() <= this.maxWidth && newItem.getHeight() <= this.maxHeight && newItem.getDepth()
        <= this.maxDepth){
      this.mailItem = newItem;
    }else if(mailItem != null){
      throw new IllegalArgumentException("Locker has been occupied.");
    }else{
      throw new IllegalArgumentException("Mail Item is too large");
    }
  }
  /**
   *  pickupMail, that takes one parameter, a recipient. This method will
   * remove and return the mail item from the locker
   *
   * @param recipient
   * @return Mail item
   */
  public MailItem pickupMail(Recipient recipient) throws IllegalArgumentException{
    if(this.mailItem != null && recipient.getFirst_name() == this.mailItem.getRecipient().getFirst_name() && recipient.getLast_name() == this.mailItem.getRecipient().getLast_name() && recipient.getEmail_address() == this.mailItem.getRecipient().getEmail_address()){
      MailItem newItem = this.mailItem;
      this.mailItem = null;
      return newItem;
    }
    else{
      throw new IllegalArgumentException("No item found");
    }
  }

}
