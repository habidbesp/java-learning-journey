import java.util.Scanner;

public class VariableRange {
    public static void main(String[] args) {

        // This code snippet prompts the user to provide an
        // integer and checks if it falls within the range of
        // 1 to 10. The first condition, 'isWithinTheRange',
        // determines whether the provided integer is within
        // the specified range by evaluating if it is greater
        // than or equal to 1 and less than or equal to 10.

        var console = new Scanner(System.in);

        System.out.print("Provide an integer data type: ");
        var data = Integer.parseInt(console.nextLine());

        // Check if the provided integer is within the range of 1 to 10.
        var isWithinTheRange = data >= 1 && data <=10;
        System.out.println(
                "Provided integer is within the range 1 to 10? "
                        + isWithinTheRange);

        //The main topic addressed in this code is the not
        // operator (!). Its sole function is to invert the
        // result of a condition. An example is 'isOutOfRange',
        // where the not operator inverts the result of the condition,
        // indicating that the integer is outside the established
        // range. The result of this check is then printed, confirming
        // whether the integer is out of the defined range.

        // Check if the provided integer is out of the range of 1 to 10.
        var isOutOfRange = !(data >= 1 && data <=10);

        System.out.println(
                "Provided integer is out of the range 1 to 10? "
                        + isOutOfRange);


    }
}
