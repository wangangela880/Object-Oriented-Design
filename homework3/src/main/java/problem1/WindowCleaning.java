package problem1;

/**
 * Represents the common properties of a Service (abstract).
 */
public class WindowCleaning extends Exterior{

  /**
   * @param number_floors the number of floors
   */
  private Integer number_floors;
  private final Integer max_floor_number = 3;
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
  public WindowCleaning(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone, Integer number_floors) {
    super(address, size, carriedOutMonthly, totalServicesDone);
    this.number_floors = number_floors;
  }
  /**
   * @return number_floors the number of floors
   */
  public Integer getNumber_floors() throws IllegalServiceException{
    if(this.number_floors <= this.max_floor_number){
      return this.number_floors;
    }else{
      throw new IllegalServiceException("Can not start window service");
    }

  }

  @Override
  public double calculatePrice() throws IllegalServiceException {
    double new_price = this.calculateHelper();
    double rate = 0.05;
    double discount = 1;
    Integer min_floor = 1;

    if (this.getNumber_floors() > min_floor){
      new_price = (new_price * rate) + new_price;
    }

    if(this.validTenth()){
      discount = 0.50;
    }else if(this.isCarriedOutMonthly()){
      discount = 0.90;
    }

    return new_price * discount;
  }
}
