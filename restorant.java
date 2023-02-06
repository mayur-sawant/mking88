import java.util.*;
class restaurant
{
     public static void main(String[] args) {
        int a,q1=0,q2=0,q3=0,q4=0,Total=0;
        int ptot=0,stot=0,ctot=0,btot=0;
        char ch='j';

        Scanner sc=new Scanner(System.in);

        do
        {
                System.out.println("1=pizza");
                System.out.println("2=sandwich");
                System.out.println("3=coffe");
                System.out.println("4=burger");
                System.out.println("Enter the choice");
                a=sc.nextInt();

                switch (a) {
                        case 1:
                                System.out.println("how many pizza you want to order");
                                q1=sc.nextInt();
                                ptot=q1*400;
                                Total=Total+ptot;
                                break;
                        case 2: 
                                System.out.println("how many sandwitch you want to order");
                                q2=sc.nextInt();
                                stot=q2*200;
                                Total=Total+stot;
                                 break;

                        case 3:
                                 System.out.println("how many coffee you want to order");
                                q3=sc.nextInt();
                                ctot=q3*50;
                                Total=Total+ctot;
                                  break;
                         case 4:
                                System.out.println("how many burger you want to order");
                                q4=sc.nextInt();
                                btot=q4*100;
                                Total=Total+btot;
                        
                                break;
                }
                System.out.println("want anything else('y or n')");
                ch=sc.next().charAt(0);
            }
            while(ch=='y');

                 System.out.println("bill");
                 System.out.println("ITEM\t\tQty\tPRICE\tAMOUNT");
                 if(q1>0){
                 System.out.println("PIZZA\t\t"+q1+"\t400\t"+ptot);}
                 if(q2>0){
                 System.out.println("SANDWITCH\t"+q2+"\t200\t"+stot);}
                 if(q3>0){
                 System.out.println("COFFEE\t\t"+q3+"\t50\t"+ctot);}
                 if(q4>0){
                 System.out.println("BURGER\t\t"+q4+"\t100\t"+btot);}
                 System.out.println("\t\tTOTAL Price:RS"+Total);
        }
    
}
