package problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Baseballplayer;
import problem1.Name;

class BaseballplayerTest {
  private Baseballplayer testBaseballplayer;
  private Name testName;
  @BeforeEach
  void setUp() {
    this.testName = new Name("John","Smith","Yan");
    this.testBaseballplayer = new Baseballplayer(this.testName,180.00,70.00,"leagueA","teamA",10.00,3);
  }

  @Test
  void getTeam_name() {
    Assertions.assertEquals("teamA",this.testBaseballplayer.getTeam_name());
  }

  @Test
  void getAve_batting() {
    Assertions.assertEquals(10.00,this.testBaseballplayer.getAve_batting());
  }

  @Test
  void getHome_run() {
    Assertions.assertEquals(3,this.testBaseballplayer.getHome_run());
  }
}