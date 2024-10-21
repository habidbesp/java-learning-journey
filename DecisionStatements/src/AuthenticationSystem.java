import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        System.out.println("*** Authentication System ***");

        // Define constants for the correct username and password
        final var USERNAME = "habid_esp";
        final var PASSWORD = "123";

        // Create a Scanner object to read user input from the console
        var console = new Scanner(System.in);

        // Prompt the user to enter their username
        System.out.print("Provide your username: ");
        var providedUsername = console.nextLine().strip(); // Read and strip whitespace from the provided username

        // Prompt the user to enter their password
        System.out.print("Provide your password: ");
        var providedPassword = console.nextLine().strip(); // Read and strip whitespace from the provided password

        // Check if the provided username and password match the stored values
        if(USERNAME.equals(providedUsername) && PASSWORD.equals(providedPassword)) {
            // If both match, welcome the user
            System.out.printf("Welcome %s, you enter the system.", providedUsername);
        } else if (!USERNAME.equals(providedUsername) && !PASSWORD.equals(providedPassword)) {
            // If both username and password are incorrect
            System.out.println("Invalid username and password");
        } else if (!USERNAME.equals(providedUsername)) {
            // If only the username is incorrect
            System.out.println("Invalid username");
        } else if (!PASSWORD.equals(providedPassword)) {
            // If only the password is incorrect
            System.out.println("Invalid Password");
        }
    }
}
