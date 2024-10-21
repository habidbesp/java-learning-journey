import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("*** Grade Converter ***");

        // Create a Scanner object to read user input
        var console = new Scanner(System.in);

        // Prompt the user to enter their score on the exam (between 0 and 10)
        System.out.print("How many points did you score on " +
                "the exam (between 0 and 10)? ");

        // Read and parse the user input as a double
        var points = Double.parseDouble(console.nextLine());

        // Initialize a variable to hold the grade as an empty string
        var grade = "";

        // Determine the grade based on the score entered by the user
        if(points >= 9 && points <= 10)
            grade = "A"; // Assign "A" for scores between 9 and 10
        else if (points >= 8 && points < 9)
            grade = "B"; // Assign "B" for scores between 8 and below 9
        else if (points >= 7 && points < 8)
            grade = "C"; // Assign "C" for scores between 7 and below 8
        else if (points >= 6 && points < 7)
            grade = "D"; // Assign "D" for scores between 6 and below 7
        else if (points >= 0 && points < 6)
            grade = "F"; // Assign "F" for scores below 6
        else
            grade = "Unknown grade"; // Assign "Unknown grade" for invalid inputs

        // Print the user's score and corresponding grade
        System.out.printf("""
                You score %.1f points,
                Your grade is: %s
                """, points, grade);
    }
}
