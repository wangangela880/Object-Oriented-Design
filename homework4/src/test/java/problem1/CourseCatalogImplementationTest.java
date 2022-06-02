package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseCatalogImplementationTest {
  private Course courseOne;
  private Course courseTwo;
  private int maxSize;
  private CourseCatalogImplementation testCourseCatalog;
  private CourseCatalogImplementation testCourseCatalogOne;
  @BeforeEach
  void setUp() {
    maxSize = 5;
    Course[] courseOne = new Course[maxSize];
    this.courseOne = new Course("OOD","Math",1);
    this.courseTwo = new Course("Algo","OOD",2);
    Course[] courseTwo = new Course[maxSize];
    courseTwo[0] = this.courseOne;
    this.testCourseCatalog = new CourseCatalogImplementation(courseOne,0,maxSize);
    this.testCourseCatalogOne = new CourseCatalogImplementation(courseTwo,1,maxSize);
  }

  @Test
  void append() {
      this.testCourseCatalog.append(this.courseOne);
      assertTrue(this.testCourseCatalog.equals(this.testCourseCatalogOne));

  }

  @Test
  void remove() throws CourseNotFoundException{
    try {
      this.testCourseCatalog.append(this.courseOne);
      this.testCourseCatalog.append(this.courseTwo);
      this.testCourseCatalog.remove(this.courseTwo);
      assertEquals(this.testCourseCatalog.getCurrentIndex(), this.testCourseCatalogOne.getCurrentIndex());
      assertTrue(this.testCourseCatalog.equals(this.testCourseCatalogOne));
    }catch(CourseNotFoundException e){
      fail("should not fail");
    }

    try{
      this.testCourseCatalog.remove(this.courseTwo);
      fail("An exception should be pulled");
    }catch (CourseNotFoundException e){

    }
  }

  @Test
  void contains() {
    this.testCourseCatalog.append(this.courseOne);
    assertTrue(this.testCourseCatalog.contains(this.courseOne));
    assertFalse(this.testCourseCatalog.contains(this.courseTwo));
  }

  @Test
  void indexOf() {
    this.testCourseCatalog.append(this.courseOne);
    assertEquals(0,this.testCourseCatalog.indexOf(this.courseOne));
    assertEquals(-1,this.testCourseCatalog.indexOf(this.courseTwo));
  }

  @Test
  void count() {
    this.testCourseCatalog.append(this.courseOne);
    assertEquals(1,this.testCourseCatalog.count());
  }

  @Test
  void get() throws InvalidIndexException{
    try{
      this.testCourseCatalog.append(this.courseOne);
      assertTrue(this.courseOne.equals(this.testCourseCatalog.get(0)));
    }catch(InvalidIndexException e){
      fail("Should not fail");
    }

    try{
      this.testCourseCatalog.get(-1);
      fail("Should catch exception");
    }catch(InvalidIndexException e){
    }

  }

  @Test
  void isEmpty() throws CourseNotFoundException {
    this.testCourseCatalog.append(this.courseOne);
    assertFalse(this.testCourseCatalog.isEmpty());
    this.testCourseCatalog.remove(this.courseOne);
    assertTrue(this.testCourseCatalog.isEmpty());
  }

  @Test
  void testToString() {
    String result = "";
    for(int i = 0;i<this.testCourseCatalog.getCurrentIndex();i++){
      result += this.testCourseCatalog.getCourse()[i].toString() + "\n";
    }
    assertEquals(result,this.testCourseCatalog.toString());
  }

  @Test
  void testHashCode() {
    int result = Objects.hash(this.testCourseCatalog.getCourse(),this.testCourseCatalog.getCurrentIndex());
    assertEquals(result,this.testCourseCatalog.hashCode());
  }

  @Test
  void getCourse() {
    Course[] currentCourses = this.testCourseCatalogOne.getCourse();
    Course[] testCourses = new Course[maxSize];
    testCourses[0] = this.courseOne;
    for(int i = 0;i<this.testCourseCatalogOne.getCurrentIndex();i++){
      if(currentCourses[i] == null && testCourses[i] == null){
        continue;
      }
      assertTrue(currentCourses[i].equals(testCourses[i]));
    }
  }

  @Test
  void getCurrentIndex() {
    assertEquals(1,this.testCourseCatalogOne.getCurrentIndex());
  }

}