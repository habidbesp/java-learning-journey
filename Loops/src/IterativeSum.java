public class IterativeSum {
    public static void main(String[] args) {
        System.out.println("*** Iterative Sum ***");

        // Define a constant MAX that represents the maximum number for the sum
        final var MAX = 5;

        // Initialize the variable for the cumulative partial sum to 0
        var iterativeSum = 0;

        // Initialize the variable number to 1, which will be used for iteration
        var number = 1;

        // Start a while loop that continues as long as number is less than or equal to MAX
        while (number <= MAX) {

            // Print the current values of iterativeSum and number before the addition
            System.out.println("(iterativeSum + number) -> "
            + iterativeSum + " + " + number);

            // Add the current value of number to iterativeSum, then increment number by 1
            iterativeSum += number++;

            // Print the cumulative partial sum after the addition
            System.out.println("Cumulative partial sum: " + iterativeSum + "\n");
        }

        // Print the final sum of the first MAX numbers
        System.out.println("Sum of the first " + MAX + " numbers is: "+ iterativeSum);
    }
}
