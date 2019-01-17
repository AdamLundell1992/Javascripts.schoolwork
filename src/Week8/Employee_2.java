package Week8;

/**
 * Created by u1853373 on 11/12/2018.
 */
public class Employee_2 {

    public static void main (String[] args) {
        System.out.println("Creating a employee");
        Employee adam = new Employee(123, "Adam Lundell" ,"null","null",0 );
        System.out.println(adam);
        System.out.println("");
        System.out.println("Setting salary ...");
        adam.setSalary(24000);
        System.out.println(adam);
        System.out.println("");
        System.out.println("setting manager...");
        adam.setManager("Barbara Forbes");
        System.out.println(adam);
        System.out.println("");
        System.out.println("applying 5%  salary raise");
        adam.giveSalaryRaise(5);
        System.out.println(adam);
        System.out.println("");
        System.out.println(adam.getName() +"'s Salary is £" + adam.getSalary()+".");
        System.out.println("");
        System.out.println("setting job title ...");
        adam.setJobTitle("Senior");
        System.out.println(adam);
        System.out.println("");
        System.out.println("Finding Car parking status...");
        System.out.println(adam.parkingPermitStatus());
    }
}

