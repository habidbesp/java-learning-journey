public class ModifyArrayValues {
    public static void main(String[] args) {
        // Declare and initialize an array of integers with 5 elements
        var integers = new int[5];

        // Modify the elements in the array
        // The number inside the square brackets represents the index of the array.
        // Arrays in Java are zero-based, meaning the indices range from 0 to array.length - 1.
        // In this case, the array has 5 elements, so the valid indices are 0 to 4.
        integers[0] = 13;  // Assign 13 to the first element (index 0)
        integers[1] = 21;  // Assign 21 to the second element (index 1)
        integers[4] = 62;  // Assign 62 to the fifth element (index 4)

    }
}
