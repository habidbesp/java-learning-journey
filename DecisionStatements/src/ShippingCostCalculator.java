import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        System.out.println("*** Shipping Cost Calculator ***");

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

        var error = ""; // Variable to store any error messages
        var totalShipment = 0.0; // Variable to calculate the total shipping cost

        // Determine the total shipping cost based on the type of shipment
        if(destiny.equals("domestic")) {
            totalShipment = weigh * FEE_DOMESTIC; // Calculate cost for domestic shipment
        } else if (destiny.equals("international")) {
            totalShipment = weigh * FEE_INTERNATIONAL; // Calculate cost for international shipment
        } else {
            // If the destiny is unknown, set an error message
            error = "Error: Unknown destiny, '" + destiny + "' is not a valid destiny";
        }

        // Check if there was an error in the input
        if(!error.isEmpty()) {
            System.out.println(error); // Print the error message if present
        } else {
            // Print the shipment details if there were no errors
            System.out.printf("""
            %nShipment Details:\s
            -----------------------
            \tYour shipment is: %s
            \tIt weights: %.1f kg
            \tThe total amount is: € %.2f
            """, destiny, weigh, totalShipment);
        }
    }
}
