package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FleetManagerTest {
  private Boat testBoat;
  private TripReport testReport;
  private FleetManager testManager;


  @BeforeEach
  void setUp() {
    testBoat = new Boat("123",10,20);
    testReport = new TripReport(testBoat,0,0,0);
    testManager = new FleetManager();
  }

  @Test
  void drive() {
    float distance = 100;
    testReport = testManager.drive(distance,testBoat);
    TripReport testReportOne = new TripReport(testBoat,10,100,10);
    Assertions.assertEquals(testReport.getSpeedPerMile(),testReportOne.getSpeedPerMile());
    Assertions.assertEquals(testReport.getDurationInMin(),testReportOne.getDurationInMin());
    Assertions.assertEquals(testReport.getDistanceInMile(),testReportOne.getDistanceInMile());

  }

  @Test
  void testDrive() {
    float distance = 100;
    float speed = 30;
    testReport = testManager.drive(speed,distance,testBoat);
    TripReport testReportOne = new TripReport(testBoat,20,100,5);
    Assertions.assertEquals(testReport.getSpeedPerMile(),testReportOne.getSpeedPerMile());
    Assertions.assertEquals(testReport.getDurationInMin(),testReportOne.getDurationInMin());
    Assertions.assertEquals(testReport.getDistanceInMile(),testReportOne.getDistanceInMile());

  }

  @Test
  void testDrive1() {
    int time = 10;
    float distance = 100;
    testReport = testManager.drive(time,distance,testBoat);
    TripReport testReportOne = new TripReport(testBoat,10,100,10);
    Assertions.assertEquals(testReport.getSpeedPerMile(),testReportOne.getSpeedPerMile());
    Assertions.assertEquals(testReport.getDurationInMin(),testReportOne.getDurationInMin());
    Assertions.assertEquals(testReport.getDistanceInMile(),testReportOne.getDistanceInMile());
  }

  @Test
  void testDrive2() {
    float speed = 10;
    int time = 10;
    testReport = testManager.drive(speed,time,testBoat);
    TripReport testReportOne = new TripReport(testBoat,10,100,10);
    Assertions.assertEquals(testReport.getSpeedPerMile(),testReportOne.getSpeedPerMile());
    Assertions.assertEquals(testReport.getDurationInMin(),testReportOne.getDurationInMin());
    Assertions.assertEquals(testReport.getDistanceInMile(),testReportOne.getDistanceInMile());
  }
}