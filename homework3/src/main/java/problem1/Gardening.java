package problem1;

/**
 * Represents the common properties of a Service (abstract).
 */
public class Gardening extends Exterior{
  /**
   * Constructs a new Starship object and initializes it with the given fuel level, destruction
   * level, and also determines whether or not the starship has been destroyed.
   *
   * @param address Property address, represented as a String
   * @param size Property size, represented as an enum.
   * @param carriedOutMonthly A boolean that indicates whether or not the service is carried out monthly.
   * @param totalServicesDone The number of services previously carried out at the address, represented as an
   * Integer
   */
  public Gardening(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone) {
    super(address, size, carriedOutMonthly, totalServicesDone);

  }

  @Override
  public double calculatePrice() {

    double waste_removal = 20;
    double new_price = this.calculateHelper() + waste_removal;
    double discount = 1;

    if(this.validTenth()){
      discount = 0.50;
    }else if(this.isCarriedOutMonthly()){
      discount = 0.90;
    }
    return new_price * discount;
  }
}
