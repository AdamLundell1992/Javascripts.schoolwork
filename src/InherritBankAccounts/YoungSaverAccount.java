package InherritBankAccounts;

/**
 * Created by u1853373 on 07/02/2019.
 */
public class YoungSaverAccount extends DepositAccount {

    public YoungSaverAccount(int accountNumber, String accountHolder, double balance, String accountType) {
        super(accountNumber, accountHolder, balance, accountType);
    }

//This is the trickiest one if you see I use extend deposit account. Do not worry about that that is
// becouse i need to use the same Withdraw method as the deposit account and i will still be pathed to my account like this
// YoungsaverAccount-Depositaccount-Account so it will work fine. And now i got 2 Super classes Account and Depositaccount
// but that is no problem. Actually deposit is a superclass for Youngsavers account and a subclass to account class
// so it works like a connection.

    @Override
    public boolean deposit(int amount) {
        if ((getBalance() + amount) <=100){
        this.setBalance(getBalance() + amount);
        return true;
        }else {
            System.out.println("The balance can not go over £100 eccept its a overdraft");
         return false;
        }

    }


}
