package problem1;

import java.util.Objects;
/**
 *  Class Room
 *  A maximum occupancy - This is the maximum number of people that can stay in the
 * room.
 * A price - The cost of a single night’s stay. Must be greater than 0.
 * A number of guests - The number of guests currently booked into the room. This value
 * should be 0 when the room is first created in the system.
 *
 */
public class Room {

  protected int maxOccupancy;
  protected double price;
  protected int guestNumber;

  protected static int max_single = 1;
  protected static int max_double = 2;
  protected static int max_family = 4;

  /**
   * Constructs a new Room object
   *
   * @param max -max occupancy,encoded as an integer
   * @param price- current Price, encoded as a double
   * @param guest - A number of guests, encoded as an integer
   */

  public Room(int max, double price, int guest){
    this.maxOccupancy = max;
    this.price = price;
    this.guestNumber = guest;
  }
  /**
   * Getter
   *
   * @return the maxOccupancy
   */
  public int getMaxOccupancy() {
    return maxOccupancy;
  }

  /**
   * Getter
   *
   * @return the price
   */
  public double getPrice() {
    return price;
  }
  /**
   * Setter
   *
   * @param price
   */
  public void setPrice(double price) throws IllegalArgumentException{
    if(price>0){
      this.price = price;
    }
    else {
      throw new IllegalArgumentException("Price can not be negative");
    }
  }
  /**
   * Getter
   *
   * @return the guest number
   */
  public int getGuestNumber() {
    return guestNumber;
  }
  /**
   * Setter
   *
   * @param guestNumber
   */
  public void setGuestNumber(int guestNumber) throws IllegalArgumentException{
    if(guestNumber>=0){
      this.guestNumber = guestNumber;
    }
    else {
      throw new IllegalArgumentException("guestNumber can not be negative");
    }

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Room)) return false;
    Room room = (Room) o;
    return Objects.equals(getMaxOccupancy(), room.getMaxOccupancy()) && Objects.equals(getGuestNumber(), room.getGuestNumber()) && Objects.equals(getPrice(), room.getPrice());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMaxOccupancy(), getGuestNumber(), getPrice());
  }
  /**
   * isAvailable
   *checks if the room is available or not
   * @return checks if the room is available or not
   */
  public boolean isAvailable(){
    if (guestNumber == 0){
      return true;
    }
    return false;
  }
  /**
   * bookRoom
   * @param guests  the number of guests that would like to
   * stay in the room.
   */
  public void bookRoom(int guests)throws IllegalArgumentException{
    if (guestNumber == 0 && 0 < guests && guests <= maxOccupancy){
      setGuestNumber(guests);
    }else{
      throw new IllegalArgumentException("Guest number is illegal");
    }
  }


}
