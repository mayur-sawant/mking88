import java.util.*;
class Shape
{
    Shape(double radius)
    {
        System.out.println("Area of a  circle:\n"+(3.14*radius*radius));
        System.out.println("\n");
    }

    Shape(int side)
    {
        int area = side*side;
        System.out.println("Area of square:\n"+area);
       

    }

    Shape(int length, int breadth)
    {
        int area = length*breadth;
        System.out.println("Area of Rectangle:\n"+area);
       
    }

    Shape(float base, float height) 
    {
        float area = (base*height)/2;
        System.out.println("Area of Triangle:\n"+area);
        
    }
    Shape(double radius, double height)
    {
        double area = 3.14*radius*radius*height;
        System.out.println("Area of cylinder:\n"+area);
       
    }
}

class Shape_main
{
    public static void main(String a[])
    {
        int choice;
        System.out.println("*********Menu***********");
        System.out.println("1: Area of circle:");
        System.out.println("2: Area of Square:");
        System.out.println("3: Area of Rectangle:");
        System.out.println("4: Area of Triangle:"); 
        System.out.println("5: Area of cylinder:");

          System.out.println("Enter you choice:");
          Scanner sc = new Scanner(System.in);
         
        do
       {
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: System.out.println("Enter radius of circle:");
                    double radius = sc.nextDouble();
                    Shape s1 = new Shape(radius);
                    break;

                case 2: System.out.println("enter side of square:");
                    int side = sc.nextInt();
                    Shape s2 = new Shape(side);
                    break;

                case 3: System.out.println("entre length of rectangle:");
                    int length = sc.nextInt();
                    System.out.println ("enter breadth of rectangle:");
                    int breadth = sc.nextInt();
                    Shape s3 = new Shape(length,breadth);
                    break;

                case 4: System.out.println("enter the value of base:");
                    float base = sc.nextFloat();
                    System.out.println("enter the value of height:");
                    float height = sc.nextFloat();  
                    Shape s4 = new Shape(base,height);
                    
                case 5: System.out.println("entre the value of radius:");
                    double rad = sc.nextDouble();
                    System.out.println("enter the value of breadth:");
                    double bre = sc.nextDouble();
                    Shape s5 = new Shape(rad,bre);

                case 6: System.exit(0);
                    break;        

                default: System.out.println("Invalid Input");        
            }
        }while(choice!=6);
    }
}
