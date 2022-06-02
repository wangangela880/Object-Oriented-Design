/**class Time
 * hour, between 0 and 23, inclusive.
 * minutes, between 0 and 59, inclusive.
 * seconds, between 0 and 59 inclusive.
 */
package problem2;

public class Time {
  private int hour;
  private int minutes;
  private int seconds;
  /**
   * Constructor that creates a new Time object
   and
   * license plate.
   * @param hour - hour, between 0 and 23, inclusive.
   * @param minute - minutes, between 0 and 59, inclusive.
   * @param  second - seconds, between 0 and 59 inclusive.
   */
  public Time(int hour,int minute,int second){
    this.hour = hour;
    this.minutes = minute;
    this.seconds = second;
  }
  /**
   * Returns the hour of the Time.
   * @return the hour of the Time.
   */
  public int getHour() {
    if (hour >= 0 && hour <= 59){
      return hour;
    }else{
      System.out.println("Please reset the hour");
      return -1;
    }

  }
  /**
   * Returns the minutes of the Time.
   * @return the minutes of the Time.
   */
  public int getMinutes() {
    if (minutes >= 0 && minutes <= 59){
      return minutes;
    }else{
      System.out.println("Please reset the minutes");
      return -1;
    }
  }
  /**
   * Returns the seconds of the Time.
   * @return the second of the Time.
   */
  public int getSeconds() {
    if (seconds >= 0 && seconds <= 59){
      return seconds;
    }else{
      System.out.println("Please reset the second");
      return -1;
    }
  }
  /**
   * Sets the hour of the Time.
   */
  public void setHour(int hour) {
    if (hour >= 0 && hour <= 59){
      this.hour = hour;
    }else{
      System.out.println("Please reset the hour");
    }

  }
  /**
   * Sets the minutes of the Time.
   */
  public void setMinutes(int minutes) {
    if (minutes >= 0 && minutes <= 59){
      this.minutes = minutes;
    }else{
      System.out.println("Please reset the minutes");
    }
  }
  /**
   * Sets the seconds of the Time.
   */
  public void setSeconds(int seconds) {
    if (seconds >= 0 && seconds <= 59){
      this.seconds = seconds;
    }else{
      System.out.println("Please reset the seconds");
    }
  }
}
