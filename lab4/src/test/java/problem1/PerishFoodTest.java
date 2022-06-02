package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

class PerishFoodTest {
  private LocalDateTime testOrderDate;
  private LocalDateTime testExpDate;
  private PerishFood testPerishFood;

  @BeforeEach
  void setUp() {
    testOrderDate = LocalDateTime.now();
    testExpDate = LocalDateTime.of(2022, 2, 11, 1, 1, 1);
    this.testPerishFood = new PerishFood("Fruit",5.00,90,100,testOrderDate,testExpDate);
  }


  @Test
  void setOrderDate() {
    LocalDateTime testOrderDateNew = LocalDateTime.of(2022, 2, 1, 11, 30, 30);
    testPerishFood.setOrderDate(testOrderDateNew);
    assertEquals(testOrderDateNew, testPerishFood.getOrderDate());


  }

  @Test
  void setExpireDate() {
    LocalDateTime testOrderDateNew = LocalDateTime.of(2022, 2, 1, 11, 30, 30);
    testPerishFood.setExpireDate(testOrderDateNew);
    assertEquals(testOrderDateNew, testPerishFood.getExpireDate());
  }

  @Test
  void testToStringPerishableFood() {
    String expectedString = "PerishableFood{" +
        "name='" + testPerishFood.getName() + '\'' +
        ", curPrice=" + testPerishFood.getCurrentPricePerUnit() +
        ", curQuantity=" + testPerishFood.getCurrentAvailableQuantity() +
        ", maxAllowedQuantity=" + testPerishFood.getMaximumAllowedQuantity() +
        ", orderDate=" + testPerishFood.getOrderDate() +
        ", expDate=" + testPerishFood.getExpireDate() +
        '}';
    assertEquals(expectedString, testPerishFood.toString());
  }
}