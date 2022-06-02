/**class Amount
 * An amount consists of:
 * An integer value for the US dollar amount, greater than or equal to 0.
 * An integer value for the US cents amount, between 0 and 99 inclusive.
 */
package problem3;

public class Amount {
  private int dollars;
  private int cents;
  /**
   * Constructor that creates a new Amount object
   and
   * license plate.
   * @param dollar - dollar which is larger than 0, inclusive.
   * @param cent - cents, between 0 and 99, inclusive.
   */
  public Amount(int dollar,int cent){
    this.dollars = dollar;
    this.cents = cent;
  }
  /**
   * Returns the dollars of the Amount.
   * @return the dollars of the Amount.
   */
  public int getDollars() {
    if (dollars >= 0){
      return dollars;
    }else{
      System.out.println("Please reset the dollars");
      return -1;
    }
  }
  /**
   * Returns the cents of the Amount.
   * @return the cents of the Amount.
   */
  public int getCents() {
    if (cents <= 99 && cents >= 0){
      return cents;
    }else{
      System.out.println("Please reset the cents");
      return -1;
    }
  }
  /**
   * Sets the dollars of the Amount.
   */
  public void setDollars(Integer dollars) {
    if (dollars >= 0){
      this.dollars = dollars;
    }else{
      System.out.println("Please reset the dollar");
    }
  }
  /**
   * Sets the cents of the Amount.
   */
  public void setCents(Integer cents) {
    if (cents >= 0 && cents <= 99){
      this.cents = cents;
    }else{
      System.out.println("Please reset the cent");
    }
  }
}
