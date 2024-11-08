package presentation;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        library();
    }

    public static void library(){
        var exit = false;
        var console = new Scanner(System.in);

        while (!exit){
            try{
                var option = showMenu(console);
                exit = executeOptions(option);
            } catch (Exception e) {
                System.out.println("An error has occurred: " + e.getMessage());
            }
            finally {
                System.out.println(); // Print a new line after each operation
            }
        }
    }

    private static int showMenu(Scanner console){
        System.out.print("""
                Menu:
                1. Register a book
                2. Register a new user
                3. Lend a book
                4. Return a book
                5. List all available books
                6. List all active loans
                7. Exit
                Choose an option:\s""");
        // Read and return the chosen option
        return Integer.parseInt(console.nextLine());
    }

    private static boolean executeOptions(int option){
        var exit = false;
        switch (option){
            case 7 -> {
                System.out.println("Thanks for stopping by, come back anytime!");
                exit = true;
            }
            default -> System.out.println("Invalid Option: " + option);
        }
        return exit;
    }
}
