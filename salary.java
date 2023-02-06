import java.util.*;

class employee {
    private String employeid;
    private String empname;
    private double basicsalary;

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id");// taking all the inputs from the user
        employeid = scan.next();
        System.out.println("Enter the employee name");
        empname = scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary = scan.nextInt();

    }

    public void display() // displaying the calculating parameters
    {
        double HRA = 0.18 * basicsalary;
        double DA = 0.5 * basicsalary;
        double GS = basicsalary + DA + HRA;
        double incometax = 0.1 * GS;
        double netsalary = GS - incometax;

        System.out.println("Employee id:" + employeid);
        System.out.println("Employee name:" + empname);
        System.out.println("Employee basic salary:" + basicsalary);
        System.out.println("DA:" + DA);
        System.out.println("HRA:" + HRA);
        System.out.println("GS:" + GS);
        System.out.println("Income tax:" + incometax);
        System.out.println("Net salary:" + netsalary);

    }

}

class main // main function
{
    public static void main(String args[]) {
        employee employeobj = new employee();

        employeobj.read(); // calling read function

        employeobj.display(); // calling display function
    }
