import java.util.Scanner;

public class ValueWithinRange {
    public static void main(String[] args) {
        System.out.println("*** Value within the Range ***");

        // Define ranges
        final var MIN = 0;
        final var MAX = 5;

        // Request a value between 0 and 5
        System.out.print("Provide a value between 0 and 5: ");
        var value = Integer.parseInt(new Scanner(System.in).nextLine());

        // Verify if the value is within the range
        var isWithinRange = value >= MIN && value <= MAX;
        System.out.println("The value is within the range? = " + isWithinRange);

    }
}
