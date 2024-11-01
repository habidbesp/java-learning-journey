package snacks_machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static snacks_machine.MathUtils.formatRoundPrice;

public class SnacksMachine {
    public static void main(String[] args) {
        snacksMachine();
    }

    public static void snacksMachine() {
        var exit = false;
        var console = new Scanner(System.in);

        // Creating a list of products of type Snack
        List<Snack> products = new ArrayList<>();
        System.out.println("*** Snacks Machine ***");
        Snacks.showSnacks(); // Display the inventory of available snacks

        while (!exit){
            try {

                var option = showMenu(console);
                exit = executeOptions(option, console, products);

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
                1. Buy a snack
                2. Show ticket
                3. Add new snack
                4. Exit
                Choose an option:\s""");
        // Read and return the chosen option
        return Integer.parseInt(console.nextLine());
    }

    private static boolean executeOptions(int option, Scanner console, List<Snack> products){
        var exit = false;
        switch (option){
            case 1 -> purchaseSnack(console, products);
            case 2 -> showReceipt(products);
            case 3 -> addSnack(console);
            case 4 -> {
                System.out.println("Thanks for stopping by, come back anytime!");
                exit = true;
            }
            default -> System.out.println("Invalid Option: " + option);
        }
        return  exit;
    }

    private static void purchaseSnack(Scanner console, List<Snack> products){
        System.out.print("What snack would you like to purchase (by ID)? ");
        var idSnack = Integer.parseInt(console.nextLine());

        // Validate if the snack exists in the list
        var isSnackFound = false;
        for(var snack: Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                // Add the snack to the product list
                products.add(snack);
                System.out.println("Snack successfully added: " + snack);
                isSnackFound = true;
                break;
            }
        }
        if(!isSnackFound){
            System.out.println("The Id of the snack was not found: " + idSnack);
        }
    }

    private static void showReceipt(List<Snack> products){
        var receipt = "*** Purchase Receipt ***";
        var total = 0.0;

        for(var product: products){

            receipt += "\n\t- " + product.getName() + " - €" + formatRoundPrice(product.getPrice());
            total += product.getPrice();
        }
        receipt += "\n\tTotal -> € " + formatRoundPrice(total);
        System.out.println(receipt);
    }

    private static void addSnack(Scanner console){
        System.out.print("Enter the name of the snack: ");
        var name = console.nextLine();
        System.out.print("Enter the price of the snack: ");
        var price = Double.parseDouble(console.nextLine());
        Snacks.addSnack(new Snack(name, price));
        System.out.println("Snack added successfully");
        Snacks.showSnacks();
    }
}

