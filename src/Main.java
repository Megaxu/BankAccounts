import Accounts.CardAccount;
import Accounts.CurrentAccount;
import Accounts.DepositAccount;

public class Main {

  public static void main(String[] args) {

    CurrentAccount card = new CardAccount(0.0);
    CurrentAccount deposit = new DepositAccount(300.0);
    CurrentAccount account = new CurrentAccount(0.0);

    card.put(1000.0);
    card.withdraw(200.0);
    card.withdraw(100.0);
    card.printBalance();

    deposit.put(1000.0);
    deposit.withdraw(200.0);
    deposit.put(150.0);
    deposit.withdraw(100.0);
    deposit.printBalance();

    account.put(1000.0);
    account.withdraw(-200.0);
    account.withdraw(100.0);
    account.printBalance();
  }
}