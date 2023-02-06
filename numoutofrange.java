import java.util.*;

class NumOutRang extends Exception {}

class NumOutRangex{
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter number");
            n=sc.nextInt();
            if(n>1000)
            {
                throw new NumOutRang();
            }
            else
            {
                for(int i =1; i<n; i++)
                {
                    if(n%i<=0)
                    {
                        System.out.println(i+"");
                    }
                }
            }
        } catch (NumOutRang e) {
            System.out.println("num is out of range");
        }
        catch(Exception b)
        {
            System.out.println(""+b.getMessage());
        }
    }
}
