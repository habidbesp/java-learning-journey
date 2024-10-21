import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        System.out.println("*** Weekday Finder - with Switch ***");

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to provide a number between
        // 1 and 7 to find the corresponding day of the week
        System.out.print("Provide a number from 1 to 7 to find the " +
                "corresponding day of the week: ");

        // Read and parse the input as an integer representing the day
        var day = Integer.parseInt(console.nextLine());

        // Use a switch statement to match the number to
        // the corresponding day of the week
        switch (day){
            case 1:
                // If the number is 1, print Monday
                System.out.println("Monday");
                break;
            case 2:
                // If the number is 2, print Tuesday
                System.out.println("Tuesday");
                break;
            case 3:
                // If the number is 3, print Wednesday
                System.out.println("Wednesday");
                break;
            case 4:
                // If the number is 4, print Thursday
                System.out.println("Thursday");
                break;
            case 5:
                // If the number is 5, print Friday
                System.out.println("Friday");
                break;
            case 6:
                // If the number is 6, print Saturday
                System.out.println("Saturday");
                break;
            case 7:
                // If the number is 7, print Sunday
                System.out.println("Sunday");
                break;
            default:
                // If the input is not between 1 and 7, print an error message
                System.out.println("Error: Provide a number from 1 to 7.");
                // No need for break after default, but it's
                // good practice to include it
                //break;
        }
    }
}
