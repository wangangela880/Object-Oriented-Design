package problem2;

public class Soldiers extends Pieces{

  private double stamina;
  /**
   * Constructs a new Soldier object
   *
   * @param name -name, encoded as string
   * @param age - current Price, encoded as a int
   * @param stamina - current wealth, encoded as a double
   */
  public Soldiers(String name, int age,double stamina) {
    super(name, age);
    this.stamina = stamina;

  }
  /**
   *  increase a Soldier's stamina by passing a number
   * to add to the current stamina of a Soldier
   * @param amount -a double
   *
   */

  public void increaseStamina(double amount) throws IllegalArgumentException{
    if(amount>0){
      this.stamina += amount;}
    else {
      throw new IllegalArgumentException("Amount can not be negative");
    }
    if(this.stamina>100){
      this.stamina=100;
    }
  }
  /**
   *  decrease a Soldier's stamina by passing a number
   * to minus to the current stamina of a Soldier
   * @param amount -a double
   *
   */

  public void decreaseStamina(double amount)throws IllegalArgumentException{
    if(amount>=0){
      this.stamina -= amount;}
    else {
      throw new IllegalArgumentException("Amount can not be negative");
    }
    if(this.stamina<0){
      this.stamina=0;
    }
  }

  /**
   * Getter
   *
   * @return the stamina
   */
  public double getStamina() {
    return stamina;
  }
  /**
   * Setter
   *
   * SET the stamina
   */
  public void setStamina(double stamina) throws IllegalArgumentException{
    if(stamina>=0 && stamina<=100)
      this.stamina = stamina;
    else
      throw new IllegalArgumentException("Stamina should be between 0 to 100");
  }
}
