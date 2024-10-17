import java.util.Scanner;

public class BookLendingSystem {
    public static void main(String[] args) {

        // This code implements a simple book lending system
        // that checks if a student is eligible for a loan based
        // on their student credentials or their proximity to
        // the library (within 3 kilometers). The eligibility
        // is determined using the or operator (||), meaning
        // that if either condition is true (having student
        // credentials or living within the allowed distance),
        // the student is considered eligible for a book loan.

        System.out.println("*** Book Lending System ***");

        final var ALLOWED_DISTANCE_KM = 3;
        var console = new Scanner(System.in);

        System.out.print("Do you have student credentials (true/false)? ");
        var hasCredentials = Boolean.parseBoolean(console.nextLine());

        System.out.print("How many kilometers do you live from the library? ");
        var distanceLibraryKm = Integer.parseInt(console.nextLine());

        var isStudentEligibleForLoan =
                hasCredentials || distanceLibraryKm < ALLOWED_DISTANCE_KM;

        System.out.println("Are you eligible for a book loan? " + isStudentEligibleForLoan);

    }
}
