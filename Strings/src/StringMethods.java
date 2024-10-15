public class StringMethods {
    public static void main(String[] args) {
        // StringMethod
        var string1 = "Hello World";

        // Get the string's length
        var length = string1.length();
        System.out.println("length = " + length); // prints: 11

        // Replace characters
        var newString = string1.replace('o', 'a');
        System.out.println("newString = " + newString); // prints: Hella Warld

        // transform to uppercase characters
        var uppercaseString = string1.toUpperCase();
        System.out.println("uppercaseString = " + uppercaseString);

        // transform to lowercase characters
        var lowercaseString = string1.toLowerCase();
        System.out.println("lowercaseString = " + lowercaseString);

        // eliminate spaces at the beginning and end of String
        var string2 = "  Leo Reyes       ";
        System.out.println("string2 with spaces= " + string2);
        System.out.println("string2 without spaces= " + string2.trim());

    }
}
