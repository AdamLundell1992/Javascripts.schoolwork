package Week_3_2019;
import java.util.ArrayList;
/**
 * Created by u1853373 on 07/02/2019.
 */
public class StudentAccount extends DepositAccount {

    private boolean overDraftLimit;

    public StudentAccount(int accountNumber, String accountHolder, double balance, String accountType) {
        super(accountNumber, accountHolder, balance, accountType);
    }


    //Use new withdraw method so i overide this one.
    @Override
    public boolean withdraw(double amount) {

        if ((getBalance()- amount) >= -500 ) {
            setBalance(getBalance()-amount);
            return true;
        } else {
            System.out.println("The Overdraft can only go under - £500 so you cant withdraw more");
            return false;
        }
    }


}

