import java.util.Scanner;

public class StringE {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Accepting the first string from the user
    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();
    
    // Accepting the second string from the user
    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();
    
    // Checking if both strings are equal or not
    if (str1.equals(str2)) {
      System.out.println("Both strings are equal.");
    } else {
      System.out.println("Both strings are not equal.");
    }
  }
}
