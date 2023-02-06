import java.util.*;
class Fibbonaci{  
    public static void main(String args[])  
    {    
    Scanner sc=new Scanner(System.in);
     int n1,n2,n3,i,count; 
    System.out.println("Enter 1st term");
    n1=sc.nextInt();
    System.out.println("Enter 2nd term");
    n2=sc.nextInt();
    System.out.println("Enter count");
    count=sc.nextInt();
     System.out.print(n1+" "+n2);    
     for(i=2;i<count;++i)    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
     }
}
