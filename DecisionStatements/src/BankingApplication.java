import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        System.out.println("*** Welcome to the Banking Application ***");

        // A Scanner object is created to read input from the console.
        var console = new Scanner(System.in);

        // The user is prompted with the question
        // "Do you want to log out (true/false)?",
        // and their response is captured as a Boolean value,
        // stored in the variable isLoggingOut.
        System.out.print("Do you want to log out (true/false)? ");
        var isLoggingOut = Boolean.parseBoolean(console.nextLine());

        // "Verifying (using inverse logic)."
        // If the original value is true, using the negation
        // operator makes it false.
        // If the original value is false, using
        // the negation operator makes it true.
        if(!isLoggingOut){

            System.out.println("We continue operating in the system...");
        }
        else{
            System.out.println("Ending session...");
        }
    }
}
