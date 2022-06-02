package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoldiersTest {
  private Soldiers testSoldier;

  @BeforeEach
  void setUp() {
    this.testSoldier = new Soldiers("A",10,2.00);
  }

  @Test
  void increaseStamina() {
    double testAmount;
    try{
      this.testSoldier.increaseStamina(10.00);
      assertEquals(12.00,this.testSoldier.getStamina());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testSoldier.increaseStamina(-10.00);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void decreaseStamina() {
    double testAmount;
    try{
      this.testSoldier.decreaseStamina(10.00);
      assertEquals(0.00,this.testSoldier.getStamina());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testSoldier.decreaseStamina(-10.00);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getStamina() {
    assertEquals(2.00,this.testSoldier.getStamina());
  }

  @Test
  void setStamina() {
    try{
      this.testSoldier.setStamina(20.00);
      assertEquals(20.00,this.testSoldier.getStamina());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testSoldier.setStamina(-20.00);
      fail("An exception should not have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }
}