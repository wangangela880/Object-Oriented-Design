package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class NonProfitTest {

  private MonthlyDonation monthlyDonation;
  private OneTimeDonation oneTimeDonation;
  private Pledges pledges;
  private NonProfit nonProfit;

  @BeforeEach
  public void setUp() {
    monthlyDonation = new MonthlyDonation(10.0, LocalDate.of(2020,9,1));
    oneTimeDonation = new OneTimeDonation(20.0, LocalDate.of(2021,9,1));
    pledges = new Pledges(LocalDate.of(2022,10,1), 12.0);
    nonProfit = new NonProfit("NonProfit");
  }

  @Test
  public void getDonations() {
    assertEquals(0, nonProfit.getDonations().size());
  }

  @Test
  public void getOrgName() {
    assertEquals("NonProfit", nonProfit.getOrganizationName());
    NonProfit np = new NonProfit("NonProfit12");
    assertEquals("NonProfit12", np.getOrganizationName());
  }

  @Test
  public void donate() {
    nonProfit.donate(oneTimeDonation);
    assertEquals(1, nonProfit.getDonations().size());
    nonProfit.donate(monthlyDonation);
    assertEquals(2, nonProfit.getDonations().size());
    nonProfit.donate(pledges);
    assertEquals(3, nonProfit.getDonations().size());
  }

  @Test
  public void getTotalDonationsForYear() {
    nonProfit.donate(oneTimeDonation);
    nonProfit.donate(monthlyDonation);
    nonProfit.donate(pledges);
    assertEquals(40.0, nonProfit.getTotalDonationsForYear(2020));
    assertEquals(140.0, nonProfit.getTotalDonationsForYear(2021));
    assertEquals(132.0, nonProfit.getTotalDonationsForYear(2022));
  }
}