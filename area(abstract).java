import java.util.*;
abstract class shape
{
    final double pi = 3.14;
    void check(){}
    void volume(){}
}
class sphere extends shape
{
    int r;
    sphere(int r)
    {
        this.r=r;
    }
    public void check()
    {
        double area_sp=4*pi*r*r;
        System.out.println("Area of sphere is :"+area_sp);
    }
    public void volume()
    {
        double volume_sp=(4/3)*pi*r*r*r;
      System.out.println("Volum of sphere is :"+volume_sp);
    }
}

class cone extends shape
{
    int r,h;
    cone(int r, int h)
    {
        this.r=r;
        this.h=h;

    }
    public void check()
    {
        double d=pi*r*(r+h+r);
        System.out.println("Area of cone is :"+d);
    }
    public void volume()
    {
        double c=pi*r*r*h/3;
        System.out.println("Volume of cone is :"+c);
    }
}
public class area2
{
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter radius of sphere:");
        int r=sc.nextInt();
        sphere sp=new sphere(r);
        sp.check();
        sp.volume();
       System.out.println("enter radius of cone");
       int r2=sc.nextInt();
       System.out.println("enter height of cone");
       int h=sc.nextInt();
       cone jk=new cone(r2,h);
       jk.check();
       jk.volume();
    }
}
