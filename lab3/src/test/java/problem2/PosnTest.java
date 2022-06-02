package problem2;

import javax.lang.model.type.NullType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PosnTest {
  private Posn testPosn_1;
  private Posn testPosn_2;
  private Posn testPosn_3;
  private Posn testPosn_4;
  private Integer testInteger;
  private NullType testNull;
  @BeforeEach
  void setUp() {
    this.testPosn_1 = new Posn(1,1);
    this.testPosn_2 = new Posn(2,2);
    this.testPosn_3 = new Posn(1,1);
    this.testPosn_4 = new Posn(null,null);
    this.testInteger = 1;
    this.testNull = null;
  }

  @Test
  void testEquals() {
    boolean equal_1 = this.testPosn_1.equals(this.testPosn_2);
    boolean equal_2 = this.testPosn_1.equals(this.testPosn_3);
    boolean equal_3 = this.testPosn_1.equals(this.testInteger);
    boolean equal_4 = this.testPosn_1.equals(this.testPosn_4);
    boolean equal_5 = this.testPosn_1.equals(this.testNull);
    Assertions.assertFalse(equal_1);
    Assertions.assertTrue(equal_2);
    Assertions.assertFalse(equal_3);
    Assertions.assertFalse(equal_4);
    Assertions.assertFalse(equal_5);
  }

  @Test
  void testHashCode() {
    Integer hashcode1 = this.testPosn_1.hashCode();
    Integer hashcode2 = this.testPosn_2.hashCode();
    Integer hashcode3 = this.testPosn_3.hashCode();
    Integer hashcode4 = this.testPosn_4.hashCode();
    Assertions.assertEquals(32,hashcode1);
    Assertions.assertEquals(64,hashcode2);
    Assertions.assertEquals(32,hashcode3);
    Assertions.assertEquals(0,hashcode4);

  }
}