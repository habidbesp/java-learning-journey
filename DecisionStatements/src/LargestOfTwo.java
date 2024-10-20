import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        System.out.println("*** Largest of Two ***");

        var console = new Scanner(System.in);

        // Prompt the user to enter the first number to evaluate
        System.out.print("Provide the first of the numbers to evaluate: ");
        var firstNumber = Integer.parseInt(console.nextLine());

        // Prompt the user to enter the second number to evaluate
        System.out.print("Provide the second of the numbers to evaluate: ");
        var secondNumber = Integer.parseInt(console.nextLine());

        // Determine the largest number using the ternary operator
        // If firstNumber is greater than secondNumber, assign firstNumber to result
        // If both numbers are equal, prompt for different integers
        // Otherwise, assign secondNumber to result
        var result = firstNumber > secondNumber ? firstNumber :
                firstNumber == secondNumber ? "Provide different integers" :
                secondNumber;


        // Output the largest number (or the prompt for different integers)
        System.out.println("Largest number is: " + result);
    }
}
