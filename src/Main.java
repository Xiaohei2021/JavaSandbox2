import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

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
//        CheckingAccount account = new CheckingAccount(100, 0.023, 700);
//        if (account.purchase(500)){
//            System.out.println("Purchase succeeded");
//        }else{
//            System.out.println(account.getBalance());
//            System.out.println("Insufficient fund, transaction failed");
//        }
//        System.out.println(account.getRewardPoints());

        CheckingAccount ca = new CheckingAccount(1000, 0.0123, 500);
        SavingsAccount sa = new SavingsAccount(1000, 0.0123);

        ca.withdraw(500);
        sa.withdraw(500);

        ca.status();
        sa.status();
    }
}