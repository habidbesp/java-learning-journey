public class IterateArrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers with 5 elements
        var integers = new int[]{100, 200, 300, 400, 500};

        // Iterate through the elements of an array (for loop)
        for(int i = 0; i < integers.length ; i++)
            System.out.println("Value " + (i + 1) + " = " + integers[i]);

    }
}
