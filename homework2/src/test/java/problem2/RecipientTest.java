package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecipientTest {
  private Recipient testRecipient;

  @BeforeEach
  void setUp() {
    this.testRecipient = new Recipient("John","Smith","123@gmail.com");
  }

  @Test
  void getFirst_name() {
    assertEquals("John",this.testRecipient.getFirst_name());
  }

  @Test
  void setFirst_name() {
    this.testRecipient.setFirst_name("A");
    assertEquals("A",this.testRecipient.getFirst_name());
  }

  @Test
  void getLast_name() {
    assertEquals("Smith",this.testRecipient.getLast_name());
  }

  @Test
  void setLast_name() {
    this.testRecipient.setLast_name("B");
    assertEquals("B",this.testRecipient.getLast_name());
  }

  @Test
  void getEmail_address() {
    assertEquals("123@gmail.com",this.testRecipient.getEmail_address());
  }

  @Test
  void setEmail_address() {
    this.testRecipient.setEmail_address("ABC@gmail.com");
    assertEquals("ABC@gmail.com",this.testRecipient.getEmail_address());
  }
}