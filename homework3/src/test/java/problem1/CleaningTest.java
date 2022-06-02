package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Cleaning;
import problem1.PropertySize;

class CleaningTest {
private Cleaning testCleaning;
  @BeforeEach
  void setUp() {
    testCleaning = new Cleaning("402 Terry Road", PropertySize.small,true,9,3);
  }

  @Test
  void calculatePrice() {
    assertEquals(42.80,testCleaning.calculatePrice());
  }
}