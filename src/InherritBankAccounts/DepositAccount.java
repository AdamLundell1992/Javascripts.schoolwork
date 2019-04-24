package InherritBankAccounts;

/**
 * Created by u1853373 on 06/02/2019.
 */
public class DepositAccount extends Account {


    public DepositAccount(int accountNumber, String accountHolder, double balance, String accountType) {
        super(accountNumber, accountHolder, balance, accountType);
    }

// Here is something different why? Because i need to use another withdraw method to
// so the balance cant overdraft £0.The ovveride means that this method will go before the
// other withdraw method inside my Defultclass account.
// and notice that i need to use getBalance and Setbalance inside my method it becouse this sublass work like that
// must do it that way when we use innhertitance.




    public boolean addInterest(double interestRate) {
        if (interestRate > 0.0) {
            double balance = getBalance();
            double newBalance = balance +  (balance / 100.0 * interestRate);

            if (balance > 0) {

                this.setBalance(newBalance);
                System.out.println("interest addede");
                return true;
            } else {
                System.out.println("you need s balance greater than zero");
                return false;
            }

        }else{
            System.out.println("negative interdst rate");
            return true;
        }

    }

    @Override

    public boolean withdraw(double amount) {
        if (amount < getBalance()) {
            this.setBalance(getBalance() - amount);
            return true;
        } else {
            System.out.println("the amount cant be less than 0 or more than balance");
            return false;
        }
    }


}