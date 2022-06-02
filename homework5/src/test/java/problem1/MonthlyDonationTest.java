package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class MonthlyDonationTest {

  private MonthlyDonation monthlyDonation;

  @BeforeEach
  public void setUp() {
    monthlyDonation = new MonthlyDonation(25, LocalDate.of(2021,10,15));
  }

  @Test
  public void getAmount() {
    assertEquals(25, monthlyDonation.getAmount());
  }

  @Test
  public void getStartDate() {
    assertEquals(LocalDate.of(2021,10,15), monthlyDonation.getStartDate());
    MonthlyDonation monthlyDonationNoDate = new MonthlyDonation(10.00);
    assertEquals(LocalDate.now(), monthlyDonationNoDate.getStartDate());
  }

  @Test
  public void setCancellationDate() {
    LocalDate date = LocalDate.of(2021,10,15);
    MonthlyDonation monthlyDonationNoCancellationDate = new MonthlyDonation(10.00, date);
    assertEquals(LocalDate.MAX, monthlyDonationNoCancellationDate.getEndDate());
    LocalDate invalidDate = LocalDate.of(2021,1,1);
    boolean error = false;
    try {
      monthlyDonationNoCancellationDate.setCancellationDate(invalidDate);
    } catch (IllegalArgumentException e) {
      error = true;
    }
    assertTrue(error);
    assertEquals(LocalDate.MAX, monthlyDonationNoCancellationDate.getEndDate());
    LocalDate endDate = LocalDate.of(2022,4,1);
    monthlyDonationNoCancellationDate.setCancellationDate(endDate);
    assertEquals(endDate, monthlyDonationNoCancellationDate.getEndDate());
  }

  @Test
  public void getYearAmount() {
    assertEquals(75, monthlyDonation.getAmount(2021));
    assertEquals(300, monthlyDonation.getAmount(2022));
    monthlyDonation.setCancellationDate(LocalDate.of(2022,4,1));
    assertEquals(75, monthlyDonation.getAmount(2021));
    assertEquals(75, monthlyDonation.getAmount(2021));
  }
}