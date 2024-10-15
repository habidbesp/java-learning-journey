public class Strings {
    public static void main(String[] args) {
        System.out.println("*** String handling in Java ***");
        var string1 = "Hello";
        System.out.println("string1 = " + string1);
        var string2 = new String("World");
        System.out.println("string2 = " + string2);
        var string3 = string1 + " " + string2;
        System.out.println("string3 = " + string3);

        // text block string
        var string4 = """
                this is a text
                block
                string;
                adding more
                lines
                """;
        System.out.println("string4 = " + string4);

    }
}
