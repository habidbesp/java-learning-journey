import java.util.Scanner;

public class StepBurnApp {
    public static void main(String[] args) {
        System.out.println("*** Step Burn App ***");

        // Constants
        final var DAILY_STEP_TARGET = 10000;
        final var CALORIES_PER_STEP = 0.04; // Approximate value in kilocalories

        // User prompts information
        var console = new Scanner(System.in);

        System.out.print("What is your name? ");
        var username = console.nextLine();

        System.out.print("How many steps did you walk today? ");
        var dailySteps = Integer.parseInt(console.nextLine());

        // Check if the user reached the daily step goal.
        var goalAchieved = (dailySteps >= DAILY_STEP_TARGET) ? "Yes 😀" : "No 🙁";

        // Calculate calories burned
        var caloriesBurned = dailySteps * CALORIES_PER_STEP;

        // Print information
        System.out.printf("""
                %nUser: %s
                Steps taken today: %d
                Calories burned: %.2f kcal
                Daily step goal achieved: %s
                -----------------------------
                The daily step goal is: %d pasos
                """, username, dailySteps, caloriesBurned, goalAchieved, DAILY_STEP_TARGET);

    }
}
