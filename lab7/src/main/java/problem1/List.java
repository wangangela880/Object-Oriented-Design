package problem1;

public interface List {

  Integer size();
  boolean isEmpty();
  List add (Integer element);
  Integer last() throws InvalidCallException;

  boolean contains(int element);
  int elementAt(int index) throws IndexOutOfBoundsException;
  int sum();

}
