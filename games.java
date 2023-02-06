package games;
public class indoor
{
        protected String player;
        public indoor()
        {
        }
        public indoor(String p)
        {
                player = p;
        }
        public void display()
        {
                System.out.println(player);
        }                
        protected void finalize()
        {
                System.out.println("Terminating Indoor...");
        }
}

Code class outdoor:
package games;
public class outdoor
{
 String player;
 public outdoor(String p)
 {
 player = p;
 }
 public void display()
 {
 System.out.println(player);
 }
 protected void finalize()
 {
 System.out.println("Terminating Outdoor...");
 }
}
Code main file:
import games.*;
import java.util.*;
class Q9
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter how many player :");
    n=sc.nextInt();
 indoor In[] = new indoor[n];
 In[0] = new indoor("pavan");
 In[1] = new indoor("varad");
 In[2] = new indoor("omkar");
 System.out.println("Indoor Players:");
 for(int i=0;i<In.length;i++)
 In[i].display();
 System.out.println("Indoor Players:");
 outdoor Out[] = new outdoor[n];
 Out[0] = new outdoor("rahul");
 Out[1] = new outdoor("vivek");
 Out[2] = new outdoor("raj");
 for(int i=0;i<Out.length;i++)
 Out[i].display();
 }
}
