package problem2;

public class Node {

  private String value;
  private Node pointerToNext;

  public Node(String value, Node pointerToNext) {
    this.value = value;
    this.pointerToNext = pointerToNext;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Node getPointerToNext() {
    return pointerToNext;
  }

  public void setPointerToNext(Node pointerToNext) {
    this.pointerToNext = pointerToNext;
  }

}
