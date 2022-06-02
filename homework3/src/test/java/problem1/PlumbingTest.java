package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Plumbing;
import problem1.PropertySize;

class PlumbingTest {
  private Plumbing myTestPlumbing;
  @BeforeEach
  void setUp() {
    myTestPlumbing = new Plumbing("402 Terry Road", PropertySize.small,true,8,2,false);
  }

  @Test
  void calculatePrice() {
    assertEquals(450,myTestPlumbing.calculatePrice());
  }
}