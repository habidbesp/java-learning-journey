public class ReverseOrderPrinter {
    public static void main(String[] args) {
        System.out.println("*** Reverse Order Printer ***");

        // Initialize the counter variable to 10
        var counter = 10;

        // Start a do-while loop which will execute at least once
        do {
            // Print the current value of counter followed by a space
            System.out.print(counter + " ");

            // Decrement counter by 1
            counter--;

            // Check the condition after the block has executed
        } while (counter >= 0); // Continue the loop as long as counter is greater than or equal to 0
    }
}
