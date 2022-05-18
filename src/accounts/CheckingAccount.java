package accounts;

public class CheckingAccount extends Account {
    public int rewardPoints;
    public CheckingAccount(double balance, double interestRate, int rewardPoints){
//        super(50,0.0125);
//        System.out.println("CheckingAccount constructor");
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost){
        if(cost > balance){
            return false;
        }

        balance -= cost;
        rewardPoints += cost*10;
        return true;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
