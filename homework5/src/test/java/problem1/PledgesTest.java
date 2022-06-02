package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PledgesTest {
  private Pledges pledges;

  @BeforeEach
  public void setUp() {
    pledges = new Pledges(20.0, LocalDate.of(2021,10,1));
  }

  @Test
  public void getAmount() {
    assertEquals(20.0, pledges.getAmount());
  }

  @Test
  public void getStartDate() {
    assertEquals(LocalDate.of(2021,10,1), pledges.getStartDate());
    Pledges pledgesNoDate = new Pledges(20.0);
    assertEquals(LocalDate.now(), pledgesNoDate.getStartDate());
  }

  @Test
  public void getEndDate() {
    LocalDate date = LocalDate.of(2022,10,10);
    Pledges pledgesNoCreateDate = new Pledges(date, 10.0);
    assertEquals(date, pledgesNoCreateDate.getEndDate());
    Pledges pledgesWithCreateDate = new Pledges(LocalDate.now(), date, 10.0);
    assertEquals(date, pledgesWithCreateDate.getEndDate());
  }

  @Test
  public void changePledgeDate() {
    LocalDate date = LocalDate.of(2021,10,10);
    Pledges pledgesNoEndDate = new Pledges(10.0, date);
    assertEquals(LocalDate.MAX, pledgesNoEndDate.getEndDate());
    LocalDate invalidDate = LocalDate.of(2018,8,1);
    boolean error = false;
    try {
      pledgesNoEndDate.changePledgeDate(invalidDate);
    } catch (IllegalArgumentException e) {
      error = true;
    }
    assertTrue(error);
    assertEquals(LocalDate.MAX, pledgesNoEndDate.getEndDate());
    LocalDate endDate = LocalDate.of(2022,5,1);
    pledgesNoEndDate.changePledgeDate(endDate);
    assertEquals(endDate, pledgesNoEndDate.getEndDate());
  }

  @Test
  public void getYearAmount() {
    pledges.changePledgeDate(LocalDate.of(2021,10,1));
    assertEquals(20.0, pledges.getAmount(2021));
    assertEquals(0, pledges.getAmount(2019));
  }
}

