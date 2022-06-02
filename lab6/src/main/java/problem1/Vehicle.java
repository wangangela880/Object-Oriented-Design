package problem1;

public abstract class Vehicle {
  protected String ID;

  public float getAverageSpeed() {
    return averageSpeed;
  }

  protected float averageSpeed;
  protected float maxSpeed;

  /**
   * @param ID  string
   * @param averageSpeed float
   * @param maxSpeed float
   */
  public Vehicle(String ID, float averageSpeed, float maxSpeed) {
    this.ID = ID;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  /**
   * @param distance
   * @param vehicle
   * @return report
   */
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
