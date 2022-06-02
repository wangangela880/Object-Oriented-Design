package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.IllegalServiceException;
import problem1.PropertySize;
import problem1.WindowCleaning;

class WindowCleaningTest {
private WindowCleaning testWindowCleaning;
  @BeforeEach
  void setUp() {
    testWindowCleaning = new WindowCleaning("402 Terry Road", PropertySize.small,true,9,3);
  }

  @Test
  void getNumber_floors() throws IllegalServiceException {
    try {
      assertEquals(3,testWindowCleaning.getNumber_floors());
    }catch (IllegalServiceException e){
      fail("Should not appear exception");
    }
  }

  @Test
  void calculatePrice() throws IllegalServiceException {
    assertEquals(42,testWindowCleaning.calculatePrice());
  }
}