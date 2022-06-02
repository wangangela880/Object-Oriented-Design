package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmountTest {
  private Amount testAmount;
  @BeforeEach
  void setUp() {
    this.testAmount = new Amount(1,1);
  }

  @Test
  void getDollars() {
    assertEquals(1,this.testAmount.getDollars());
  }

  @Test
  void getCents() {
    assertEquals(1,this.testAmount.getCents());
  }

  @Test
  void setDollars() {
    this.testAmount.setDollars(2);
    Assertions.assertEquals(2,this.testAmount.getDollars());
  }

  @Test
  void setCents() {
    this.testAmount.setCents(2);
    Assertions.assertEquals(2,this.testAmount.getCents());
  }
}