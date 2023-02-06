import java.util.Scanner;

class AgeElectionException extends Exception{
    AgeElectionException(String s){
        super(s);
    }
}
public class Q13 {
    static int age;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        try {
            if(age < 18) {
                throw new AgeElectionException("You are not eligible to vote! Your age is less than 18 years.");
            } else {
                System.out.println("You are eligible to vote!");
            }
        } catch(AgeElectionException e) {
            System.out.println(e);
        }
    }
}
