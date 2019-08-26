package Accounts;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends CurrentAccount {

  private Calendar lastPutTimestamp;

  public DepositAccount(double balance) {
    super(balance);
  }

  @Override
  public void put(double amount) {
    lastPutTimestamp = new GregorianCalendar();
    lastPutTimestamp.add(Calendar.MONTH, 1);
    super.put(amount);
  }

  @Override
  public void withdraw(double amount) {
    Calendar withdrawDay = new GregorianCalendar();
    if (withdrawDay.after(lastPutTimestamp)) {
      super.withdraw(amount);
    } else {
      System.out.println(
          "Снятие невозможно, так как с момента пополнения вклада прошло менее 30 дней.");
    }


  }
}