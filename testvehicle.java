import java.util.*;
class Vehicle
{
    protected int regno,speed;
    protected String color,owner_name;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter regno");
        regno=sc.nextInt();
        System.out.println("Enter Speed");
        speed=sc.nextInt();
        System.out.println("Enter color");
        color=sc.next();
        System.out.println("Enter owner");
        owner_name=sc.next();
    }
    void showdata()
    {
        System.out.println("This is Vehicle class");
    }
}
class Bus extends Vehicle
{
    private int routeno;
    void getbus()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Route no.");
       routeno=sc.nextInt(); 
    }
    void showdata()
    {
        super.showdata();
         System.out.println("Registraton number="+regno);
         System.out.println("Route number="+routeno);
         System.out.println("Enter Speed"+speed);
         System.out.println("Enter Color"+color);
         System.out.println("Enter Owner Name"+owner_name);
    }
} 
class Car extends Vehicle
{
    private String man_name;
    void getcar()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Manufacturer Name");
        man_name=sc.next(); 
    }
    void showdata()
    {
        super.showdata();
         System.out.println("Registraton number="+regno);
         System.out.println("Manufacturer Name="+man_name);
         System.out.println("Enter Speed"+speed);
         System.out.println("Enter Color"+color);
         System.out.println("Enter Owner Name"+owner_name);
    }
} 
class TestVehicle
{
    public static void main(String args[])
    {
        Bus b=new Bus();
        b.getbus();
        b.getdata();
        b.showdata();

        Car c=new Car();
        c.getcar();
        c.getdata();
        c.showdata();
    }
}
