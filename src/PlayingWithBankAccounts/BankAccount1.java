package PlayingWithBankAccounts;

/**
 * Created by u1853373 on 04/12/2018.
 */

public class BankAccount1

{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount1(int accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount1(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("you cant deposit 0 or less");
            return false;
        }
    }

    public boolean withdraw(int amount) {
        if (amount >= 0 && balance > amount ) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("the amount cant be less than 0 or more than balance");
            return false;
        }
    }






    public boolean addInterest(int interestRate) {
        if (interestRate > 0.0){
            this.balance += this.balance * (interestRate / 100.0);
            return true;
    }       else {

            System.out.println("you need a interest rate greater than 0");
            return false;


    }



    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("accountNumber='").append(accountNumber).append('\'');
        sb.append(", accountHolder='").append(accountHolder).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", hasOverdraft=").append(hasOverdraft);
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Creating a bankacount");
        BankAccount1 b = new BankAccount1(12313, "adam" );
        System.out.println(b);
        b.deposit(150);
        System.out.println(b);
        b.withdraw(200);
        System.out.println(b);
        b.withdraw(50);
        System.out.println(b);
        b.addInterest(10);
        System.out.println(b);
        b.addInterest(-1);
        System.out.println(b);





    }
}












