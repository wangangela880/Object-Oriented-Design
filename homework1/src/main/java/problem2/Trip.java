/**class Trip
 *  starting location (a String)
 *  the end location (a String)
 *  start time
 *  end time.
 */
package problem2;

public class Trip {
  String startLocation;
  String endLocation;
  Time startTime;
  Time endTime;
  /**
   * Constructor that creates a new Trip object
   and
   * license plate.
   * @param startPlace- string
   * @param endPlace - string
   * @param  beginTime - Time
   * @param  terminateTime - Time
   */
  public Trip(String startPlace, String endPlace, Time beginTime,Time terminateTime){
    this.startLocation=startPlace;
    this.endLocation=endPlace;
    this.startTime = beginTime;
    this.endTime = terminateTime;
  }

  /**
   * Returns the startPlace of the Trip.
   * @return the startPlace of the Trip.
   */
  public String getStartLocation() {
    return startLocation;
  }
  /**
   * Returns the endPlace of the Trip.
   * @return the endPlace of the Trip.
   */
  public String getEndLocation() {
    return endLocation;
  }
  /**
   * Returns the beginTime of the Trip.
   * @return the beginTime of the Trip.
   */
  public Time getStartTime() {
    return startTime;
  }
  /**
   * Returns the terminateTime of the Trip.
   * @return the terminateTime of the Trip.
   */
  public Time getEndTime() {
    return endTime;
  }
  /**
   * Sets the startLocation of the Trip.
   */
  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }
  /**
   * Sets the endLocation of the Trip.
   */
  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }
  /**
   * Sets the startTime of the Trip.
   */
  public void setStartTime(Time startTime) {
    this.startTime = startTime;
  }
  /**
   * Sets the endTime of the Trip.
   */
  public void setEndTime(Time endTime) {
    this.endTime = endTime;
  }
  /**
   * return the total time of the trip
   * license plate.
   * @param startTime- hour, between 0 and 23, inclusive.
   * @param endTime- minutes, between 0 and 59, inclusive.
   * @return  Time the total time of the trip
   */
  public Time getDuration(Time startTime,Time endTime){
    Time newTime = new Time(0,0,0);
    int startSecond = 0;
    int endSecond = 0;
    int difference = 0;
    int hour_to_sec = 3600;
    int min_to_sec = 60;
    startSecond = startTime.getHour() * hour_to_sec + startTime.getMinutes() * min_to_sec + startTime.getSeconds();
    endSecond = endTime.getHour() * hour_to_sec + endTime.getMinutes() * min_to_sec + endTime.getSeconds();
    difference = endSecond - startSecond;
    newTime.setHour(difference / hour_to_sec);
    int newMinutes = (difference - newTime.getHour() * hour_to_sec) / min_to_sec;
    newTime.setMinutes(newMinutes);
    int newSeconds = difference - newTime.getHour() * hour_to_sec - newTime.getMinutes() * min_to_sec;
    newTime.setSeconds(newSeconds);

    return newTime;
  }



}
