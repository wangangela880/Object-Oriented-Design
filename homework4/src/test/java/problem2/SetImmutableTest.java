package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetImmutableTest {
  private SetImmutable testSetImmutable;
  private SetImmutable testSetImmutableTwo;
  private int[] testSet;

  @BeforeEach
  void setUp() {
    this.testSetImmutable = new SetImmutable();
    this.testSet = new int[1];
    this.testSet[0] = 1;
    this.testSetImmutableTwo = new SetImmutable(1,this.testSet);
  }

  @Test
  void emptySet() {
    SetImmutable newSetImmutable = new SetImmutable();
    assertTrue(this.testSetImmutable.emptySet().equals(newSetImmutable));

  }

  @Test
  void isEmpty() {
    assertFalse(this.testSetImmutableTwo.isEmpty());
    assertTrue(this.testSetImmutable.isEmpty());
  }

  @Test
  void add() {
    SetImmutable newTestSetImmutable = (SetImmutable) this.testSetImmutable.add(1);
    assertTrue(newTestSetImmutable.equals(this.testSetImmutableTwo));
    SetImmutable newTestSetImmutableTwo = (SetImmutable) this.testSetImmutableTwo.add(1);
    assertTrue(newTestSetImmutableTwo.equals(this.testSetImmutableTwo));

  }

  @Test
  void contains() {
    assertTrue(this.testSetImmutableTwo.contains(1));
    assertFalse(this.testSetImmutable.contains(2));
  }

  @Test
  void remove() {
    SetImmutable newTestSetImmutable = (SetImmutable) this.testSetImmutableTwo.remove(1);
    assertTrue(this.testSetImmutable.equals( newTestSetImmutable));
  }

  @Test
  void size() {
    assertEquals(1,this.testSetImmutableTwo.size());
  }

  @Test
  void testEquals() {
  }

  @Test
  void testHashCode() {
  }
}