public class ReplaceSubstrings {
    public static void main(String[] args) {
        // replace substrings
        var string = "Hello World";
        System.out.println("string = " + string);

        // Replace "World" por "everyone"
        var newString = string.replace("World", "everyone");
        System.out.println("newString = " + newString); // returns "Hello everyone"

        // Replace "Hello" for "Goodbye"
        newString = string.replace("Hello", "Goodbye");
        System.out.println("newString = " + newString); //
    }
}
