package problem2;

public class Cons implements ISet{
  private Integer head;
  private ISet rest;

  public Cons(Integer head,ISet rest){
    this.head = head;
    this.rest = rest;
  }

  public Integer getHead(){
    return head;
  }

  public ISet getRest(){
    return rest;
  }

  @Override
  public ISet emptySet() {
    return new Empty();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public ISet add(Integer n) {
    return new problem2.Cons(n, this);
  }

  @Override
  public Boolean contains(Integer n) {
    if (this.head.equals(n)){
      return true;}
    return this.rest.contains(n);
  }

  @Override
  public ISet remove(Integer n) {
    return null;
  }

  @Override
  public Integer size() {
    return 1 + this.getRest().size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    problem2.Cons cons = (problem2.Cons) o;
    if (getHead() != null ? !getHead().equals(cons.getHead()) : cons.getHead() != null)
      return false;
    return getRest() != null ? getHead().equals(cons.getRest()) : cons.getRest() == null;
  }

  @Override
  public int hashCode() {
    int result = getHead() != null ? getHead().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Cons{" +
        "first=" + head +
        ", rest=" + rest +
        '}';
  }
}
