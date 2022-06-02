package problem2;

public class Book extends Item{

  /**
   * @param creator
   * @param title
   * @param year
   */
  public Book(Author creator, String title, Integer year) {
    super(creator, title, year);
  }
}
