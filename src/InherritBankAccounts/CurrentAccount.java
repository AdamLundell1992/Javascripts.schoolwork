package InherritBankAccounts;

/**
 * Created by u1853373 on 06/02/2019.
 */
public class CurrentAccount extends Account{
    private double balance;
//Current account is a subclass of my account Superclass as you can
// se this class take all attributes from my Superclass so thats the only i need to get this Account class work
// because i only need thoose methods that already exist in my defoult superclass called account.

    public CurrentAccount(int accountNumber, String accountHolder, double balance, String accountType) {
        super(accountNumber, accountHolder, balance, accountType);
    }





}
