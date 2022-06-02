package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.IllegalServiceException;
import problem1.Plumbing;
import problem1.PropertySize;
import problem1.Special;

class SpecialTest {
  private Special myTestPlumbing;
  private Special myTestPlumbing_two;
  private Special myTestPlumbing_three;
  @BeforeEach
  void setUp() {
    myTestPlumbing = new Plumbing("402 Terry Road", PropertySize.small,true,8,2,false);
    myTestPlumbing_two = new Plumbing("402 Terry Road",PropertySize.small,true,8,-1,false);
    myTestPlumbing_three = new Plumbing("402 Terry Road",PropertySize.small,true,8,0,false);
  }

  @Test
  void getNumber_employee() throws IllegalServiceException {
    try {
      assertEquals(2, myTestPlumbing.getNumber_employee());
    } catch (IllegalServiceException e) {
      fail("Should not appear exception");
    }

    try{
      assertEquals(-1,myTestPlumbing_two.getNumber_employee());
      fail("Should catch exception");}
    catch(IllegalServiceException e){
    }

    assertEquals(1,myTestPlumbing_three.getNumber_employee());
  }

  @Test
  void isComplex() {
    assertEquals(false,myTestPlumbing.isComplex());
  }

  @Test
  void setNumber_employee() throws IllegalServiceException {
    myTestPlumbing.setNumber_employee(3);
    assertEquals(3,myTestPlumbing.getNumber_employee());
  }

  @Test
  void setComplex() {
    myTestPlumbing.setComplex(true);
    assertEquals(true,myTestPlumbing.isComplex());
  }

  @Test
  void calculateHelper() {
    assertEquals(400,myTestPlumbing.calculateHelper());
  }
}