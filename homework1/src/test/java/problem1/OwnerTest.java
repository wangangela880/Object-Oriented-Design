package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OwnerTest {
  private Owner testOwner;

  @BeforeEach
  void setUp() {
    this.testOwner = new Owner("Zoey","Wang","2061234567");
  }

  @Test
  void getFirstName() {
    Assertions.assertEquals("Zoey",this.testOwner.getFirstName());
  }

  @Test
  void getLastName() {
    Assertions.assertEquals("Wang",this.testOwner.getLastName());
  }

  @Test
  void getPhone() {
    Assertions.assertEquals("2061234567",this.testOwner.getPhone());
  }

  @Test
  void setFirstName() {
    testOwner.setFirstName("Zoey");
    assertEquals("Zoey", testOwner.getFirstName());
  }

  @Test
  void setLastName() {
    testOwner.setLastName("Wang");
    assertEquals("Wang", testOwner.getLastName());
  }

  @Test
  void setPhone() {
    testOwner.setPhone("2061234567");
    assertEquals("2061234567", testOwner.getPhone());
  }
}