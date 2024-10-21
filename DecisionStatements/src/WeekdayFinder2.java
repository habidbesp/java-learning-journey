import java.util.Scanner;

public class WeekdayFinder2 {
    public static void main(String[] args) {
        System.out.println("*** Weekday Finder - using the new switch syntax ***");

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to provide a number between
        // 1 and 7 to find the corresponding day of the week
        System.out.print("Provide a number from 1 to 7 to find the " +
                "corresponding day of the week: ");

        // Read and parse the input as an integer representing the day
        var day = Integer.parseInt(console.nextLine());

        // Use the new syntax of the switch statement to match the number to
        // the corresponding day of the week
        switch (day){
            // If the number is 1, print Monday
            case 1 -> System.out.println("Monday");

            // If the number is 2, print Tuesday
            case 2 ->  System.out.println("Tuesday");

            // If the number is 3, print Wednesday
            case 3 -> System.out.println("Wednesday");

            // If the number is 4, print Thursday
            case 4 -> System.out.println("Thursday");

            // If the number is 5, print Friday
            case 5 -> System.out.println("Friday");

            // If the number is 6, print Saturday
            case 6 -> System.out.println("Saturday");

            // If the number is 7, print Sunday
            case 7 -> System.out.println("Sunday");

            // If the input is not between 1 and 7, print an error message
            default -> System.out.println("Error: Provide a number from 1 to 7.");
        }
    }
}
