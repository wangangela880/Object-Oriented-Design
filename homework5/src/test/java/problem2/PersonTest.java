package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
  private Person testPerson;

  @BeforeEach
  void setUp() {
    this.testPerson = new Person("John","Smith");
  }

  @Test
  void getFirstName() {
    assertEquals("John",this.testPerson.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Smith",this.testPerson.getLastName());
  }
}