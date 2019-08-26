package Accounts;

public class CardAccount extends CurrentAccount {

  private final static double PERCENT = 0.01;

  public CardAccount(double balance) {
    super(balance);
  }

  @Override
  public void withdraw(double amount) {
    amount += amount * PERCENT;
    super.withdraw(amount);
  }
}