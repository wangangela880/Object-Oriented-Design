package problem2;
/**
 *  Class Recipient
 *  A first name
 *  A last name
 *  An email address. You do not need to validate the format of an email address for this
 * assignment.
 *
 */
public class Recipient {

  private String first_name;
  private String last_name;
  private String email_address;
  /**
   * Constructs a new Room object
   *
   * @param first -first name,encoded as a string
   * @param last- last name,encoded as a string
   * @param address - email,encoded as a string
   */
  public Recipient(String first,String last,String address){
    this.first_name = first;
    this.last_name = last;
    this.email_address = address;
  }
  /**
   * Getter
   *
   * @return the first name
   */
  public String getFirst_name() {
    return first_name;
  }
  /**
   * Setter
   *
   * @param first_name
   */
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }
  /**
   * Getter
   *
   * @return the last name
   */
  public String getLast_name() {
    return last_name;
  }
  /**
   * Setter
   *
   * @param last_name
   */
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  /**
   * Getter
   *
   * @return the email address
   */
  public String getEmail_address() {
    return email_address;
  }
  /**
   * Setter
   *
   * @param email_address
   */
  public void setEmail_address(String email_address) {
    this.email_address = email_address;
  }
}
