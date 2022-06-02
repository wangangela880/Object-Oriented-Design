package problem1;

public class DoubleRoom extends Room{
  /**
   * Constructs a new Room object
   *
   * @param max -max occupancy,encoded as an integer
   * @param price- current Price, encoded as a double
   * @param guest - A number of guests, encoded as an integer
   */
  public DoubleRoom(int max, double price, int guest) {
    super(max, price, guest);
  }
}
