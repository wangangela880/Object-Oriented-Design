package problem1;

import java.time.LocalDate;
public abstract class Donation {

  protected double amount;
  protected LocalDate startDate;
  protected LocalDate endDate;

  /**
   * Constructor for Donation
   * @param amount the amount to be donated
   * @param startDate the date when create the donation
   */
  public Donation(double amount, LocalDate startDate) {
    this.amount = amount;
    this.startDate = startDate;
    if (this.startDate == null) {
      this.startDate = LocalDate.now();
    }
    this.endDate = LocalDate.MAX;
  }

  /**
   * Constructor for Donation to initiate an amount, set current date
   * @param amount the amount.
   */
  public Donation(double amount){
    this.amount = amount;
    this.startDate = LocalDate.now();
    this.endDate = LocalDate.MAX;
  }

  /**
   * A method to get the donation amount.
   * @return donation amount
   */
  public double getAmount() {
    return this.amount;
  }

  /**
   * A method to get start date
   * @return the start date
   */
  public LocalDate getStartDate() {
    return this.startDate;
  }

  /**
   * A method to get end date
   * @return the end date.
   */
  public LocalDate getEndDate() {
    return this.endDate;
  }

  /**
   * A method to set end date
   * @param endDate
   * @throws IllegalArgumentException
   */
  public void setEndDate(LocalDate endDate) throws IllegalArgumentException {
    if (!startDate.isAfter(endDate)) {
      this.endDate = endDate;
      if (this.endDate == null) {
        this.endDate = LocalDate.now();
      }
    } else {
      throw new IllegalArgumentException("The start date should be earlier than end date");
    }
  }

  /**
   * An abstract method to get the total amount
   * @param year
   * @return donation amount total in a year
   */
  abstract public double getAmount(int year);
}

