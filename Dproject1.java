import java.util.Scanner;

public class LoginPage {

    public static void main(String[] args) {
        // Define username and password
        String username = "user";
        String password = "password";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter username and password
        System.out.println("Please enter your username:");
        String enteredUsername = scanner.nextLine();

        System.out.println("Please enter your password:");
        String enteredPassword = scanner.nextLine();

        // Check if username and password are correct
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }
}
