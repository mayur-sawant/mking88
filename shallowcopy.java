import java.io.*;
import java.util.*;
import java.lang.*;
class Course
{
String subject1;
String subject2;
String subject3;

public Course (String sub1, String sub2, String sub3)
{
    this.subject1=sub1;
    this.subject2=sub2;
    this.subject3=sub3;
}
}

class student implements Cloneable
{
    int id;
    String name;
    Course course;
    public student(int id, String name, Course course)
    {
        this.id=id;
        this.name=name;
        this.course=course;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        
    }
}

public class shallowcopyinjava
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Course science = new Course("physics","chemistry","Biology");
        student student1=new student(11,"john",science);
        student student2=null;
        try {
            
                student2=(student)student1.clone();
            }
            
            catch(CloneNotSupportedException e)
            {
             e.printStackTrace();
            }
            System.out.println(student1.course.subject3);
            student2.course.subject3="maths";
            System.out.println(student1.course.subject3);
        
    }
}
