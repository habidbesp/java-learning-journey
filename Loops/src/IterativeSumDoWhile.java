public class IterativeSumDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Iterative Sum with do-while loop ***");

        // Define a constant MAX that represents the maximum number for the sum
        final var MAX = 5;

        // Initialize the variable for the cumulative partial sum to 0
        var iterativeSum = 0;

        // Initialize the variable number to 1, which will be used for iteration
        var number = 1;

        // Start a do-while loop which will execute at least once
        do {
            // Print the current values of iterativeSum and number before the addition
            System.out.println("(iterativeSum + number) -> "

                    + iterativeSum + " + " + number);
            // Add the current value of number to iterativeSum, then increment number by 1
            iterativeSum += number++;

            // Print the cumulative partial sum after the addition
            System.out.println("Cumulative partial sum: " + iterativeSum + "\n");

            // Check the condition after the block has executed
        } while (number <= MAX); // Continue the loop as long as counter is less than or equal to MAX

        // Print the final sum of the first MAX numbers
        System.out.println("Sum of the first " + MAX + " numbers is: "+ iterativeSum);
    }
}
