package problem2;

public class Civilians extends Pieces{


  private double wealth;
  /**
   * Constructs a new Civilian object
   *
   * @param name -name, encoded as string
   * @param age - current Price, encoded as a int
   * @param wealth - current wealth, encoded as a double
   */
  public Civilians(String name, int age,double wealth) {
    super(name, age);
    this.wealth = wealth;

  }

  /**
   *  increase a Civilian's wealth by passing a number
   *   add to the current wealth of a Civilian.
   *  We should be also able to decrease a Civilian
   * @param amount -a double
   *
   */
  public void increaseWealth (double amount)throws IllegalArgumentException{
    if(amount>=0){
      this.wealth += amount;}
    else {
      throw new IllegalArgumentException("Amount can not be negative");
    }
  }

  /**
   *  decrease a Civilian's wealth by passing a number
   * to minus to the current stamina of a Civilian
   * @param amount -a double
   *
   */
  public void decreaseWealth(double amount)throws IllegalArgumentException{
    if(amount>=0){
      this.wealth -= amount;}
    else {
      throw new IllegalArgumentException("Amount can not be negative");
    }
    if(this.wealth<0) {
      this.wealth = 0;
    }
  }
  /**
   * Getter
   *
   * @return the wealth
   */
  public double getWealth() {
    return wealth;
  }
  /**
   * Setter
   *
   * SET the wealth
   */
  public void setWealth (double wealth) throws IllegalArgumentException{
    if(wealth>=0)
      this.wealth = wealth;
    else
      throw new IllegalArgumentException("Wealth can not be negative");
  }
}
