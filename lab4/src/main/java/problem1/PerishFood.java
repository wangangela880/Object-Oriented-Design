/**
 *  for every perishable item, we also keep track of:
 * • Order date, encoded as a LocalDateTime object.
 * • Expiration date, also encoded as a LocalDateTime object.
 */
package problem1;
import java.time.LocalDateTime;
import java.util.Objects;
public class PerishFood extends FoodItems{

  protected LocalDateTime orderDate;
  protected LocalDateTime expireDate;
  /**
   *	Creates	a	perishFood
   *
   *	@param	name a string
   *	@param	curPrice a double
   *	@param	curQuantity a int
   *  @param	maxQuantity a int
   *  @param	order a localDate
   *  @param	expire a localDate
   */
  public PerishFood(String name, Double curPrice, Integer curQuantity, Integer maxQuantity,LocalDateTime order,LocalDateTime expire) {
    super(name, curPrice, curQuantity, maxQuantity);
    this.expireDate = expire;
    this.orderDate = order;
  }
  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public LocalDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(LocalDateTime expireDate) {
    this.expireDate = expireDate;
  }
  /**
   * equals
   *
   * @return true if are the same.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PerishFood)) return false;
    if (!super.equals(o)) return false;
    PerishFood that = (PerishFood) o;
    return Objects.equals(getOrderDate(), that.getOrderDate()) && Objects.equals(getExpireDate(), that.getExpireDate());
  }

  /**
   * hashCode method checks the hashcode of two different objects
   *
   * @return true if the hashcode of two objects are the same.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getOrderDate(), getExpireDate());
  }

  /**
   * toString
   *
   * @return the string containing the information
   */
  @Override
  public String toString() {
    return "PerishableFood{" +
        "name='" + name + '\'' +
        ", curPrice=" + currentPricePerUnit +
        ", curQuantity=" + currentAvailableQuantity +
        ", maxAllowedQuantity=" + maximumAllowedQuantity +
        ", orderDate=" + orderDate +
        ", expDate=" + expireDate +
        '}';
  }
}
