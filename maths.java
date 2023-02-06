package mathematics;
import java.util.*;
class maximum
{
    public void displaymax()
    {
        int n1,n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of first number ");
        n1=sc.nextInt();
        System.out.println("value of first number is : " +n1);
        System.out.println("enter the value of second number ");
        n2=sc.nextInt();
        System.out.println("value of second number is : " +n2);
        if(n1>n2)
        {
            System.out.println(n1 + " is greater than " + n2);
        }
        else
         {
            System.out.println(n2 +" is greater than" + n1);
         }
    }
}
class power
{
    public void displaypow()
    {
        int base,power,ans=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of base ");
        base=sc.nextInt();
        System.out.println("value of base is : " +base);
        System.out.println("enter the value of power ");
        power=sc.nextInt();
        System.out.println("value of power is : " +power);
        while(power>0)
        {
            if((power&1)==1)
            {
                ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
   System.out.println("power of given number to the base is : " + ans);
    }
}
class maxpow{
    public static void main(String args[])
    {
        maximum mm=new maximum();
        mm.displaymax();
        power pw=new power();
        pw.displaypow();
    }
}
