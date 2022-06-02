package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

class FoodItemsTest {
  private Meat testFood;
  private LocalDateTime testOrderDate;
  private LocalDateTime testExpDate;
  @BeforeEach
  void setUp() {
    testOrderDate = LocalDateTime.now();
    testExpDate = LocalDateTime.of(2022, 2, 11, 1, 1, 1);
    this.testFood = new Meat("Meat",10.00,80,100,testOrderDate,testExpDate);
  }

  @Test
  void getName() {
    Assertions.assertEquals("Meat",this.testFood.getName());
  }


  @Test
  void getCurrentPricePerUnit() {
    Assertions.assertEquals(10.00,this.testFood.getCurrentPricePerUnit());
  }


  @Test
  void getCurrentAvailableQuantity() {
    Assertions.assertEquals(80,this.testFood.getCurrentAvailableQuantity());
  }


  @Test
  void getMaximumAllowedQuantity() {
    Assertions.assertEquals(FoodItems.max_perish_quantity,this.testFood.getMaximumAllowedQuantity());
  }

  @Test
  void testEqualsSameObjects() {
    Meat testMeat_One = new Meat("Meat",10.00,80,100,testOrderDate,testExpDate);
    assertTrue(testMeat_One.equals(testFood));
    Pasta testPasta = new Pasta("lettuce", 2.00, 1, 100);
    assertTrue(testPasta.equals(testPasta));
  }

  @Test
  void testEqualsNullObjects() {
    assertFalse(testFood.equals(null));
  }

  @Test
  void testEqualsDiffDataType() {
    Pasta testPasta = new Pasta("lettuce", 2.00, 1, 100);
    assertFalse(testPasta.equals(testFood));
  }

  @Test
  void testEqualsDiffFields() {
    Vegetable testVegetable_one = new Vegetable("lettuce", 2.00, 1, 100, testOrderDate, testExpDate);
    Vegetable testVegetable_two = new Vegetable("lettuce", 2.00, 10, 100, testOrderDate, testExpDate);
    assertFalse(testVegetable_one.equals(testVegetable_two));
  }

  @Test
  void testEqualsSameFields() {
    Meat testMeat_one = new Meat("lamb", 12.00, 1, 100, testOrderDate, testExpDate);
    Meat testMeat_two = new Meat("lamb", 12.00, 1, 100, testOrderDate, testExpDate);
    assertTrue(testMeat_one.equals(testMeat_two));
  }

  @Test
  void testHashCode() {
    Meat testMeat_one = new Meat("Meat",10.00,80,100,testOrderDate,testExpDate);
    assertEquals(testMeat_one.hashCode(), testFood.hashCode());
    Meat testMeat_two = new Meat("turkey", 2.00, 2, 100, testOrderDate, testExpDate);
    assertNotEquals(testMeat_two.hashCode(), testFood.hashCode());
  }

}