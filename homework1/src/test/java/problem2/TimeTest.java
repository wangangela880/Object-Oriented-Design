package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeTest {
  private Time testTime;

  @BeforeEach
  void setUp() {
    this.testTime = new Time(1,12,30);
  }

  @Test
  void getHour() {
    Assertions.assertEquals(1,this.testTime.getHour());
  }

  @Test
  void getMinutes() {
    Assertions.assertEquals(12,this.testTime.getMinutes());
  }

  @Test
  void getSeconds() {
    Assertions.assertEquals(30,this.testTime.getSeconds());
  }

  @Test
  void setHour() {
    this.testTime.setHour(2);
    assertEquals(2,this.testTime.getHour());
  }

  @Test
  void setMinutes() {
    this.testTime.setMinutes(22);
    assertEquals(22,this.testTime.getMinutes());
  }

  @Test
  void setSeconds() {
    this.testTime.setSeconds(40);
    assertEquals(40,this.testTime.getSeconds());
  }
}