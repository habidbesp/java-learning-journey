import java.util.Scanner;

public class ShippingCostCalculator2 {
    public static void main(String[] args) {
        System.out.println("*** Shipping Cost Calculator - with Switch (modern syntax) ***");

        // Define constant fees for domestic and international shipments
        final var FEE_DOMESTIC = 3.50;
        final var FEE_INTERNATIONAL = 6.10;

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to specify if the shipment is domestic or international
        System.out.print("Is the shipment domestic or international? ");
        var destiny = console.nextLine().strip().toLowerCase(); // Normalize input to lower case and remove extra spaces

        // Prompt the user to enter the weight of the shipment in kilograms
        System.out.print("How many kilograms does your shipment weigh? ");
        var weigh = Double.parseDouble(console.nextLine()); // Read and parse the weight input as a double

        // Variable to calculate the total shipping cost with switch (modern syntax)
        Double totalShipment = switch (destiny){
            case "domestic" -> weigh * FEE_DOMESTIC; // Calculate cost for domestic shipment
            case "international" -> weigh * FEE_INTERNATIONAL; // Calculate cost for international shipment
            default -> {
                // If the destiny is unknown, set an error message
                System.out.println("Error: Unknown destiny, '" + destiny + "' is not a valid destiny");
                yield null;
            }
        };

        // Print the shipment details if there were no errors
        if(totalShipment != null)
            System.out.printf("""
            %nShipment Details:\s
            -----------------------
            \tYour shipment is: %s
            \tIt weights: %.1f kg
            \tThe total amount is: € %.2f
            """, destiny, weigh, totalShipment);

    }
}
