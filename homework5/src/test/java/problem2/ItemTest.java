package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {
  private Item testItem;
  private Person testPerson;


  @BeforeEach
  void setUp() {
    this.testPerson = new Person("A","B");
    this.testItem = new Item(this.testPerson,"Wind",2000);
  }

  @Test
  void getCreator() {
    Person testPersonOne = new Person("A","B");
    assertTrue(this.testItem.getCreator().equals(testPersonOne));
  }

  @Test
  void getTitle() {
    assertEquals("Wind",this.testItem.getTitle());
  }
}