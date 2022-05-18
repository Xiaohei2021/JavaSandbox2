import accounts.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100, 0.025);
        account.status();
        account.withdraw(5);
        account.withdraw(60);
        account.deposit(500);
        account.status();

        System.out.println("Hello world!");
    }
}