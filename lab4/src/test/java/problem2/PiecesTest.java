package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiecesTest {
  private Pieces testPiece;

  @BeforeEach
  void setUp() {
    this.testPiece = new Pieces("A",10);
  }

  @Test
  void getName() {
    assertEquals("A",this.testPiece.getName());
  }

  @Test
  void setName() {
    this.testPiece.setName("B");
    assertEquals("B",this.testPiece.getName());
  }

  @Test
  void getAge() {
    assertEquals(10,this.testPiece.getAge());
  }

  @Test
  void setAge() {
    try{
      this.testPiece.setAge(20);
      assertEquals(20,this.testPiece.getAge());
    }
    catch (IllegalArgumentException e){
      fail("An exception should not have been thrown");
    }

    try{
      this.testPiece.setAge(-20);
      fail("An exception should not have been thrown");
    }
    catch (IllegalArgumentException e){
    }
  }
}