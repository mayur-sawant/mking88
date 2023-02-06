public class StudentClone implements Cloneable
 {
    int rollno;
    String name;
    StudentClone(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            StudentClone s1 = new StudentClone(100,"Omkar");
            StudentClone s2 = (StudentClone) s1.Clone();
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
            s1.name = "Rohit";
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
        }
        catch (CloneNotSupportedException c){
            System.out.println("Error");
        }
    }

}
