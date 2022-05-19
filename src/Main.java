import accounts.*;

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

//        CheckingAccount ca = new CheckingAccount(1000, 0.0123, 500);
//        SavingsAccount sa = new SavingsAccount(1000, 0.0123);
//
//        ca.withdraw(500);
//        sa.withdraw(500);
//
//        ca.status();
//        sa.status();

//        SilverCheckingAccount silver = new SilverCheckingAccount(600, 0.236, 900);
//        GoldCheckingAccount gold = new GoldCheckingAccount(600, 0.236, 900);
//        DiamondCheckingAccount rock = new DiamondCheckingAccount(600, 0.236, 900);
//
//        silver.purchase(500);
//        gold.purchase(500);
//        rock.purchase(500);
//
//        System.out.println(silver.getRewardPoints());
//        System.out.println(gold.getRewardPoints());
//        System.out.println(rock.getRewardPoints());

        Account acc1 = new Account(600, 0.025);
        // acc1 = variable, it is an Account type, and it is a new Account object. But it can hold object of any subtype.
        CheckingAccount acc2 = new GoldCheckingAccount(500,0.168,3500);
        // acc2 is a variable, its type is CheckingAccount, and it is a new GoldCheckingAccount object
        Account acc3 = new SilverCheckingAccount(900, 0.123, 200);
        // acc3 is variable, its type is Account, and it is a new GoldCheckingAccount object
        Account acc4 = new DiamondCheckingAccount(6000,0.236, 9000);
        Account acc5 = new SavingsAccount(500,0.123);


//        account1.purchase(50);
        // error here because java only looks at variable type to determine the available method for the variable.
        acc5.withdraw(90);
        //polymorphism-dynamic dispatch: a call to a method will be directed to underlying object's method.Java calls on object type, instead of variable type.


    }
}