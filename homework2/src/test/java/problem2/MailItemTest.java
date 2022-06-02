package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailItemTest {
  private MailItem testItem;
  private Recipient testRecipient;

  @BeforeEach
  void setUp() {
    this.testRecipient = new Recipient("John","Smith","123@gmail.com");
    this.testItem = new MailItem(10.00,20.00,15.00,this.testRecipient);
  }

  @Test
  void getWidth() {
    assertEquals(10.00,this.testItem.getWidth());
  }

  @Test
  void setWidth() {
    try{
      this.testItem.setWidth(2);
      assertEquals(2,this.testItem.getWidth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testItem.setWidth(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getHeight() {
    assertEquals(20.00,this.testItem.getHeight());
  }

  @Test
  void setHeight() {
    try{
      this.testItem.setHeight(2);
      assertEquals(2,this.testItem.getHeight());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testItem.setHeight(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getDepth() {
    assertEquals(15.00,this.testItem.getDepth());
  }

  @Test
  void setDepth() {
    try{
      this.testItem.setDepth(2);
      assertEquals(2,this.testItem.getDepth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testItem.setDepth(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getRecipient() {
    Recipient newRecipient = new Recipient("John","Smith","123@gmail.com");
    assertEquals(newRecipient.getFirst_name(),this.testItem.getRecipient().getFirst_name());
    assertEquals(newRecipient.getLast_name(),this.testItem.getRecipient().getLast_name());
    assertEquals(newRecipient.getEmail_address(),this.testItem.getRecipient().getEmail_address());
  }

  @Test
  void setRecipient() {
    Recipient newRecipient = new Recipient("A","B","ABC@gmail.com");
    this.testItem.setRecipient(newRecipient);
    assertEquals(newRecipient.getFirst_name(),this.testItem.getRecipient().getFirst_name());
    assertEquals(newRecipient.getLast_name(),this.testItem.getRecipient().getLast_name());
    assertEquals(newRecipient.getEmail_address(),this.testItem.getRecipient().getEmail_address());

  }
}