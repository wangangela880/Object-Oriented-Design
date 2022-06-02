package problem2;

import java.util.HashSet;

public class ListOfStrings implements IListOfStrings{
  private Node headerNode;
  public ListOfStrings(Node headerNode){
    this.headerNode = headerNode;
  }

  public Node getHeaderNode(){
    return this.headerNode;
  }

  @Override
  public Boolean isEmpty(){
    return headerNode == null;
  }

  @Override
  public Integer size(){
    if(this.isEmpty()){
      return 0;
    }else{
      Integer size = 1;
      Node cur = this.headerNode;

      while(cur.getPointerToNext() != null){
        size += 1;
        cur = cur.getPointerToNext();
      }
      return size;
    }
  }

  @Override
  public Boolean contains(String words){
    if(this.isEmpty()){
      return false;
    }else{
      Node cur = this.headerNode;

      while(cur.getValue() != null){
        if(cur.getValue().equals(words)){
          return true;
        }
        cur = cur.getPointerToNext();
      }
    }
    return false;
  }

  @Override
  public Boolean containsAll(ListOfStrings words){
    if(this.isEmpty() || words.isEmpty()){
      return false;
    }else{
      Node cur = this.headerNode;
      while(cur.getPointerToNext() != null){
        if(!words.contains(cur.getValue())){
          return false;
        }
        cur = cur.getPointerToNext();
      }
    }
    return true;
  }


  @Override
  public IListOfStrings filterLargerThan(Integer max_length){
    Node tmp = new Node("0",null);
    ListOfStrings newList = new ListOfStrings(tmp);
    if(this.isEmpty()){
      return this;
    }else{
      Node cur = headerNode;
      while(cur.getPointerToNext() != null){
        if(max_length <= cur.getValue().length()){
          tmp.setPointerToNext(cur);
          tmp = tmp.getPointerToNext();
        }
        cur = cur.getPointerToNext();
      }
      return newList;
    }
  }

  @Override
  public IListOfStrings addString(String element) {
    Node temp = new Node(element,null);
    if(isEmpty()){
      headerNode = temp;
      return this;
    }else{
      Node cur = headerNode;
      while(cur.getPointerToNext() != null){
        cur = cur.getPointerToNext();
      }
      cur.setPointerToNext(temp);
    }
    return this;
  }

  @Override
  public Boolean hasDuplicates(String word) {
    HashSet <String> set = new HashSet<String>();
    if(isEmpty()){
      return false;
    }else{
      Node cur = headerNode;
      while(cur.getPointerToNext() != null){
        if(!set.add(cur.getValue())){
          return false;
        }
        cur = cur.getPointerToNext();
      }
    }
    return false;
  }

  @Override
  public IListOfStrings removeDuplicates(String word) {
    Node tmp = headerNode;
    ListOfStrings newList = new ListOfStrings(tmp);
    HashSet <String> set = new HashSet<String>();
    if(isEmpty()){
      return this;
    }else{
      Node cur = headerNode;
      while(cur.getPointerToNext() != null){
        if(set.add(cur.getValue())){
          tmp.setPointerToNext(cur);
          tmp = tmp.getPointerToNext();
        }
        cur = cur.getPointerToNext();
      }
      return newList;
    }
  }

}
