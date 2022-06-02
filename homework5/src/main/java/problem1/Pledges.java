package problem1;

import java.time.LocalDate;

public class Pledges extends Donation {
  private static final double ZERO_DONATION = 0;

  /**
   * Constructor start date and amount
   * @param amount the donation amount
   * @param startDate the start date
   */
  public Pledges(double amount, LocalDate startDate) {
    super(amount, startDate);
  }

  /**
   * Constructor
   * @param amount the donation amount
   */
  public Pledges(double amount) {
    super(amount);
  }

  /**
   * Constructor
   * @param startDate the donation start date
   * @param pledgeDate the pledge date
   * @param amount the amount of donation
   * @throws IllegalArgumentException
   */
  public Pledges(LocalDate startDate, LocalDate pledgeDate, double amount) throws IllegalArgumentException{
    super(amount, startDate);
    this.setEndDate(pledgeDate);
  }

  /**
   * Constructor
   * @param amount donation amount
   * @param pledgeDate the pledge date
   */
  public Pledges(LocalDate pledgeDate,double amount) throws IllegalArgumentException{
    super(amount);
    this.setEndDate(pledgeDate);
  }

  /**
   * A method to change the pledge date
   * @param newDate the new pledge date
   * @throws IllegalArgumentException
   */
  public void changePledgeDate(LocalDate newDate) throws IllegalArgumentException {
    setEndDate(newDate);
  }

  @Override
  public double getAmount(int year) {
    if (this.getEndDate().getYear() == year){
      return getAmount();
    }else{
      return ZERO_DONATION;
    }
  }
}