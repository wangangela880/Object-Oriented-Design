package problem1;
/**
 * Represents the common properties of a Service (abstract).
 */
import java.util.Objects;
public abstract class AbstractService implements IService {
  protected String address;
  protected PropertySize size;
  protected boolean carriedOutMonthly;
  protected int totalServicesDone;
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
  public AbstractService(String address, PropertySize size, boolean carriedOutMonthly,
      int totalServicesDone) {
    this.address = address;
    this.size = size;
    this.carriedOutMonthly = carriedOutMonthly;
    this.totalServicesDone = totalServicesDone;
  }

  /**
   * Return the Property address
   *
   * @return the Property address
   */
  public String getAddress() {
    return address;
  }
  /**
   * Return the Property size
   *
   * @return the Property size
   */
  public PropertySize getSize() {
    return size;
  }
  /**
   * Return the Property size
   *
   * @return the Property size
   */
  public boolean isCarriedOutMonthly() {
    return carriedOutMonthly;
  }
  /**
   * Return A boolean that indicates whether or not the service is carried out monthly
   *
   * @return A boolean that indicates whether or not the service is carried out monthly
   */
  public int getTotalServicesDone() {
    return totalServicesDone;
  }
  /**
   * Return A boolean that indicates whether or not the service can enjoy the 50% discount
   *
   * @return A boolean that indicates whether or not the service can enjoy the 50% discount
   */
  public boolean validTenth(){
    if (this.getTotalServicesDone() % 10 == 9){
      return true;
    }
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbstractService abstractService = (AbstractService) o;
    return Objects.equals(address, abstractService.address) &&
        Objects.equals(size, abstractService.size) &&
        Objects.equals(carriedOutMonthly, abstractService.carriedOutMonthly) &&
        Objects.equals(totalServicesDone, abstractService.totalServicesDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, size, carriedOutMonthly, totalServicesDone);
  }

  @Override
  public String toString() {
    return "AbstractService{" +
        "address='" + address + '\'' +
        ", size=" + size +
        ", carriedOutMonthly=" + carriedOutMonthly +
        ", totalServicesDone=" + totalServicesDone +
        '}';
  }
}
