/**class Owner
 * A first name, typically represented as a String.
 * A first name also represented as a String.
 * A phone number, a String, consisting of ten character.
 */
package problem1;

public class Owner {
  private String firstName;
  private String lastName;
  private String phone;
  /**
   * Constructor that creates a new owner object
   and
   * license plate.
   * @param first - A first name
   * @param last - A first name
   * @param  p - A phone number
   */
  public Owner(String first, String last, String p){
    firstName = first;
    lastName = last;
    phone = p;
  }

/**
 * method
 * @return  first name of the owner
 */
  public String getFirstName(){
    return firstName;
  }
/**
 * method
 * @return  last name of the owner
 */
  public String getLastName(){
    return lastName;
  }
/**
 * method
 * @return  phone number of the owner
 */
  public String getPhone(){
    if(phone.length() > 10){
      return "Please reset a phone number with length larger than 10";
    }else{
      return phone;
    }
  }
/**
 * method
 * @param  firstName the first name we want to set
 */
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
/**
 * method
 * @param  lastName the first name we want to set
 */
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
/**
 * method
 * @param  phone the first name we want to set
 * validate if the length of phone is longer ta 10
 */
  public void setPhone(String phone){
    if (phone.length() < 10){
      System.out.println("Please enter a phone number longer than 10");
    }else{
      this.phone = phone;
    }
  }

}
