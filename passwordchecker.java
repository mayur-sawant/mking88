import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            System.out.println("Password accepted.");

            try {
                File file = new File("passwords.txt");
                FileWriter writer = new FileWriter(file, true);
                writer.write(username + "," + password + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to file.");
            }
        } else {
            System.out.println(
                    "Invalid password. Password should have minimum 8 characters, at least 1 digit, 1 special character and 1 capital case letter.");
        }
        sc.close();
    }
}
