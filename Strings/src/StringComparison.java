public class StringComparison {
    public static void main(String[] args) {
        // String comparison (string pool)
        var string1= "Java";
        var string2 = "Java";

        // Creates a new space in memory
        var string3 = new String("Java");

        // String comparison (==) compares the reference.
        System.out.print("string1 is equals in reference to string2: ");
        System.out.println(string1 == string2); // prints true

        // Comparison string1 and string3 (references)
        System.out.print("string1 is equals in reference to string3: ");
        System.out.println(string1 == string3); // prints false

        // comparing the content but not the reference in memory with method "equals()"
        System.out.print("string1 is equals in content to string3: ");
        System.out.println(string1.equals(string3)); // prints true

    }
}
