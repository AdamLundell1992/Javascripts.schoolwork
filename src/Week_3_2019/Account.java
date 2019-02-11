package Week_3_2019;



/**
 * Created by u1853373 on 07/02/2019.
 */
public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;
// This is my mainSuperclass u use as a defult class in this program. All my main attributes that i will use
// inside my main class-Bank

    public Account(int accountNumber, String accountHolder, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    //Defult constructor not needed really i think.
    public Account() {

    }
    // Getters and Setters
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    //Thoose methods will be used in all classes i extends for this class except i overide a method , then the program going to
    // priority the method that is Ovveride
    public boolean withdraw(double amount) {

        this.balance -= amount;
        return true;
    }

    public boolean deposit(int amount) {
        this.balance += amount;
        return true;

    }

    public boolean addInterest(int interestRate) {
        if (interestRate > 0.0) {
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        } else {

            System.out.println("you need a interest rate greater than 0");
            return false;
        }
    }
    //This ToString are going to get all my attribute values from each class becouse i extended them.
    //Also made a formatstring to make it look better in the output.
        @Override
        public String toString (){
    final String formatString = "%-18s %8s %15s %15s";
        return (String.format (formatString,
                     getAccountType(),
                    getAccountHolder(),
                             getAccountNumber(),
                             getBalance()));

    }

    }


