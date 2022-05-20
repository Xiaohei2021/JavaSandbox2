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
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int calculateRewardPoints(double cost){
        return(int)(cost*10);
    }
    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void status() {
        System.out.println(this.getClass().getSimpleName());
        System.out.printf("\tAccount Balance: %.3f", balance);
        System.out.printf("\n\tInterest Rate: %.3f",interestRate);
        System.out.printf("\n\tAccumulated Award Points: %d", rewardPoints);
    }
}
