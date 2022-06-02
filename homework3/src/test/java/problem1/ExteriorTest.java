package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Gardening;
import problem1.PropertySize;

class ExteriorTest {
private Gardening myTestGardening;
  @BeforeEach
  void setUp() {
    myTestGardening = new Gardening("402 Terry Road", PropertySize.medium,false,8);
  }

  @Test
  void calculateHelper() {
    assertEquals(160,myTestGardening.calculateHelper());
  }
}