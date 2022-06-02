package problem1;

import java.time.LocalDate;
import java.time.Month;

public class MonthlyDonation extends Donation {
  private static final double ZERO_DONATION = 0;
  private static final int LAST_DAY_DECEMBER = 31;
  private static final int MONTH = 1;

  /**
   * Constructor for MonthlyDonation
   * @param amount donation amount
   * @param startDate donation start date
   */
  public MonthlyDonation(double amount, LocalDate startDate) {
    super(amount, startDate);
  }

  /**
   * Constructor and initiate the donation amount
   * @param amount the donation amount
   */
  public MonthlyDonation(double amount) {
    super(amount);
  }

  /**
   * A method to set the cancel date
   * @param date cancellation date
   * @throws IllegalArgumentException
   */
  public void setCancellationDate(LocalDate date) throws IllegalArgumentException{
    if(!date.isBefore(this.getStartDate())){
      super.setEndDate(date);
    } else{
      throw new IllegalArgumentException(("The start date should be earlier than cancel! "));
    }
  }

  @Override
  public double getAmount(int year) {
    if (this.getStartDate().getYear() > year || this.getEndDate().getYear() < year) {
      return ZERO_DONATION;
    }
    LocalDate firstDate = LocalDate.of(year, (this.getStartDate().getYear() < year) ? Month.JANUARY : this.getStartDate().getMonth(), this.getStartDate().getDayOfMonth());
    LocalDate lastDate = LocalDate.of(year, (this.getEndDate().getYear() > year) ? Month.DECEMBER : this.getEndDate().getMonth(), (this.getEndDate().getYear() > year) ? LAST_DAY_DECEMBER
        : this.getEndDate().getDayOfMonth());
    return (firstDate.until(lastDate).getMonths() + MONTH) * super.getAmount();

  }
}