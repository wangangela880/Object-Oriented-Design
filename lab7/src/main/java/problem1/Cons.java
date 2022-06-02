package problem1;

import problem2.ISet;

/**
 * Non-empty list of integers
 */
public class Cons implements List {
  private Integer first;
  private List rest;

  public Cons(Integer first, ISet rest) {
    this.first = first;
    this.rest = rest;
  }

  public Integer getFirst() {
    return first;
  }

  public List getRest() {
    return rest;
  }

  @Override
  public Integer size(){
    return 1 + this.getRest().size();
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element, this);
  }

  @Override
  public Integer last() throws InvalidCallException {
    if (this.rest.isEmpty()){
      return this.first;
    }
    else{
      return this.rest.last();
    }
  }

  @Override
  public boolean contains(int element) {
    if (this.first.equals(element)){
      return true;}
    return this.rest.contains(element);
  }

  @Override
  public int elementAt(int index) throws IndexOutOfBoundsException {
    if(index < 0 || index >= this.size()){
      throw new IndexOutOfBoundsException();
    }
    else if(index == 0){
      return this.first;
    }
    else return this.rest.elementAt(index - 1);
  }

  @Override
  public int sum() {
    return this.first + this.rest.sum();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cons cons = (Cons) o;
    if (getFirst() != null ? !getFirst().equals(cons.getFirst()) : cons.getFirst() != null)
      return false;
    return getRest() != null ? getFirst().equals(cons.getRest()) : cons.getRest() == null;
  }

  @Override
  public int hashCode() {
    int result = getFirst() != null ? getFirst().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Cons{" +
        "first=" + first +
        ", rest=" + rest +
        '}';
  }
}
