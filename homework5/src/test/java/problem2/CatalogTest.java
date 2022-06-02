package problem2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatalogTest {
  private Catalog testCatalogOne;
  private Catalog testCatalogTwo;
  private Item testItemOne;
  private Person testPersonOne;
  private ArrayList<Item> testArrayListOne;


  @BeforeEach
  void setUp() {

    this.testPersonOne = new Person("A","B");
    this.testItemOne = new Item(this.testPersonOne,"Wind",2000);
    ArrayList<Item> testArrayListOne = new ArrayList<Item>(Collections.singleton(this.testItemOne));
    ArrayList<Item> testArrayListTwo = new ArrayList<>();
    this.testCatalogOne = new Catalog(testArrayListOne);
    this.testCatalogTwo = new Catalog(testArrayListTwo);
  }

  @Test
  void getCollectionItems() {
    Person testMyPeopleOne = new Person("A","B");
    Item testMyItemOne = new Item(testMyPeopleOne,"Wind",2000);
    ArrayList<Item> testMyArrayListOne = new ArrayList<Item>(Collections.singleton(testMyItemOne));
    assertTrue(this.testCatalogOne.getCollectionItems().equals(testMyArrayListOne));
  }

  @Test
  void add() throws ItemAlreadyInException{

    try{
      Person testMyPeopleTwo = new Person("A","B");
      Item testMyItemTwo = new Item(testMyPeopleTwo,"Wind",2000);
      this.testCatalogOne.add(testMyItemTwo);
      fail("The item already in");
    }catch(ItemAlreadyInException e){
    }

    try{
      Person testMyPeopleThree = new Person("C","D");
      Item testMyItemThree = new Item(testMyPeopleThree,"Sun",2001);
      this.testCatalogOne.add(testMyItemThree);
    }catch(ItemAlreadyInException e){
      fail("Should not catch exception");
    }
    }



  @Test
  void remove() throws EmptyCollectionException, ItemNotInException{

    try{
      ArrayList<Item> testArrayList = new ArrayList<>();
      this.testCatalogTwo.remove(this.testItemOne);
      fail("The collection is empty.");
    }catch(EmptyCollectionException e){

    }

    try{
      Person testPerson = new Person("C","D");
      Item testItem = new Item(testPerson,"Wind",2000);
      this.testCatalogOne.remove(testItem);
      fail("Could not find the item.");
    }catch(ItemNotInException e){

    }

    try{
      this.testCatalogOne.remove(this.testItemOne);
      ArrayList<Item> testArrayList = new ArrayList<>();
      Assertions.assertEquals(this.testArrayListOne,null);
    }catch(ItemNotInException e){
      fail("Should not catch exception");
    }

  }

  @Test
  void search() {
    ArrayList<Item> testArrayList = new ArrayList<Item>(Collections.singleton(this.testItemOne));
    Assertions.assertEquals(this.testCatalogOne.search("Wind"),testArrayList);
  }

  @Test
  void testSearch() {
    Author testAuthor = new Author("A","B");
    ArrayList<Item> testArrayList = new ArrayList<Item>(Collections.singleton(this.testItemOne));
    Assertions.assertEquals(this.testCatalogOne.search(testAuthor),testArrayList);

  }

  @Test
  void testSearch1() {
    RecordingArtist testRecordingArtist = new RecordingArtist("A","B");
    ArrayList<Item> testArrayList = new ArrayList<Item>(Collections.singleton(this.testItemOne));
    Assertions.assertEquals(this.testCatalogOne.search(testRecordingArtist),testArrayList);
  }
}