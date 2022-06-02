package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CiviliansTest {
  private Civilians testCivilian;

  @BeforeEach
  void setUp() {
    this.testCivilian = new Civilians("A",10,10.00);
  }

  @Test
  void increaseWealth() {
    double testAmount;
    try{
      this.testCivilian.increaseWealth(10.00);
      assertEquals(20.00,this.testCivilian.getWealth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testCivilian.increaseWealth(-10.00);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void decreaseWealth() {
    double testAmount;
    try{
      this.testCivilian.decreaseWealth(10.00);
      assertEquals(0.00,this.testCivilian.getWealth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testCivilian.decreaseWealth(-10.00);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getWealth() {
    assertEquals(10.00,this.testCivilian.getWealth());
  }

  @Test
  void setWealth() {
    try{
      this.testCivilian.setWealth(20.00);
      assertEquals(20.00,this.testCivilian.getWealth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testCivilian.setWealth(-20);
      fail("An exception should not have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }
}