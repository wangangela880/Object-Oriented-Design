package problem2;

import java.util.Objects;

public class SetImmutable implements Set{
  private int[] set;
  private int size;
  private static final int NUM_SLOTS = 1;
  private static final int NOT_FOUND = -1;

  /**
   * This is the constructor for the Set.
   *
   **/
  public SetImmutable(){
    this.set = new int[NUM_SLOTS];
    this.size = 0;
  }

  /**
   * Copy constructor for duplicating a set.
   *
   **/
  public SetImmutable(int size,int[] set)
  {
    this.set = set;
    this.size = size;
  }
  /**
   * Creates an empty set
   * @return An empty set
   */
  @Override
  public Set emptySet() {
    return new SetImmutable();
  }

  @Override
  public Boolean isEmpty() {
    if(this.size == 0){
      return true;
    }
    return false;
  }
  /**
   * Helper function that checks if there is room in the items array to add a new item to the list.
   *
   * @return true if there is space available, false otherwise
   */
  private boolean inSizeRange() {
    return (this.size + 1 <= this.set.length);
  }

  /**
   * Increase the size of the data array. This involves creating a temporary new array, adding the
   * existing data to the new array, then setting the data array to the new array.
   *
   * @return a new items array
   */
  private int[] resize() {
    int newSize = this.size + NUM_SLOTS;
    int[] newSet = new int[newSize];
    this.copyItems(this.set, newSet,0,this.set.length,0);
    return newSet;
  }

  /**
   * @param n
   * @return
   */
  @Override
  public Set add(Integer n) {
    int[] newSet;
    if(this.contains(n)){
      newSet = this.set.clone();
      return new SetImmutable(this.size,newSet);
    }

    if(!this.inSizeRange()){
      newSet = this.resize();
    }else{
      newSet = this.set.clone();
    }

    newSet[this.size] = n;
    return new SetImmutable(this.size + 1,newSet);

  }

  /**
   * @param n
   * @return
   */
  @Override
  public Boolean contains(Integer n) {
    for(int i = 0;i < this.size; i++){
      if (this.set[i] == n){
        return true;
      }
    }
    return false;
  }

  /**
   * Helper method that returns the index of an item, if found.
   * @param n The item to find.
   * @return The item's index, if it is in the list, or -1.
   */
  private int findItem(int n) {
    for (int i = 0; i < this.size; i++) {
      if (this.set[i] == n)
        return i;
    }
    return NOT_FOUND;
  }

  /**
   * Helper function used by add and insert methods. Copies the items from one array to another.
   * @param from The array to copy from.
   * @param to The array to copy to.
   * @param fromStart The index in the "from" array to start copying from.
   * @param fromEnd The index in the "from" array to end at (exclusive).
   * @param toStart The index in the "to" array to start copying to.
   */
  private void copyItems(int[] from, int[] to, int fromStart, int fromEnd, int toStart) {
    if (toStart >= 0) {
      for (int i = fromStart; i < fromEnd; i++) {
        to[toStart] = from[i];
        toStart++;
      }
    }
  }

  /**
   * @param n
   * @return
   */
  @Override
  public Set remove(Integer n) {
    int index = this.findItem(n);
    if(index == NOT_FOUND){
      return this;
    }
    int[] newSet = new int[this.size-1];
    this.copyItems(this.set,newSet,0,index,0);
    this.copyItems(this.set,newSet,index + 1,this.set.length,index);
    return new SetImmutable(this.size - 1,newSet);
  }

  /**
   * @return
   */
  @Override
  public Integer size() {
    return this.size;
  }

  /**
   * Helper method that checks if this list contains the same items as the given array. null items are excluded.
   * @param items The array to compare this.items to.
   * @return true if both arrays contain the same non-null items in the same order, false otherwise.
   */
  private boolean sameItems(int[] items) {
    for (int i = 0; i < this.size; i++) {
      if (i >= items.length || !(this.set[i] == items[i]))
        return false;
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetImmutable that = (SetImmutable) o;
    return size == that.size && this.sameItems(that.set);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result;
    for (int i = 0; i < this.size; i++){
      result += Objects.hash(this.set[i]);
    }
    return result;
  }
}
