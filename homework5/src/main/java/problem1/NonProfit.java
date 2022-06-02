package problem1;
import java.util.ArrayList;

public class NonProfit {
  protected String organizationName;
  protected ArrayList<Donation> donations;

  /**
   * Constructor for NonProfit
   * @param organizationName
   */
  public NonProfit(String organizationName) {
    this.organizationName = organizationName;
    this.donations = new ArrayList<>();
  }

  /**
   * A method to add donations
   * @param donation donation
   */
  public void donate(Donation donation) {
    this.donations.add(donation);
  }

  /**
   * A method to get the donations for the year
   * @param year
   * @return total donations for the year
   */
  public double getTotalDonationsForYear(int year) {
    double total = 0;
    for (Donation donation: getDonations()){
      total += donation.getAmount(year);
    }
    return total;
  }

  /**
   * Get donations
   * @return a list of donation.
   */
  public ArrayList<Donation> getDonations() {
    return this.donations;
  }

  /**
   * Get the name of the organization
   * @return the name
   */
  public String getOrganizationName() {
    return this.organizationName;
  }

}