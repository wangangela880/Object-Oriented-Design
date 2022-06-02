package problem1;

public class Pasta extends nonPerishFood{

  /**
   * Constructs a NonPerishableFood object
   *
   * @param food_name   - name of the NonPerishableFood
   * @param curPrice    - current price of the NonPerish
   * @param curQuantity - current quantity of the NonPerish
   * @param maxQuantity - max quantity of the NonPerish
   */
  public Pasta(String food_name, Double curPrice, Integer curQuantity,
      Integer maxQuantity) {
    super(food_name, curPrice, curQuantity, maxQuantity);
  }
}
