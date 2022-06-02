package problem1;
/**
 * Represents the common properties of a service
 */
import java.util.Objects;
public abstract class Interior extends AbstractService{
  protected int number_pets;
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
  public Interior(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone, int number_pets) {
    super(address, size, carriedOutMonthly, totalServicesDone);
    this.number_pets = number_pets;
  }
  /**
   * Return a number of pet
   *
   * @return number of pet
   */
  public int getNumber_pets() {
    return number_pets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Interior that = (Interior) o;
    return Objects.equals(number_pets, that.number_pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), number_pets);
  }

  @Override
  public String toString() {
    return "Interior{" +
        "number_pets=" + number_pets +
        '}';
  }
}
