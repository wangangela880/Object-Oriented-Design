import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {
  private Author jane;
  @BeforeEach
  void setUp() {
    this.jane = new Author("Jane Doe","j@a.com","222 Main St, Seattle, 98980");
  }

  @Test
  void getName() {
    Assertions.fail("Not yet implemented");
  }

  @Test
  void getEmail() {
    Assertions.fail("Not yet implemented");
  }

  @Test
  void getAddress() {
    Assertions.fail("Not yet implemented");
  }
}