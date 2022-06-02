package problem2;
import java.util.Objects;
public class Person {

  protected String firstName;
  protected String lastName;

  /**
   * @param firstName
   * @param lastName
   */
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return firstname
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return get last name
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return Objects.equals(getFirstName(), person.getFirstName()) &&
        Objects.equals(getLastName(), person.getLastName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName());
  }


}
