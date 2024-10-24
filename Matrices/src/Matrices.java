public class Matrices {
    public static void main(String[] args) {
        // define a matrix (two-dimensional arrays)
        // 2 rows by 3 columns
        // int [][] matrix = new int[2][3];
        var matrix = new int[2][3];
        // Modifying values in the matrix
        matrix[0][0] = 100; // value 1
        matrix[0][1] = 200; // value 2
        matrix[0][2] = 300; // value 3
        matrix[1][0] = 400; // value 4
        matrix[1][1] = 500; // value 5
        matrix[1][2] = 600; // value 6
        // access values in the matrix
        System.out.println("Value 1 [0][0] = " + matrix[0][0]);
        System.out.println("Value 5 [1][1] = " + matrix[1][1]);
        System.out.println("Value 6 [1][2] = " + matrix[1][2]);
    }

}
