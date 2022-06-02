package problem1;

import java.util.Objects;

/**
 * Represents the common properties of a service
 */
public abstract class Special extends AbstractService{
  /**
   *number_employee number of employee
   * complex is complex task
   */
  protected int number_employee;
  protected boolean complex;
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
  public Special(String address, PropertySize size, boolean carriedOutMonthly, int totalServicesDone,
      int number_employee, boolean complex) {
    super(address, size, carriedOutMonthly, totalServicesDone);
    this.number_employee = number_employee;
    this.complex = complex;
  }

  /**
   * return number of employee
   * @return number of employee
   */
  public int getNumber_employee() throws IllegalServiceException{
    if(this.number_employee >= 0 && this.number_employee < 1){
      setNumber_employee(1);
    }else if(this.number_employee < 0){
      throw new IllegalServiceException("Not valid number of employee");
    }
    return this.number_employee;
  }
  /**
   * return is complex
   * @return is complex
   */
  public boolean isComplex() {
    if (this.complex == true){
      if (this.size == PropertySize.small || this.size == PropertySize.medium){
        if(this.number_employee < 2){
          setNumber_employee(2);
        }
      }else if(this.size == PropertySize.large){
        if(this.number_employee < 3){
          setNumber_employee(3);
        }
      }
    }
    return complex;
  }
  /**
   * return
   * @param  number_employee
   */
  public void setNumber_employee(int number_employee) {
    this.number_employee = number_employee;
  }
  /**
   * return
   * @param  complex
   */
  public void setComplex(boolean complex) {
    this.complex = complex;
  }
  /**
   *
   * @return calculate the primary price
   */
  public double calculateHelper(){
    double price = 200;
    return price * number_employee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Special that = (Special) o;
    return Objects.equals(number_employee, that.number_employee) && Objects.equals(complex, that.complex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), number_employee,complex) ;
  }

  @Override
  public String toString() {
    return "Special{" +
        "number_pets=" + number_employee+
        "complex=" + complex+
        '}';
  }

}
