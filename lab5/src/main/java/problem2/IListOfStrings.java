package problem2;

public interface IListOfStrings {
  Boolean isEmpty();
  Integer size();
  Boolean contains(String word);
  Boolean containsAll(ListOfStrings words);
  IListOfStrings filterLargerThan(Integer max_length);

  IListOfStrings addString(String element);
  Boolean hasDuplicates(String word);
  IListOfStrings removeDuplicates(String word);

}
