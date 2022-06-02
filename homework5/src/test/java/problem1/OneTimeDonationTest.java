package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class OneTimeDonationTest {
  private OneTimeDonation oneTimeDonation;

  @BeforeEach
  public void setUp() {
    oneTimeDonation = new OneTimeDonation(20.0, LocalDate.of(2021,10,1));
  }

  @Test
  public void getAmount() {
    assertEquals(20.0, oneTimeDonation.getAmount());
  }

  @Test
  public void getStartDate() {
    assertEquals(LocalDate.of(2021,10,1), oneTimeDonation.getStartDate());
    OneTimeDonation oneTimeDonationNoDate = new OneTimeDonation(20.0);
    assertEquals(LocalDate.now(), oneTimeDonationNoDate.getStartDate());
  }


  @Test
  public void getYearAmount() {
    assertEquals(20.0, oneTimeDonation.getAmount(2021));
  }

}