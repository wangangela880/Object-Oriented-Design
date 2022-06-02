package problem1;

/**
 * Represents the common properties of a Service (abstract).
 */
public class Plumbing extends Special{
  /**
   * Constructs a new Starship object and initializes it with the given fuel level, destruction
   * level, and also determines whether or not the starship has been destroyed.
   *
   * @param address Property address, represented as a String
   * @param size Property size, represented as an enum.
   * @param carriedOutMonthly A boolean that indicates whether or not the service is carried out monthly.
   * @param totalServicesDone The number of services previously carried out at the address, represented as an
   * Integer
   * @param number_employee number of employee
   * @param complex is complex task
   */
  public Plumbing(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone,
      int number_employee, boolean complex) {
    super(address, size, carriedOutMonthly, totalServicesDone, number_employee, complex);
  }

  @Override
  public double calculatePrice() {
    double new_price = this.calculateHelper();
    double permit = 50;
    return new_price + permit;
  }
}
