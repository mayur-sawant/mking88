import java.util.*;
class invalid extends Exception{}
public class pancard
{static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("1.mobileno./n 2.pan card /nchoose one");
            n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("enter your mobile no.");
                    Long num=sc.nextLong();
                    if(num.toString().macthes("(0/91)?[7-9][0-9]{9}"))
                    {
                        System.out.println("your entered no.is"+num);
                    }
                    else
                    {
                        throw new invalid();
                    }
                    break;

                    case 2:
                    System.out.println("enter pan no.");
                    String str=sc.next();
                    if(str.macthes([A-Z]{5}[0-9]{4}[A-Z]{1}))
                    {
                        System.out.println("your pan no. is "+str);
                    }
                    else{
                        throw new invalid();
                    }
                    break;

            
                default:
                throw new invalid();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
