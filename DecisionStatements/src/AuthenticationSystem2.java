import java.util.Scanner;

public class AuthenticationSystem2 {
    public static void main(String[] args) {
        System.out.println("*** Authentication System - switch case ***");

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

        // Determine the authentication message based on the provided username
        var authenticationMessage = switch (providedUsername) {
            // If the provided username matches the predefined USERNAME
            case USERNAME -> {
                // Check if the provided password matches the predefined PASSWORD
                if (PASSWORD.equals(providedPassword))
                    yield "Welcome to the System!"; // If it matches, yield a welcome message
                else
                    yield "Invalid Password!"; // If not, yield an invalid password message
            }
            // If the provided username does not match the predefined USERNAME
            default -> {
                // Check if the provided password matches the predefined PASSWORD
                if (PASSWORD.equals(providedPassword))
                    yield "Invalid Username!"; // If it matches, yield an invalid username message
                else
                    yield "Invalid Username and Password!"; // If not, yield an invalid username and password message
            }
        };

        // Print Authentication message
        System.out.println(authenticationMessage);

    }
}
