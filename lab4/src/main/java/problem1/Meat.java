package problem1;

import java.time.LocalDateTime;

public class Meat extends PerishFood{

  /**
   * Creates	a	perishFood
   *
   *	@param	name a string
   *	@param	curPrice a double
   *	@param	curQuantity a int
   *  @param	maxQuantity a int
   *  @param	order a localDate
   *  @param	expire a localDate
   */
  public Meat(String name, Double curPrice, Integer curQuantity, Integer maxQuantity,
      LocalDateTime order, LocalDateTime expire) {
    super(name, curPrice, curQuantity, maxQuantity, order, expire);
  }
}
