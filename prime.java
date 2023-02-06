import java.util.*;
public class Primerange
 {
   public static void main (String[]args)
   {
     int lower,upper;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter lower limit");
    lower=sc.nextInt();
    System.out.println("Enter upper limit");
    upper=sc.nextInt();
     for (int i = lower; i <= upper; i++)
       if (isPrime (i))
        System.out.println (i);
   }

   static boolean isPrime (int n)
   {
     int count = 0;
     if (n < 2)
       return false;

     for (int i = 2; i < n; i++)
       {
       if (n % i == 0)
        return false;
       }
  return true;
   }
 }
