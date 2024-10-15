public class SubstringHandling {
    public static void main(String[] args) {
        // substrings
        var string1 = "Hello World";
        var substring1 =  string1.substring(0, 5); // prints substring hello (includes first index, but not the second one)
        System.out.println("substring1 = " + substring1);

        // var substring2 = string1.substring(6);
        var substring2 = string1.substring(6, 11);
        System.out.println("substring2 = " + substring2); // prints substring World
    }
}
