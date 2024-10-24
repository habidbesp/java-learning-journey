import java.util.Scanner;

public class MatrixDataEntry {
    public static void main(String[] args) {
       // defining variables  to prompt rows and columns
        int rows, columns;
        var console = new Scanner(System.in);

        // Define a matrix
        System.out.print("Provide the rows: ");
        rows = Integer.parseInt(console.nextLine());
        System.out.print("Provide the columns: ");
        columns = Integer.parseInt(console.nextLine());
        var matrix = new int[rows][columns];

        // Request values for storing in the matrix.
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("Provide a value " +
                        "for matrix[" + row +"]" + "[" + column + "] = ");
                matrix[row][column] = Integer.parseInt(console.nextLine());
            }

        }

        // Print the new array with its values
        System.out.println("\nPrint the new array with its values: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Value " +
                        "in the matrix[" + row +"]" + "[" + column + "] = " + matrix[row][column] );

            }

        }

    }
}
