public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("*** Even Numbers from 0 to 20 ***");

        // Initialize the counter variable to 0
        var counter = 0;

        // Start a while loop that will continue as
        // long as counter is less than or equal to 20
        while(counter <= 20 ){

            // Check if the current value of counter is even
            // (divisible by 2 with no remainder)
            if(counter % 2 == 0)

                // If true, print the current value of counter followed
                // by a space
                System.out.print(counter + " ");

            // Increment counter by 1 to move to the next number
            counter++;
        }
    }
}
