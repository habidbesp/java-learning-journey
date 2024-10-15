public class StringImmutability {
    public static void main(String[] args) {
        // Immutability of Strings
        var string1 = "Hello"; // Create a String object in memory with the value "Hello"
        System.out.println("string1 = " + string1); // Print the current value of string1

        var string2 = string1; // string2 now references the same object as string1
        string1 = "bye"; // Assign a new String object "bye" to string1

        System.out.println("string1 modified= " + string1); // Print the modified value of string1 "bye"
        System.out.println("string2 = " + string2); // Print the value of string2, which is still "Hello"
    }
}
