public class IteratingMatrices {
    public static void main(String[] args) {
        // define a matrix (two-dimensional arrays)
        final var ROWS = 2;
        final var COLUMNS = 3;
        var matrix = new int[ROWS][COLUMNS];
        // Modifying values in the matrix
        matrix[0][0] = 100; // value 1
        matrix[0][1] = 200; // value 2
        matrix[0][2] = 300; // value 3
        matrix[1][0] = 400; // value 4
        matrix[1][1] = 500; // value 5
        matrix[1][2] = 600; // value 6

        // iterating a matrix (nested for loop)
        // 1. Iterate over the outermost loop to traverse the rows
        for (int row = 0; row < ROWS; row++) {
            // Iterate over the innermost loop to traverse the columns.
            for (int col = 0; col < COLUMNS; col++) {
                System.out.println("Value[" + row + "][" + col + "] = " + matrix[row][col]);
            }

        }

    }
}
