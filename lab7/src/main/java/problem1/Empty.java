package problem1;

/**
 * Empty list of integers
 */
public class Empty implements List{

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return true;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element, this);
  }

  @Override
  public Integer last() throws InvalidCallException{
    throw new InvalidCallException("Called last() on empty");
  }

  @Override
  public boolean contains(int element) {
    return false;
  }

  @Override
  public int elementAt(int index) throws IndexOutOfBoundsException {
    throw new IndexOutOfBoundsException();
  }

  @Override
  public int sum() {
    return 0;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if(o == null || getClass()!= o.getClass()) return false;
    else return true;
  }

  @Override
  public int hashCode() {return 42;}

  @Override
  public String toString(){return "Empty{}";}
}
