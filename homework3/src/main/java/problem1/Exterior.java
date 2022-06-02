package problem1;

/**
 * Represents the common properties of a service
 */
public abstract class Exterior extends AbstractService{
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
  public Exterior(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone) {
    super(address, size, carriedOutMonthly, totalServicesDone);
  }

  /**
   *
   * @return calculate the primary price
   */
  public double calculateHelper() {
    double base = 80;
    double price = 0;

    if(this.size == PropertySize.small){
      price = base;
    }
    else if(this.size == PropertySize.medium){
      price = 2 * base;
    }
    else if(this.size == PropertySize.large){
      price = 4 * base;
    }

    return price;
  }

}
