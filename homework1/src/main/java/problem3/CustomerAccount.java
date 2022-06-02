/**class CustomerAccount
 * The account holder’s name. An account holder is an individual with a first and last name.
 * The current account balance as an amount.
 */
package problem3;

public class CustomerAccount {

  private String firstName;
  private String lastName;
  private Amount amounts;
  /**
   * Constructor that creates a new vehicle object with the specified VIN
   and
   * license plate.
   * @param first - VIN of the new Vehicle object.
   * @param last - license plate of the new Vehicle.
   * @param  amount - the Owner of the vehicle
   */
  public CustomerAccount(String first, String last, Amount amount) {
    this.firstName = first;
    this.lastName = last;
    this.amounts = amount;
  }
  /**
   * Returns the lastname of the CurrentAccount.
   * @return the lastname of the CurrentAccount.
   */
  public String getLName() {
    return lastName;
  }
  /**
   * Returns the firstname of the CurrentAccount.
   * @return the firstname of the CurrentAccount.
   */
  public String getFName() {
    return firstName;
  }
  /**
   * Returns the amount of the CurrentAccount.
   * @return the amount of the CurrentAccount.
   */
  public Amount getAmounts() {
    return amounts;
  }


  public CustomerAccount deposit(int Amount[])
  {
    String firstN = this.getFName();
    String lastN = this.getLName();
    Amount amount = this.getAmounts();
    int cent = amount.getCents();
    int dollar = amount.getDollars();
    CustomerAccount customer = new CustomerAccount(firstN,lastN,amount);
    customer.amounts = new Amount(Amount[0] + dollar,Amount[1] + cent);
    if(customer.amounts.getCents() > 99)
    {
      customer.amounts = new Amount(customer.amounts.getDollars() + 1,customer.amounts.getCents() - 100);
    }
    return customer;
  }

  public CustomerAccount withdrawal(int Amount[])
  {
    Amount amount = this.getAmounts();
    String firstN = this.getFName();
    String lastN = this.getLName();
    int cent = amount.getCents();
    int dollar = amount.getDollars();
    CustomerAccount customer = new CustomerAccount(firstN,lastN,amount);
    if(Amount[1] > cent)
    {
      int curCent = cent + 100;
      int curDollar = dollar - 1;
      int newDollar = curDollar - Amount[0];
      int newCent = curCent - Amount[1];
      customer.amounts = new Amount(newDollar,newCent);

    }
    else
    {
      int newDollar = dollar - Amount[0];
      int newCent = cent - Amount[1];
      customer.amounts = new Amount(newDollar,newCent);
    }
    return customer;
  }
}


