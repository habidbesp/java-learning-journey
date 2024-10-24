public class RecursiveFunctions {
    // Print numbers from 1 to 5 using a recursive function
    static void recursiveFunction(int number){
        // base case
        if(number == 1)
            System.out.print(number + " ");
        else {
            // recursive case
            // System.out.print(number + " "); // descending order
            recursiveFunction(number - 1);
            System.out.print(number + " "); // ascending order.
        }
    }

    public static void main(String[] args) {
        recursiveFunction(5);
    }
}
