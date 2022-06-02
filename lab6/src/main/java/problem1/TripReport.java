package problem1;

public class TripReport {
  private Vehicle vehicle;
  private float speedPerMile;
  private float distanceInMile;
  private Integer durationInMin;

  /**
   * @param vehicle
   * @param speedPerMile
   * @param distanceInMile
   * @param durationInMin
   */
  public TripReport(Vehicle vehicle, float speedPerMile, float distanceInMile,
      Integer durationInMin) {
    this.vehicle = vehicle;
    this.speedPerMile = speedPerMile;
    this.distanceInMile = distanceInMile;
    this.durationInMin = durationInMin;
  }

  /**
   * @return vehicle
   */
  public Vehicle getVehicle() {
    return vehicle;
  }
  /**
   * @return speedPerMile
   */
  public float getSpeedPerMile() {
    return speedPerMile;
  }
  /**
   * @return distanceInMile
   */
  public float getDistanceInMile() {
    return distanceInMile;
  }
  /**
   * @return durationInMin
   */
  public Integer getDurationInMin() {
    return durationInMin;
  }

  /**
   * @param vehicle
   */
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  /**
   * @param speedPerMile
   */
  public void setSpeedPerMile(float speedPerMile) {
    this.speedPerMile = speedPerMile;
  }

  /**
   * @param distanceInMile
   */
  public void setDistanceInMile(float distanceInMile) {
    this.distanceInMile = distanceInMile;
  }

  /**
   * @param durationInMin
   */
  public void setDurationInMin(Integer durationInMin) {
    this.durationInMin = durationInMin;
  }
}
