package problem2;

public class FleetManager {
  public TripReport drive(float distance, Vehicle vehicle){
    float speedPerMile = vehicle.getAverageSpeed();
    float duration = distance / vehicle.getAverageSpeed();
    Integer durationInMin = (int)duration;
    TripReport report = new TripReport(vehicle,speedPerMile,distance,durationInMin);
    return report;
  }

  public TripReport drive(float speed, float distance, Vehicle vehicle){
    if (speed > vehicle.getMaxSpeed()){
      speed = vehicle.getMaxSpeed();
    }
    float duration = distance / vehicle.getMaxSpeed();
    Integer durationInMin = (int)duration;
    TripReport report = new TripReport(vehicle,speed,distance,durationInMin);

    return report;
  }

  public TripReport drive(int timeInMin, float distance, Vehicle vehicle){
    float actualSpeed = distance / timeInMin;
    if(actualSpeed > vehicle.getAverageSpeed()){
      actualSpeed = vehicle.getAverageSpeed();
    }
    TripReport report = new TripReport(vehicle,actualSpeed,distance,timeInMin);
    return report;
  }

  public TripReport drive(float speed, int timeInMin, Vehicle vehicle){
    float distance = speed * timeInMin;
    TripReport report = new TripReport(vehicle,speed,distance,timeInMin);
    return report;
  }

}
