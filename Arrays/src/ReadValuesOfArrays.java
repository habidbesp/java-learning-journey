public class ReadValuesOfArrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers with 5 elements
        var integers = new int[5];

        integers[0] = 13;  // Assign 13 to the first element (index 0)
        integers[1] = 21;  // Assign 21 to the second element (index 1)
        integers[4] = 62;  // Assign 62 to the fifth element (index 4)

        // Reading elements of an array
        System.out.println("value 1 = " + integers[0]);
        System.out.println("value 2 = " + integers[1]);
        System.out.println("value 3 = " + integers[2]);
        System.out.println("value 4 = " + integers[4]);
    }
}
