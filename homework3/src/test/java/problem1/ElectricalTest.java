package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Electrical;
import problem1.IllegalServiceException;
import problem1.PropertySize;

class ElectricalTest {
private Electrical testElectrical;
  @BeforeEach
  void setUp() {
    testElectrical = new Electrical("402 Terry Road", PropertySize.large,false,8,2,false);
  }

  @Test
  void getNumber_employee() throws IllegalServiceException {
    try{
      assertEquals(2,testElectrical.getNumber_employee());
    }catch (IllegalServiceException e){
      fail("Should not appear exception");
    }
  }

  @Test
  void calculatePrice() {
    assertEquals(420,testElectrical.calculatePrice());
  }
}