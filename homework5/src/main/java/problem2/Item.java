package problem2;

import java.util.Objects;

public class Item {

  private Person creator;
  private String title;
  private Integer year;


  /**
   * @param creator
   * @param title
   * @param year
   */
  public Item(Person creator, String title, Integer year) {
    this.creator = creator;
    this.title = title;
    this.year = year;
  }


  /**
   * @return creator
   */
  public Person getCreator() {
    return creator;
  }

  /**
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return year
   */
  public Integer getYear() {
    return year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item)) return false;
    Item item = (Item) o;

    return Objects.equals(getCreator(), item.getCreator()) &&
        Objects.equals(getTitle(), item.getTitle())&&
        Objects.equals(getYear(), item.getYear());
  }

}
