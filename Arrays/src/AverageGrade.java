import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {
        System.out.println("*** Average Grade ***");
        var console = new Scanner(System.in);

        System.out.print("How many grades would you like to add? ");
        var gradesLength = Integer.parseInt(console.nextLine());

        if(gradesLength > 0){
            var sumResult = 0.0;
            for (int i = 0; i < gradesLength; i++) {
                System.out.print("grade " + (i +1 ) + " = " );
                sumResult += Double.parseDouble(console.nextLine());
            }
            var average = sumResult / gradesLength;
            System.out.printf("\nThe average of your grades is: %.2f", average);
        }
        else
            System.out.println("\nError: Please add a valid " +
                    "number of grades (greater than 0).");
    }
}
