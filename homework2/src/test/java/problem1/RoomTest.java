package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomTest {
  private DoubleRoom testDouble;
  private FamilyRoom testFamily;
  private SingleRoom testSingle;
  @BeforeEach
  void setUp() {
    this.testDouble = new DoubleRoom(2,100.00,0);
    this.testFamily = new FamilyRoom(4, 200.00, 0);
    this.testSingle = new SingleRoom(1,20.00,0);
  }

  @Test
  void getMaxOccupancy() {
    assertEquals(Room.max_double,this.testDouble.getMaxOccupancy());
    assertEquals(Room.max_family,this.testFamily.getMaxOccupancy());
    assertEquals(Room.max_single,this.testSingle.getMaxOccupancy());
  }


  @Test
  void getPrice() {
    assertEquals(100.00,this.testDouble.getPrice());
  }

  @Test
  void setPrice() {
    try{
      this.testDouble.setPrice(20.00);
      assertEquals(20.00,this.testDouble.getPrice());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testDouble.setPrice(-20);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void getGuestNumber() {
    assertEquals(0,this.testDouble.getGuestNumber());
  }

  @Test
  void setGuestNumber() {
    try{
      this.testDouble.setGuestNumber(2);
      assertEquals(2,this.testDouble.getGuestNumber());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testDouble.setGuestNumber(-2);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }

  @Test
  void testEqualsSameObjects() {
    DoubleRoom testDouble_one = new DoubleRoom(2,100.00,0);
    assertTrue(testDouble_one.equals(testDouble));
    FamilyRoom testFamily_one = new FamilyRoom(4, 200.00, 0);
    assertTrue(testFamily_one.equals(testFamily));
    SingleRoom testSingle_one = new SingleRoom(1,20,0);
    assertTrue(testSingle_one.equals(testSingle));
  }

  @Test
  void testEqualsNullObjects() {
    assertFalse(testDouble.equals(null));
  }

  @Test
  void testEqualsDiffDataType() {
    assertFalse(testFamily.equals(testDouble));
  }

  @Test
  void testEqualsDiffFields() {
    SingleRoom testSingle_one = new SingleRoom(1, 50.00, 0);
    SingleRoom testSingle_two = new SingleRoom(1, 80.00, 0);
    FamilyRoom testFamily_one = new FamilyRoom(4, 200.00, 0);
    FamilyRoom testFamily_two = new FamilyRoom(4, 250.00, 0);
    assertFalse(testSingle_one.equals(testSingle_two));
    assertFalse(testFamily_one.equals(testFamily_two));
  }

  @Test
  void testEqualsSameFields() {
    SingleRoom testSingle_one = new SingleRoom(1, 50.00, 0);
    SingleRoom testSingle_two = new SingleRoom(1, 50.00, 0);
    assertTrue(testSingle_one.equals(testSingle_two));
  }

  @Test
  void testHashCode() {
    DoubleRoom testDouble_one = new DoubleRoom(2,100.00,0);
    assertEquals(testDouble_one.hashCode(), testDouble.hashCode());
    DoubleRoom testDouble_two = new DoubleRoom(2,200.00,0);
    assertNotEquals(testDouble_two.hashCode(), testDouble.hashCode());
  }

  @Test
  void isAvailable() {
    assertTrue(testDouble.isAvailable());
    SingleRoom testSingle_three = new SingleRoom(1, 50.00, 2);
    assertFalse(testSingle_three.isAvailable());
  }

  @Test
  void bookRoom() {
    // successfully  booked
    try{
      int guestNumber = 2;
      this.testDouble.bookRoom(guestNumber);
      assertEquals(2,this.testDouble.getGuestNumber());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }
  // invalid guestNumber
    try{
      int guestNumber = -2;
      this.testDouble.bookRoom(guestNumber);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }
    // oversize
    try{
      int guestNumber = 3;
      this.testDouble.bookRoom(guestNumber);
      fail("An exception should have been thrown");
    }
    catch (IllegalArgumentException e){
    }

  }
}