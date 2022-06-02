package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Objects;
import problem1.AbstractService;
import problem1.Cleaning;
import problem1.Electrical;
import problem1.Gardening;
import problem1.Painting;
import problem1.Plumbing;
import problem1.PropertySize;

class AbstractServiceTest {
  private Cleaning testCleaning;
  private Painting testPainting;
  private Electrical testElectrical;
  private AbstractService myTestGardening;
  private AbstractService myTestPlumbing;

  @BeforeEach
  void setUp() {
    testCleaning = new Cleaning("402 Terry Road", PropertySize.small,true,9,3);
    testPainting = new Painting("402 Terry Road",PropertySize.small,false,9,2);
    testElectrical = new Electrical("402 Terry Road",PropertySize.large,false,8,2,false);
    myTestGardening = new Gardening("402 Terry Road",PropertySize.medium,false,8);
    myTestPlumbing = new Plumbing("402 Terry Road",PropertySize.small,true,8,2,false);
  }

  @Test
  void getAddress() {
    assertEquals("402 Terry Road",this.testCleaning.getAddress());
  }

  @Test
  void getSize() {
    assertEquals(PropertySize.small,this.testCleaning.getSize());
  }

  @Test
  void isCarriedOutMonthly() {
    assertEquals(true,this.testCleaning.isCarriedOutMonthly());
  }

  @Test
  void getTotalServicesDone() {
    assertEquals(9,this.testCleaning.getTotalServicesDone());
  }

  @Test
  void validTenth() {
    assertEquals(true,this.testCleaning.validTenth());
    assertEquals(true,this.testPainting.validTenth());
  }

  @Test
  void testEquals_SameObject() {
    assertTrue(testPainting.equals(testPainting));
  }

  @Test
  void testEquals_DifferentObject() {
    assertFalse(testPainting.equals(testCleaning));
    //assertEquals(testFruit, testFruit); //- not preferred
  }

  @Test
  void testEquals_NullObject() {
    assertFalse(testCleaning.equals(null));
  }

  @Test
  void testEquals_DifferentNumber_pets() {
    Cleaning myOtherCleaning = new Cleaning("402 Terry Road",PropertySize.small,true,9,2);
    assertFalse(testCleaning.equals(myOtherCleaning));
  }

  @Test
  void testEquals_DifferentObjectsSameAttributes() {
    Cleaning myOtherCleaning = new Cleaning("402 Terry Road",PropertySize.small,true,9,3);
    assertTrue(testCleaning.equals(myOtherCleaning));
  }

  @Test
    //Testing equals for FoodItem
  void testEquals_SameObjectRice() {
    assertTrue(myTestGardening.equals(myTestGardening));
  }

  @Test
  void testEquals_DifferentObjectRice() {
    assertFalse(myTestGardening.equals(myTestPlumbing));
  }

  @Test
  void testEquals_NullObjectRice() {
    assertFalse(myTestGardening.equals(null));
  }

  @Test
  void testEquals_OtherGardeningObject() {
    Gardening myOtherGardening = new Gardening("402 Terry Road",PropertySize.medium,false,8);
    assertTrue(myTestGardening.equals(myOtherGardening));
  }

  @Test
  void testEquals_OtherGardeningObject_DifferentAddress() {
    Gardening myOtherGardening = new Gardening("222 Terry Road",PropertySize.medium,false,8);
    assertFalse(myTestGardening .equals(myOtherGardening));
  }

  @Test
  void testEquals_OtherGardeningObject_DifferentSize() {
    Gardening myOtherGardening = new Gardening("402 Terry Road",PropertySize.large,false,8);
    assertFalse(myTestGardening .equals(myOtherGardening));
  }

  @Test
  void testEquals_OtherGardening_DifferentMonthly() {
    Gardening myOtherGardening = new Gardening("402 Terry Road",PropertySize.medium,true,8);
    assertFalse(myTestGardening.equals(myOtherGardening));
  }

  @Test
  void testEquals_OtherGardening_DifferentTotalServiceDone() {
    Gardening myOtherGardening = new Gardening("402 Terry Road",PropertySize.medium,false,1);
    assertFalse(myTestGardening.equals(myOtherGardening));
  }


  //hashcode test for non-perishable item
  @Test
  void testHashCode() {
    int expectedHashcode = Objects.hash("402 Terry Road",PropertySize.medium,false,8);
    System.out.println("My hashcode is: " + expectedHashcode);
    assertEquals(expectedHashcode, myTestGardening.hashCode());
  }


  @Test
  void testHashCode_Interior() {
    int expectedHashcode = Objects.hash("402 Terry Road",PropertySize.small,true,9);
    expectedHashcode = Objects.hash(expectedHashcode, 3);
    System.out.println("My hashcode is: " + expectedHashcode);
    assertEquals(expectedHashcode, testCleaning.hashCode());
  }

  @Test
  void testHashCode_Special() {
    int expectedHashcode = Objects.hash("402 Terry Road",PropertySize.small,true,8);
    expectedHashcode = Objects.hash(expectedHashcode, 2,false);
    System.out.println("My hashcode is: " + expectedHashcode);
    assertEquals(expectedHashcode, myTestPlumbing.hashCode());
  }


  @Test
  void testToString_Special() {
    String expectedString = "Special{" +
        "number_pets=" + 2+
        "complex=" + false+
        '}';
    assertEquals(expectedString, myTestPlumbing.toString());
  }


  @Test
  void testToString_Interior() {
    String expectedString = "Interior{" +
        "number_pets=" + 3 +
        '}';
    assertEquals(expectedString, testCleaning.toString());
  }

  @Test
  void testGetNumber_pets(){
    assertEquals(3, testCleaning.getNumber_pets());
  }



}