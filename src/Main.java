import accounts.Account;
import accounts.CheckingAccount;

public class Main {
    public static void main(String[] args) {
//        Account account = new Account(100, 0.025);
//        account.status();
//        account.withdraw(5);
//        account.withdraw(60);
//        account.deposit(500);
//        account.status();
//        account.deposit(3);
//        account.withdraw(136);
//        account.status();
        CheckingAccount account = new CheckingAccount(100, 0.023);
        account.status();
        account.withdraw(5);
        account.withdraw(60);
        account.deposit(500);
        account.status();
        account.deposit(3);
        account.withdraw(136);
        account.status();
    }
}