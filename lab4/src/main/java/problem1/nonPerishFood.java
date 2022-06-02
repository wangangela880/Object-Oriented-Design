package problem1;

public class nonPerishFood extends FoodItems{
  /**
   * Constructs a NonPerishableFood object
   * @param food_name - name of the NonPerishableFood
   * @param curPrice - current price of the NonPerish
   * @param curQuantity - current quantity of the NonPerish
   * @param maxQuantity - max quantity of the NonPerish
   */
  public nonPerishFood(String food_name, Double curPrice, Integer curQuantity,Integer maxQuantity){
    super(food_name, curPrice, curQuantity,maxQuantity);
  }
  /**
   * toString
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "NonPerishableFood{" +
        "name='" + name + '\'' +
        ", curPrice=" + currentPricePerUnit +
        ", curQuantity=" + currentAvailableQuantity +
        ", maxAllowedQuantity=" + maximumAllowedQuantity +
        '}';
  }
}
