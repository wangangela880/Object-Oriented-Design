package problem2;

public class Empty implements ISet{

  @Override
  public ISet emptySet() {
    return new Empty();
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public ISet add(Integer n) {
    return null;
  }

  @Override
  public Boolean contains(Integer n) {
    return null;
  }

  @Override
  public ISet remove(Integer n) {
    return null;
  }

  @Override
  public Integer size() {
    return null;
  }
}
