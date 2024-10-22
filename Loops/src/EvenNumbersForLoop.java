public class EvenNumbersForLoop {
    public static void main(String[] args) {
        System.out.println("*** Even Numbers Printer from 0 to 20 with for loop ***");

        // The for loop initializes the variable "i"

        // The condition for the for loop to run is that the variable i <= 20

        // i++ increments the counter by 1 as long as i is less than or equal to 20

        // Inside the for loop, there is an if statement with the condition (i % 2 == 0)
        // This means if i is divisible by 2 with no remainder, it will execute and print the even number
        for(var i = 0; i <= 20; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }

    }
}
