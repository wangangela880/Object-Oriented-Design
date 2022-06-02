/**
 *  Name, represented as a String
 *  Current price per unit, represented as a Double
 *  Currently available quantity, represented as an Integer
 *  Maximum allowed quantity, which is a constant represented as an Integer. For
 * all perishable food items, it equals 100, while for all non-perishable food items, it
 * equals 250.
 *
 */

package problem1;
import java.util.Objects;
public class FoodItems {

  protected String name;
  protected Double currentPricePerUnit;
  protected Integer currentAvailableQuantity;
  protected Integer maximumAllowedQuantity;

  protected static Integer max_perish_quantity = 100;
  protected static final Integer max_nonPerish_quantity = 250;
  /**
   * Constructs a new Food object
   *
   * @param food_name -name, encoded as string
   * @param curPrice - current Price, encoded as a double
   * @param curQuantity - current quantity, encoded as an integer
   * @param maxQuantity - max allowed quantity, encoded as an integer
   */
  public FoodItems(String food_name, Double curPrice, Integer curQuantity,Integer maxQuantity)
  {
    this.name = food_name;
    this.currentPricePerUnit = curPrice;
    this.currentAvailableQuantity = curQuantity;
    this.maximumAllowedQuantity = maxQuantity;
  }
  /**
   * Getter
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Getter
   *
   * @return the name
   */
  public Double getCurrentPricePerUnit() {
    return this.currentPricePerUnit;
  }

  /**
   * Getter
   *
   * @return the AvailableQuantity
   */
  public Integer getCurrentAvailableQuantity() {
    return this.currentAvailableQuantity;
  }


  /**
   * Getter
   *
   * @return the MaximumAllowedQuantity
   */
  public Integer getMaximumAllowedQuantity() {
    return this.maximumAllowedQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof FoodItems)) return false;
    FoodItems food = (FoodItems) o;
    return Objects.equals(getName(), food.getName()) && Objects.equals(getCurrentPricePerUnit(), food.getCurrentPricePerUnit()) && Objects.equals(getCurrentAvailableQuantity(), food.getCurrentAvailableQuantity()) && Objects.equals(getMaximumAllowedQuantity(), food.getMaximumAllowedQuantity());
  }

  /**
   * hashCode method checks the hashcode
   *
   * @return true if hashcode of are the same.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCurrentPricePerUnit(), getCurrentAvailableQuantity(), getMaximumAllowedQuantity());
  }

}
