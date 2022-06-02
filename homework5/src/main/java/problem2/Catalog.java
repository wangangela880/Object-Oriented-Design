package problem2;
import java.util.ArrayList;
import java.util.Objects;

public class Catalog {


  private ArrayList<Item> collectionItems;

  /**
   * Construct a new empty catalog
   */
  public Catalog(){
    this.collectionItems = new ArrayList<Item>();
  }

  /**
   * @param items collection of items
   */
  public Catalog(ArrayList<Item> items){
    this.collectionItems = items;
  }

  /**
   * Gets the items
   * @return the items in the collection
   */
  public ArrayList<Item> getCollectionItems() {
    return this.collectionItems;
  }

  /**
   * Adds a new Item
   * @param item
   * @throws ItemAlreadyInException
   */
  public void add(Item item) throws ItemAlreadyInException {
    // add only if the current collection does not contain the same Item yet
    if(!this.collectionItems.contains(item)) {
      this.collectionItems.add(item);
    }else{
      throw new ItemAlreadyInException();
    }
  }

  /**
   * Removes an Item
   * @param item
   * @throws EmptyCollectionException
   * @throws ItemNotInException
   */
  public void remove(Item item)
      throws EmptyCollectionException, ItemNotInException {
    // If there is no item in the collection and we try to remove, should throw Exception.
    if(this.collectionItems.isEmpty()){
      throw new EmptyCollectionException();
    }
    // If the specified item is not in the collection, should throw Exception.
    if(!this.collectionItems.contains(item)){
      throw new ItemNotInException();
    }else {
      this.collectionItems.remove(item);
    }
  }

  /**
   * @param keyword search for title
   * @return all items in the catalog with the title
   */
  public ArrayList<Item> search(String keyword){
    ArrayList<Item> withKeyword = new ArrayList<Item>();
    for(Item each: this.collectionItems){
      if(each.getTitle().toLowerCase().contains(keyword.toLowerCase())){
        withKeyword.add(each);
      }
    }
    return withKeyword;
  }

  /**
   * @param author
   * @return Books by the given Author
   */
  public ArrayList<Item> search(Author author){
    ArrayList<Item> booksWithAuthor = new ArrayList<Item>();
    for(Item each: this.collectionItems){
      if(each.getCreator().equals(author)){
        booksWithAuthor.add(each);
      }
    }
    return booksWithAuthor;
  }

  /**
   * @param artist
   * @return musics  by this artist
   */
  public ArrayList<Item> search(RecordingArtist artist){
    ArrayList<Item> musicWithArtist = new ArrayList<Item>();
    for(Item each: this.collectionItems){
      if(each.getCreator().equals(artist)){
        musicWithArtist.add(each);
      }
    }
    return musicWithArtist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Catalog)) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(getCollectionItems(), catalog.getCollectionItems());

  }

  @Override
  public int hashCode() {
    return Objects.hash(getCollectionItems());
  }

  @Override
  public String toString() {
    String itemsDescription = "";
    for(Item item: this.collectionItems){
      itemsDescription += item.toString() + "\n";
    }
    return "Catalog: " + itemsDescription;

  }
}
