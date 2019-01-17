package week9;

/**
 * Created by u1853373 on 05/12/2018.
 */
public class Bankaccount2 {


private int accountNumber;
private String accountHolder;
private double balance;
private boolean hasOverdraft;

public Bankaccount2(int accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
        }
public Bankaccount2(int accountNumber, String accountHolder,int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance= balance;
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
public void setBalance(double balance) {this.balance = balance;}
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
public boolean withdraw(double amount) {
        if (balance <0.0  || amount <=balance ) {
        this.balance -= amount;
        return true;

        }   else {
        System.out.println("you can't withdraw that amount when the balance is lower");
        return false;
        }
        }
public boolean addInterest(int interestRate) {
        if (interestRate > 0.0) {
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }   else {
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
        Bankaccount2 b = new Bankaccount2(12313, "adam",-100);
        System.out.println(b);
        b.withdraw(100);
        System.out.println(b);
        b.deposit(210);
        System.out.println(b);
        b.withdraw(50);
        System.out.println(b);
        b.deposit(0);


        }
        }