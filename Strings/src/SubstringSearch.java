public class SubstringSearch {
    public static void main(String[] args) {
        // Substring search
        //indexOf - return the first substring occurrence's index
        var string1 = "Hello World";
        var firstSubstrIndex = string1.indexOf("Hello");
        System.out.println("firstSubstrIndex = " + firstSubstrIndex);

        // lastIndexOf - return the last substring's occcurrence
        var lastIndex = string1.lastIndexOf("World");
        System.out.println("lastIndex = " + lastIndex);

        // substring not found in method indexOf() returns -1
        var notFoundIndex = string1.indexOf("Java");
        System.out.println("notFoundIndex = " + notFoundIndex); // returns -1
    }
}
