package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerAccountTest {
  private CustomerAccount testCount;
  private Amount testAmount;

  @BeforeEach
  void setUp() {
    this.testAmount = new Amount(5,50);
    this.testCount = new CustomerAccount("Zoey","Wang",testAmount);
  }

  @Test
  void getLName() {
    Assertions.assertEquals("Wang",this.testCount.getLName());
  }

  @Test
  void getFName() {
    Assertions.assertEquals("Zoey",this.testCount.getFName());
  }

  @Test
  void getAmounts() {
    Amount newAmount = new Amount(5,50);
    Assertions.assertEquals(newAmount.getDollars(),this.testCount.getAmounts().getDollars());
    Assertions.assertEquals(newAmount.getCents(),this.testCount.getAmounts().getCents());
  }

  @Test
  void deposit() {
    int amount[] = new int[2];
    amount[0] = 10;
    amount[1] = 5;
    Amount newAmount = new Amount(15,55);
    CustomerAccount newCount = new CustomerAccount("Zoey","Wang",newAmount);
    assertEquals(newCount.getFName(),testCount.deposit(amount).getFName());
    assertEquals(newCount.getLName(),testCount.deposit(amount).getLName());
    assertEquals(newCount.getAmounts().getDollars(),testCount.deposit(amount).getAmounts().getDollars());
    assertEquals(newCount.getAmounts().getCents(),testCount.deposit(amount).getAmounts().getCents());
  }

  @Test
  void withdrawal() {
    int amount[] = new int[2];
    amount[0] = 1;
    amount[1] = 10;
    Amount newAmount = new Amount(4,40);
    CustomerAccount newCount = new CustomerAccount("Zoey","Wang",newAmount);
    assertEquals(newCount.getFName(),testCount.withdrawal(amount).getFName());
    assertEquals(newCount.getLName(),testCount.withdrawal(amount).getLName());
    assertEquals(newCount.getAmounts().getDollars(),testCount.withdrawal(amount).getAmounts().getDollars());
    assertEquals(newCount.getAmounts().getCents(),testCount.withdrawal(amount).getAmounts().getCents());
  }
}