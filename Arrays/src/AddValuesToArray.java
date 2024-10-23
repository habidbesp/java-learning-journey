import java.util.Scanner;

public class AddValuesToArray {
    public static void main(String[] args) {
        // Add values to an array
        var console = new Scanner(System.in);
        // Declare an Array
        System.out.print("Provides the length of the array: ");
        var arrayLength = Integer.parseInt(console.nextLine());
        // Create the array dynamically
        var integers = new int[arrayLength];
        // Request values for the array
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Provide integers[" + i + "] = ");
            integers[i] = Integer.parseInt(console.nextLine());
        }

        // print all the provided values
        System.out.println("\nArray values provided: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.println("integers[" + i + "] = " + integers[i]);
        }
    }
}
