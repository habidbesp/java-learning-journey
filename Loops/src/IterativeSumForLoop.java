public class IterativeSumForLoop {
    public static void main(String[] args) {
        System.out.println("*** Iterative Sum with for Loop ***");

        // Define a constant MAX that represents the maximum number for the sum
        final var MAX = 5;

        // Initialize the variable for the cumulative partial sum to 0
        var iterativeSum = 0;

        // Start a for loop that continues as long as number is less than or equal to MAX
        for (var i = 1; i <= MAX; i++){
            System.out.println("(iterativeSum + i) -> "
                    + iterativeSum + " + " + i);

            // Add the current value of "i" to iterativeSum
            iterativeSum += i;

            // Print the cumulative partial sum after the addition
            System.out.println("Cumulative partial sum: " + iterativeSum + "\n");
        }

        // Print the final sum of the first MAX numbers
        System.out.println("Sum of the first " + MAX + " numbers is: "+ iterativeSum);
    }
}
