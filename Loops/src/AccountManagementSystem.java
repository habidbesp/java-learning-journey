import java.util.Scanner;

public class AccountManagementSystem {
    public static void main(String[] args) {

        var console = new Scanner(System.in);
        var logOut = false;

        while (!logOut){
            System.out.print("""
                    *** Account Management System ***
                    Menu:
                    1. Create an account
                    2. Delete account
                    3. Log out
                    Choose an option:\s""");

            var option = console.nextInt();
            switch (option){
                case 1 -> System.out.println("Creating account...\n");
                case 2 -> System.out.println("Deleting account...\n");
                case 3 -> {
                    System.out.println("Logging out, see you next time!");
                    logOut = true;
                }
                default -> System.out.println("Invalid option...\n");
            }
            System.out.println("Account Management System shutting down");
        }
    }
}
