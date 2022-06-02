package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
  private Vehicle testVehicle;
  private Owner testOwner;

  @BeforeEach
  void setUp() {
    this.testOwner = new Owner("Zoey","Wang","2061234567");
    this.testVehicle = new Vehicle(12,"123ABC",testOwner);
  }

  @Test
  void getVIN() {
    Assertions.assertEquals(12,testVehicle.getVIN());
  }

  @Test
  void getLicensePlate() {
    Assertions.assertEquals("123ABC",testVehicle.getLicensePlate());
  }

  @Test
  void getOwner() {
    Assertions.assertEquals(testOwner,testVehicle.getOwner());
  }

  @Test
  void setVIN() {
    testVehicle.setVIN(12);
    assertEquals(12,testVehicle.getVIN());
  }

  @Test
  void setLicensePlate() {
    testVehicle.setLicensePlate("123ABC");
    assertEquals("123ABC",testVehicle.getLicensePlate());
  }

  @Test
  void setOwner() {
    testVehicle.setOwner(testOwner);
    assertEquals(testOwner,testVehicle.getOwner());
  }
}