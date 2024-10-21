import java.util.Scanner;

public class SeasonIdentifier2 {
    public static void main(String[] args) {
        System.out.println("*** Season Identifier - with switch (new syntax) ***");

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to enter a number for the month (1 to 12)
        System.out.print("Provide a number for the month " +
                "(number from 1 to 12) to identify the season: ");

        // Read and parse the input as an integer representing the month
        var month = Integer.parseInt(console.nextLine());

        // Determine the season based on the month using the new syntax switch
        //  assigning the result to the variable 'season'
        var season = switch (month){
            // if month is equals to 1 or 2 or 12, season = "Winter"
            case 1, 2, 12  -> "Winter";

            // if month is equals to 3 or 4 or 5, season = "Spring"
            case 3, 4, 5  -> "Spring";

            // if month is equals to 6 or 7 or 8, season = "Summer"
            case 6, 7, 8  -> "Summer";

            // if month is equals to 9 or 10 or 11, season = "Fall"
            case 9, 10, 11  -> "Fall";

            // If the month is not in the range of 1 to 12, assign "Error: Unknown Season"
            default -> "Error: Unknown Season.";
        };

        // Output the identified season to the console
        System.out.printf("The season for the month %d is %s", month, season );
    }
}
