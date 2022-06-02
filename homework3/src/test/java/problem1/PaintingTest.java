package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Painting;
import problem1.PropertySize;

class PaintingTest {
private Painting testPainting;
  @BeforeEach
  void setUp() {
    testPainting = new Painting("402 Terry Road", PropertySize.small,false,9,2);
  }

  @Test
  void calculatePrice() {
    assertEquals(672.00,testPainting.calculatePrice());
  }
}