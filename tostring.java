class student 
{
    int rollno;
    String name;
    static int cnt;
    student()
    {
        cnt=0;
    }
    student(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
        cnt++;
        System.out.println("no. of objects created"+cnt);
    }

    public String toString()
    {
        return rollno+" "+ name;
    }
}

class studentex
{
    public static void main(String[] args) {
        student s1 = new student(1,"gunaji");
        student s2 = new student(2,"rohit");
        System.out.println(s1);
        System.out.println(s2);

    }
}
