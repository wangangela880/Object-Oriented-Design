package problem1;

/**
 * Represents the common properties of a Service (abstract).
 */
public class Painting extends Interior{
  /**
   * Constructs a new Starship object and initializes it with the given fuel level, destruction
   * level, and also determines whether or not the starship has been destroyed.
   *
   * @param address Property address, represented as a String
   * @param size Property size, represented as an enum.
   * @param carriedOutMonthly A boolean that indicates whether or not the service is carried out monthly.
   * @param totalServicesDone The number of services previously carried out at the address, represented as an
   * Integer
   * @param number_pets number of pet
   */
  public Painting(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone,
      int number_pets) {
    super(address, size, carriedOutMonthly, totalServicesDone, number_pets);
  }

  @Override
  public double calculatePrice() {
    double base = 80;
    double price = 0;
    double rate_low = 0.05;
    double rate_high = 0.07;
    double discount = 1;

    if(this.size == PropertySize.small || this.size == PropertySize.medium){
      price = 16 * base;
    }
    else if(this.size == PropertySize.large){
      price = 24 * base;
    }

    if(this.number_pets == 1 || this.number_pets == 2){
      price = (price * rate_low) + price;
    }else if(this.number_pets >= 3){
      price = (price * rate_high) + price;
    }

    if(this.validTenth()){
      discount = 0.50;
    }else if(this.isCarriedOutMonthly()){
      discount = 0.90;
    }

    return price * discount;
  }
}
