public class Exceptions {
    public static void main(String[] args) {
        int value1 = 10, value2 = 0;


        // Start a try block to handle potential exceptions
        try {
            // Attempt to divide value1 by value2
            var result = value1 / value2; // This will throw an ArithmeticException due to division by zero
            System.out.println("result = " + result); // This line will not execute if an exception is thrown

            // Catch any exceptions that occur in the try block
        } catch (Exception e) {
            // Print a message indicating that an error has occurred along with the exception details
            System.out.println("An error has occurred: " + e);
        }
    }
}
