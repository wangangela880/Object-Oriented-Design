package problem1;

import java.time.LocalDateTime;

public class Fruit extends PerishFood{

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
  public Fruit(String name, Double curPrice, Integer curQuantity, Integer maxQuantity,
      LocalDateTime order, LocalDateTime expire) {
    super(name, curPrice, curQuantity, maxQuantity, order, expire);
  }
}
