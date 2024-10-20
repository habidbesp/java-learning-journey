import java.util.Scanner;

public class SeasonIdentifier {
    public static void main(String[] args) {
        System.out.println("*** Season Identifier ***");

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to enter a number for the month (1 to 12)
        System.out.print("Provide a number for the month " +
                "(number from 1 to 12) to identify the season: ");

        // Read and parse the input as an integer representing the month
        var month = Integer.parseInt(console.nextLine());

        // Determine the season based on the month using the ternary operator
        // If the month is not in the range of 1 to 12, assign "Unknown Season"
        var season = (month >= 1 && month <=2)
                || month == 12 ? "Winter" :
                month >= 3 && month <= 5 ? "Spring" :
                        month >= 6 && month <=8 ? "Summer" :
                                month >= 9 && month <= 11 ? "Fall" :
                                        "Unknown Season";

        // Output the identified season to the console
        System.out.printf("The season for the month %d is %s", month, season );
    }
}
