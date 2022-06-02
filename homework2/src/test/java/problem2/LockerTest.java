package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LockerTest {
  private Locker testLocker_empty;
  private Locker testLocker_full;
  private MailItem testItem;
  private MailItem testItem_large;
  private Recipient testRecipient;

  @BeforeEach
  void setUp() {
    this.testRecipient = new Recipient("John","Smith","123@gmail.com");
    this.testItem = new MailItem(10.00,20.00,15.00,this.testRecipient);
    // the item bigger than the locker
    this.testItem_large = new MailItem(50.00,60.00,70.00,this.testRecipient);
    // the locker which is primarily empty
    this.testLocker_empty = new Locker(20.00,30.00,40.00,null);
    // the locker is already occupied by an item
    this.testLocker_full = new Locker(20.00,30.00,40.00,this.testItem);
  }

  @Test
  void getMaxWidth() {
    assertEquals(20.00,this.testLocker_full.getMaxWidth());
  }

  @Test
  void setMaxWidth() {
    try{
      this.testLocker_full.setMaxWidth(2);
      assertEquals(2,this.testLocker_full.getMaxWidth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testLocker_full.setMaxWidth(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getMaxHeight() {
    assertEquals(30.00,this.testLocker_full.getMaxHeight());
  }

  @Test
  void setMaxHeight() {
    try{
      this.testLocker_full.setMaxHeight(2);
      assertEquals(2,this.testLocker_full.getMaxHeight());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testLocker_full.setMaxHeight(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getMaxDepth() {
    assertEquals(40.00,this.testLocker_full.getMaxDepth());
  }

  @Test
  void setMaxDepth() {
    try{
      this.testLocker_full.setMaxDepth(2);
      assertEquals(2,this.testLocker_full.getMaxDepth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testLocker_full.setMaxDepth(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getMailItem() {
    Recipient newRecipient = new Recipient("John","Smith","123@gmail.com");
    MailItem newItem = new MailItem(10.00,20.00,15.00,newRecipient);
    assertEquals(newItem.getWidth(),this.testLocker_full.getMailItem().getWidth());
    assertEquals(newItem.getHeight(),this.testLocker_full.getMailItem().getHeight());
    assertEquals(newItem.getDepth(),this.testLocker_full.getMailItem().getDepth());
  }

  @Test
  void setMailItem() {
    Recipient newRecipient = new Recipient("A","B","abc@gmail.com");
    MailItem newItem = new MailItem(20.00,25.00,10.00,newRecipient);
    this.testLocker_full.setMailItem(newItem);
    assertEquals(newItem.getWidth(),this.testLocker_full.getMailItem().getWidth());
    assertEquals(newItem.getHeight(),this.testLocker_full.getMailItem().getHeight());
    assertEquals(newItem.getDepth(),this.testLocker_full.getMailItem().getDepth());
  }

  @Test
  void addMail() {
    // mail item could be added
    try{
      this.testLocker_empty.addMail(testItem);
      Recipient newRecipient = new Recipient("John","Smith","123@gmail.com");
      MailItem newItem = new MailItem(10.00,20.00,15.00,newRecipient);
      assertEquals(newItem.getWidth(),this.testLocker_empty.getMailItem().getWidth());
      assertEquals(newItem.getHeight(),this.testLocker_empty.getMailItem().getHeight());
      assertEquals(newItem.getDepth(),this.testLocker_empty.getMailItem().getDepth());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

   // locker is full
    try{
      this.testLocker_full.addMail(testItem);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  // size of item is too large
    try{
      this.testLocker_empty.addMail(testItem_large);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void pickupMail() {
    // there is a corresponding item in the locker
    try {
      Recipient newRecipient = new Recipient("John","Smith","123@gmail.com");
      MailItem testItem_one;
      testItem_one = this.testLocker_full.pickupMail(newRecipient);
      assertEquals(testItem_one.getWidth(),this.testItem.getWidth());
      assertEquals(testItem_one.getHeight(),this.testItem.getHeight());
      assertEquals(testItem_one.getDepth(),this.testItem.getDepth());
      assertEquals(testItem_one.getRecipient().getFirst_name(),this.testItem.getRecipient().getFirst_name());
      assertEquals(testItem_one.getRecipient().getLast_name(),this.testItem.getRecipient().getLast_name());
      assertEquals(testItem_one.getRecipient().getEmail_address(),this.testItem.getRecipient().getEmail_address());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }
  // no item in the locker or the item is wrong
    try{
      Recipient newRecipient = new Recipient("C","D","CDE@gmail.com");
      this.testLocker_full.pickupMail(newRecipient);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }
}