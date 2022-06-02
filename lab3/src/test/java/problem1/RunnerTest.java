package problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Name;
import problem1.Runner;

class RunnerTest {
  private Runner testRunner;
  private Name testName;
  @BeforeEach
  void setUp() {
    this.testName = new Name("Zoey","Swift","Han");
    this.testRunner = new Runner(this.testName,158.00,45.00,"leagueB",1800.00,900.00,"run_one");
  }

  @Test
  void getBest_5k_time() {
    Assertions.assertEquals(1800.00,this.testRunner.getBest_5k_time());
  }

  @Test
  void getBest_half_time() {
    Assertions.assertEquals(900.00,this.testRunner.getBest_half_time());
  }

  @Test
  void getRunning() {
    Assertions.assertEquals("run_one",this.testRunner.getRunning());
  }
}