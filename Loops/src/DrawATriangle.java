import java.util.Scanner;

public class DrawATriangle {
    public static void main(String[] args) {
        System.out.println("*** Draw a Triangle ***");
        var console = new Scanner(System.in);
        System.out.print("Provide the number of rows: ");
        var numberOfRows = console.nextInt();

        // Iterate ober each row of the triangle
        for(var row = 1; row <= numberOfRows; row++){
            var blankSpaces = " ".repeat(numberOfRows - row);
            var apples = "".repeat(2 * row - 1);
            System.out.println(blankSpaces + apples);
        }
    }
}
