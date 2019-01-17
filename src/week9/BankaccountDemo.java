package week9;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

/**
 * Created by u1853373 on 06/12/2018.
 */
public class BankaccountDemo {


    public static void main(String[] args) {

        Bankaccount2 bankInfo = new Bankaccount2(1234, "Adam", false);

        bankInfo.deposit(120);
        System.out.println("bankInfo = " + bankInfo);

        bankInfo.withdraw(20);
        System.out.println("bankInfo =" + bankInfo);

        bankInfo.addInterest(10);
        System.out.println("bankInfo = " + bankInfo );




    }
}