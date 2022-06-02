package problem2;

public class Pieces {

  /**
   *  All Pieces contain information about their:
   * Name, containing information about a Piece’s first and last name
   * Age, which is an Integer in the range [0, 128], containing information a
   * Piece’s age
   *
   */

  private String name;
  private int age;

  /**
   * Constructs a new Piece object
   *
   * @param name -name, encoded as string
   * @param age - current Price, encoded as a int
   */
  public Pieces(String name,int age) {
    this.name = name;
    this.age = age;
  }
  /**
   * Getter
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * Setter
   *
   * SET the name
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * Getter
   *
   * @return the age
   */
  public int getAge() {
    return age;
  }
  /**
   * Setter
   *
   * SET the age
   */
  public void setAge(int age) throws IllegalArgumentException{
    if(age>=0 && age<=128){
      this.age = age;
    }
    else {
      throw new IllegalArgumentException("Age can not be negative");
    }
  }

}
