public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("*** Ciclo do-while ***");

        // Initialize the counter variable to 1
        var counter = 1;

        // Start a do-while loop which will execute at least once
        do {
            // Print the current value of counter followed by a space
            System.out.print(counter + " ");

            // Increment counter by 1
            counter++;

            // Check the condition after the block has executed
        } while (counter <= 3); // Continue the loop as long as counter is less than or equal to 3

    }
}
