package problem2;

public class Bus extends Vehicle {

  /**
   * @param ID           string
   * @param averageSpeed float
   * @param maxSpeed     float
   */
  public Bus(String ID, float averageSpeed, float maxSpeed) {
    super(ID, averageSpeed, maxSpeed);
  }
  /**
   * @param distance
   * @param vehicle
   * @return report
   */
  @Override
  public TripReport drive(float distance, Vehicle vehicle){
    TripReport report = new TripReport(vehicle,0,0,0);
    float speedPerMile = vehicle.getAverageSpeed();
    float duration = distance / vehicle.getAverageSpeed();
    Integer durationInMin = (int)duration;
    report.setSpeedPerMile(speedPerMile);
    report.setDistanceInMile(distance);
    report.setDurationInMin(durationInMin);
    return report;
  }
}
