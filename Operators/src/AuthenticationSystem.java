import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        System.out.println("*** Authentication System ***");

        // This code implements a simple authentication system
        // that verifies user credentials. It defines valid
        // username and password constants for authentication.
        // The program prompts the user to enter their username
        // and password through the console.

        final var VALID_USERNAME = "admin";
        final var VALID_PASSWORD = "admin_1789";

        var console = new Scanner(System.in);

        System.out.print("What is your username? ");
        var enteredUsername = console.nextLine();

        System.out.print("What is your password? ");
        var enteredPassword = console.nextLine();

        // After the user inputs their credentials, the system
        // checks if the entered username matches the predefined
        // valid username and if the entered password matches
        // the predefined valid password. The result of this
        // authentication check is stored in the boolean variable
        // 'isAuthenticated'.

        var isAuthenticated =
                VALID_USERNAME.equals(enteredUsername)
                        && VALID_PASSWORD.equals(enteredPassword);

        // Finally, the program outputs whether the provided
        // details are correct, displaying true if the credentials
        // are valid and false otherwise. This code demonstrates
        // basic input handling, string comparison, and logical
        // operations in Java.

        System.out.println("Are the details correct? " + isAuthenticated);
    }
}
