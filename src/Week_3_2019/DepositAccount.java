package Week_3_2019;

import java.util.ArrayList;

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
