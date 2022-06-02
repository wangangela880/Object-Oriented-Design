package problem1;

import java.time.LocalDate;

public class OneTimeDonation extends Donation {
  private static final double ZERO_DONATION = 0;

  /**
   * Constructor of OneTimeDonation
   * @param amount the amount of the donation
   * @param startDate the donation start date
   */
  public OneTimeDonation(double amount, LocalDate startDate) {
    super(amount, startDate);
  }

  /**
   * Constructor of OneTimeDonation
   * @param amount the amount of the donation
   */
  public OneTimeDonation(double amount) {
    super(amount);
  }

  @Override
  public double getAmount(int year) {
    if(this.getStartDate().getYear() == year){
      return super.getAmount();
    }
    return ZERO_DONATION;
  }
}