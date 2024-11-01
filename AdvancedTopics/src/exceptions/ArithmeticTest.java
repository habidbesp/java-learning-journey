package exceptions;

public class ArithmeticTest {
    public static void main(String[] args) {
        try {
            var result = Arithmetic.division(10, 2);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
        finally {
            System.out.println("The division by 0 was checked.");
        }
    }
}
