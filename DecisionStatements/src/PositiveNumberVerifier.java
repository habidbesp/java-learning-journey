import java.util.Scanner;

public class PositiveNumberVerifier {
    public static void main(String[] args) {
        System.out.println("*** Positive Number Verifier ***");

        // Input: The code uses a Scanner to capture user input
        // from the console. The input is read as a string and
        // then parsed into an integer (inputNumber).

        var console = new Scanner(System.in);

        System.out.print("Please enter a number for verification: ");
        var inputNumber = Integer.parseInt(console.nextLine());

        //Conditionals:
        if(inputNumber > 0){
            //If the number is greater than 0, it prints
            // "Your number is positive" followed by the number.
            System.out.println("Your number is positive " + inputNumber);
        }else if(inputNumber < 0){
            //If the number is less than 0, it prints
            // "Your number is negative" followed by the number.
            System.out.println("Your number is negative " + inputNumber);
        }else{
            //If the number is exactly 0, it prints
            // "Your number is zero."
            System.out.println("Your number is zero " + inputNumber);
        }
    }
}
