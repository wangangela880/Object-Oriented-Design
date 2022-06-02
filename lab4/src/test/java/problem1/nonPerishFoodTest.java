package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class nonPerishFoodTest {
  private nonPerishFood testNonPerishFood;
  @BeforeEach
  void setUp() {
    this.testNonPerishFood = new nonPerishFood("rice",1.00,5,100);
  }

  @Test
  void testToStringNonPerishableFood() {
    String expectedString = "NonPerishableFood{" +
        "name='" + testNonPerishFood.getName() + '\'' +
        ", curPrice=" + testNonPerishFood.getCurrentPricePerUnit() +
        ", curQuantity=" + testNonPerishFood.getCurrentAvailableQuantity() +
        ", maxAllowedQuantity=" + testNonPerishFood.maximumAllowedQuantity +
        '}';
    assertEquals(expectedString, testNonPerishFood.toString());
  }
}