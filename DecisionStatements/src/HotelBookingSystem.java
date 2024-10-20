import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        System.out.println("*** Hotel Booking System ***");

        // Constants
        final var PREIS_ROOM_WITHOUT_SEA_VIEW = 150.50;
        final var PREIS_ROOM_WITH_SEA_VIEW = 190.50;

        // User prompts information
        var console = new Scanner(System.in);

        System.out.print("Guest name: ");
        var guestName = console.nextLine();

        System.out.print("Length of stay: ");
        var lengthOfStay = Integer.parseInt(console.nextLine());

        System.out.print("With a sea view (true/false)? ");
        var withSeaView = Boolean.parseBoolean(console.nextLine());

        // Calculate the total cost of the reservation using a ternary operator.
        var totalCost = (!withSeaView ? PREIS_ROOM_WITHOUT_SEA_VIEW
                : PREIS_ROOM_WITH_SEA_VIEW) * lengthOfStay;

        // Verify if the room has a sea view using the ternary operator.
        var hasSeaView = !withSeaView ? "No 🙁" : "Yes 😊";

        // Print information
        System.out.printf("""
                %n------ Reservation Details ------
                Guest: %s
                Length of stay: %d days
                Total cost: € %.2f
                Room with sea view: %s
                """, guestName, lengthOfStay, totalCost, hasSeaView);
    }
}
