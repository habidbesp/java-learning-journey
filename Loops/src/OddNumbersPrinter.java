public class OddNumbersPrinter {
    public static void main(String[] args) {
        System.out.println("*** Odd Number Printer ***");

        // Initialize the counter variable to 1
        var counter = 1;

        // Start a do-while loop which will execute at least once
        do {

            // Check if the current value of counter is odd
            // (not divisible by 2 without a remainder)
            if(counter % 2 != 0)
                System.out.print(counter + " ");

            // Increment counter by 1
            counter++;

            // Check the condition after the block has executed
        } while (counter <= 20); // Continue the loop as long as counter is less than or equal to 20
    }
}
