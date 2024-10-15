import java.util.Scanner;

public class ReadDataTypes {
    public static void main(String[] args) {
        // Read different data types

        // Read a type int
        var console = new Scanner(System.in);
        System.out.print("Enter your age: ");
        var age = console.nextLine();
        System.out.println("age = " + age);

        // Read a type double
        System.out.print("Enter your height: ");
        var height = console.nextDouble();
        System.out.println("height = " + height);

        // consume the newline character
        console.nextLine();

        // Read a String Type
        System.out.print("Enter your name: ");
        var name = console.nextLine();
        System.out.println("name = " + name);

        // Data Conversion
        System.out.print("Provide an integer value: ");
        // var integerString = console.nextLine();
        var integer = Integer.parseInt(console.nextLine());
        System.out.println("integer = " + integer);
        
        // Float Type
        System.out.print("Provide a float value: ");
        var floatValue = Float.parseFloat(console.nextLine());
        System.out.println("floatValue = " + floatValue);

    }
}
