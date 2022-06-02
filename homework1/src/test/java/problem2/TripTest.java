package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripTest {
  private Trip testTrip;
  private Time testStart;
  private Time testEnd;
  @BeforeEach
  void setUp() {
    this.testStart = new Time(1,1,1);
    this.testEnd = new Time(1,10,30);
    this.testTrip = new Trip("UW","Tacoma",this.testStart,this.testEnd);
  }

  @Test
  void getStartLocation() {
    Assertions.assertEquals("UW",this.testTrip.getStartLocation());
  }

  @Test
  void getEndLocation() {
    Assertions.assertEquals("Tacoma",this.testTrip.getEndLocation());
  }

  @Test
  void getStartTime() {
    Assertions.assertEquals(this.testStart,this.testTrip.getStartTime());
  }

  @Test
  void getEndTime() {
    Assertions.assertEquals(this.testEnd,this.testTrip.getEndTime());
  }

  @Test
  void getDuration() {
    Time difference = new Time(0,9,29);
    Time a = this.testTrip.getDuration(this.testStart,this.testEnd);
    Assertions.assertEquals(difference.getHour(),a.getHour());
    Assertions.assertEquals(difference.getMinutes(),a.getMinutes());
    Assertions.assertEquals(difference.getSeconds(),a.getSeconds());
  }

  @Test
  void setStartLocation() {
    this.testTrip.setStartLocation("Tacoma");
    assertEquals("Tacoma",this.testTrip.getStartLocation());
  }

  @Test
  void setEndLocation() {
    this.testTrip.setEndLocation("UW");
    assertEquals("UW",this.testTrip.getStartLocation());
  }

  @Test
  void setStartTime() {
    Time newStartTime = new Time(0,0,0);
    this.testTrip.setStartTime(newStartTime);
    assertEquals(newStartTime,this.testTrip.getStartTime());
  }

  @Test
  void setEndTime() {
    Time newEndTime = new Time(1,1,1);
    this.testTrip.setEndTime(newEndTime);
    assertEquals(newEndTime,this.testTrip.getEndTime());
  }


}