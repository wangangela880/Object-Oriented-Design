package problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Athlete;
import problem1.Name;

class AthleteTest {
  private Athlete testAthlete;
  private Name testName;

  @BeforeEach
  void setUp() {
    this.testName = new Name("Peter","Pan","Wendy");
    this.testAthlete = new Athlete(this.testName,165.00,50.00,"leagueA");

  }

  @Test
  void getAthletesName() {
    Name testName_one = new Name("Peter","Pan","Wendy");
    Assertions.assertEquals(testName_one.first_name,this.testAthlete.getAthletesName().first_name);
    Assertions.assertEquals(testName_one.last_name,this.testAthlete.getAthletesName().last_name);
    Assertions.assertEquals(testName_one.middle_name,this.testAthlete.getAthletesName().middle_name);
  }

  @Test
  void getHeight() {
    Assertions.assertEquals(165.00,this.testAthlete.getHeight());
  }

  @Test
  void getWeight() {
    Assertions.assertEquals(50.00,this.testAthlete.getWeight());
  }

  @Test
  void getLeague() {
    Assertions.assertEquals("leagueA",this.testAthlete.getLeague());
  }
}