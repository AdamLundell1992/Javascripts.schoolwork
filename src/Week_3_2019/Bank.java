package Week_3_2019;

import java.util.ArrayList;

/**
 * Created by u1853373 on 07/02/2019.
 */
public class Bank {
//Mainmethod

    public Bank() {
//Defult constuctor.
    }

    private ArrayList <Account> accounts = new ArrayList <>();
    //Arraylist for the accounts.

     // method for add acounts
     public void addAccount(Account newAccount) {
         this.accounts.add(newAccount);

     }

    public void printBank(){
        final String formatString = "%-18s %8s %22s %10s";
        //here i printed out the names on the board.over the numbers
        System.out.println( (String.format (formatString,

                "AccountType",
                "Name",
                "AccountNumber",
                "Balance")));

        // this printformatted method cprintBank will print a toptable in the top that is "AccountType"
        // "Name" "AccountNumber", "Balance" and this is will be separeted "%-18s %8s %22s %10s" with this
        // that is the spaces between the lines.

        for (Account a :accounts ){
            System.out.println(a);
        //this for loop loop through my arraylist accounts and it will go throgh all my accounts i added
        //So if i use bank.addAccount i add my account to bank
            // and if i use bank.printbank that will print my bank and all my accounts inside it with my formatted table in the top.
        }

    }


    public static void main(String[] args) {

        Bank bank = new Bank();
        CurrentAccount a1 = new CurrentAccount(123123,"Adam",100,"CurrentAccount");
        DepositAccount a2 = new DepositAccount(123456,"Adam",0,"DepositAccount");
        StudentAccount a3 = new StudentAccount(777777,"Adam",0,"StudentAccount");
        YoungSaverAccount a4 = new YoungSaverAccount(878787,"Adam",0,"YoungSaverAccount" );
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);

        bank.printBank();
        a1.deposit(100);
        a1.withdraw(50);

        a2.deposit(100);
        a2.withdraw(150);
        a2.addInterest(10);

        a3.withdraw(501);
        a3.withdraw(400);

        a4.deposit(110);
        a4.deposit(80);
        bank.printBank();



    }
}