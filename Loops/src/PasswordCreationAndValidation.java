import java.util.Scanner;

public class PasswordCreationAndValidation {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.println("*** Password Validation ***");

        System.out.print("Enter a password (at least 6 characters): ");
        var password = console.nextLine();

        while (password.length() < 6){
            System.out.println("Error: Provide a valid password of at least 6 characters!\n");

            System.out.print("Enter a new password: ");
            password = console.next();
        }

        System.out.println("""
                Valid Password,
                Logging in...
                """);

    }
}
