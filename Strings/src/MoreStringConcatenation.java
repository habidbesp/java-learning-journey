public class MoreStringConcatenation {
    public static void main(String[] args) {
        // more ways to concat strings
        var string1 = "Hello";
        var string2 = "World";
        var string3 = string1 + " " + string2;
        System.out.println("string3 using + = " + string3);

        // concat() method
        string3 = string1.concat(" ").concat(string2);
        System.out.println("string3 = " + string3);

        // StringBuilder - generates just one object in memory
        var stringConstructor = new StringBuilder();
        stringConstructor.append(string1);
        stringConstructor.append(" ");
        stringConstructor.append(string2);
        var result = stringConstructor.toString();
        System.out.println("result with StringConstructor = " + result);
        // StringBuilder is used to create mutable sequences
        // of characters, allowing efficient modification without
        // creating multiple objects in memory, unlike String, which
        // creates new objects with each modification. When used with var,
        // the type is inferred, but the behavior remains the
        // same—StringBuilder enables efficient string manipulations.


        // StringBuffer
        var stringBufferExample = new StringBuffer();
        stringBufferExample.append(string1).append(" ").append(string2);
        result = stringBufferExample.toString();
        System.out.println("result with StringBuffer = " + result);
        //StringBuffer is used for creating mutable sequences
        // of characters, similar to StringBuilder, but it
        // is synchronized, making it thread-safe. This ensures
        // that when multiple processes or threads are running
        // concurrently, the modifications to the StringBuffer
        // object are done in a safe and predictable manner without
        // causing data corruption.

        // join
        result = String.join(" ", string1, string2, "how are you?");
        System.out.println("result with join() = " + result);
    }
}
