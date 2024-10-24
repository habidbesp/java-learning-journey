public class MatrixShortHandSyntax {
    public static void main(String[] args) {
        // Matrix shorthand syntax
        var matrix = new int[][]{
                {100, 200, 300}, // 1. row
                {400, 500, 600}  // 2. row
        };
        // Iterating the matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Value[" + row + "][" + col + "] = " + matrix[row][col]);
            }

        }




    }
}
