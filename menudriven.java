import java.util.Scanner;
          public class Menu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String str1, str2;
    
    while (true) {
      System.out.println("\nMenu:\n1. Reverse String 
\n2. Concatenate Two Strings\n3. Find Length of the String\n4. Use Equals Method in a String Class\n5. Convert String to Uppercase\n6. Convert String to Lowercase\n7. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter a string: ");
          str1 = scanner.next();
          StringBuilder sb = new StringBuilder(str1);
          System.out.println("The reverse of the string is: " + sb.reverse().toString());
          break;
        case 2:
          System.out.print("Enter the first string: ");
          str1 = scanner.next();
          System.out.print("Enter the second string: ");
          str2 = scanner.next();
          System.out.println("The concatenated string is: " + str1 + str2);
          break;
        case 3:
          System.out.print("Enter a string: ");
          str1 = scanner.next();
          System.out.println("The length of the string is: " + str1.length());
          break;
        case 4:
          System.out.print("Enter the first string: ");
          str1 = scanner.next();
          System.out.print("Enter the second string: ");
          str2 = scanner.next();
          if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
          } else {
            System.out.println("Both strings are not equal.");
          }
          break;
        case 5:
          System.out.print("Enter a string: ");
          str1 = scanner.next();
          System.out.println("The uppercase string is: " + str1.toUpperCase());
          break;
        case 6:
          System.out.print("Enter a string: ");
          str1 = scanner.next();
          System.out.println("The lowercase string is: " + str1.toLowerCase());
          break;
        case 7:
          System.out.println("Exiting...");
          System.exit(0);
              default:
          System.out.println("Invalid choice. Try again.");
      }
    }
}
}
