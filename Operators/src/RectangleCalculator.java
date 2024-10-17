import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        System.out.println("*** Rectangle Calculator " +
                "- calculate area and perimeter of a rectangle ***");

        //This code implements a simple Rectangle Calculator
        // that computes the area and perimeter of a rectangle.
        // The program prompts the user to input the length and
        // height of the rectangle in meters.

        var console = new Scanner(System.in);

        System.out.print("What is the length of your rectangle (mts)? ");
        var length = Double.parseDouble(console.nextLine());

        System.out.print("What is de height of your rectangle (mts)? ");
        var height = Double.parseDouble(console.nextLine());

        //It then calculates the area by multiplying the length by
        // the height and the perimeter by using the formula
        // 2 * (length + height). The calculated area and
        // perimeter are displayed to the user, formatted
        // to two decimal places. This application demonstrates
        // basic input handling, arithmetic operations, and formatted
        // output in Java, providing the user with essential
        // measurements of the rectangle.

        var area = length * height;
        var perimeter = 2 * (length + height);

        System.out.printf("""
                Your rectangle has following measurements:
                Area: %.2f m2
                Perimeter: %.2f m
                """, area, perimeter);
    }
}
