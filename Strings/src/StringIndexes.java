public class StringIndexes {
    public static void main(String[] args) {
        // handling string indexes
        var string1 = "Hello World";
        // Get first character
        var firstCharacter = string1.charAt(0); // Gets the char "H"
        System.out.println("firstCharachter = " + firstCharacter);
        // Get last character
        var lastCharacter = string1.charAt(10);
        System.out.println("lastCharacter = " + lastCharacter);
        // Print the character "W"
        var characterW = string1.charAt(6);
        System.out.println("characterW = " + characterW);
    }
}
