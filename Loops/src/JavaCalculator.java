import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var isCalculatorInProsses = true;

        while (isCalculatorInProsses){
            System.out.print("""
                    *** Java Calculator ***
                    Operations you can perform:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Exit => finish Process
                    Select an option:\s""");

            var option = console.nextInt();

            switch (option){
                case 1 -> {
                    System.out.print("Provide the first addend: ");
                    var firstAddend = console.nextDouble();

                    System.out.print("Provide the second addend: ");
                    var secondAddend = console.nextDouble();

                    System.out.printf("Sum result: %.2f%n%n",
                            (firstAddend + secondAddend));
                }
                case 2 -> {
                    System.out.print("Provide the minuend: ");
                    var minuend = console.nextDouble();

                    System.out.print("Provide the subtrahend: ");
                    var subtrahend = console.nextDouble();

                    System.out.printf("Subtraction result: %.2f%n%n",
                            (minuend - subtrahend));
                }
                case 3 -> {
                    System.out.print("Provide the multiplicand: ");
                    var multiplicand = console.nextDouble();

                    System.out.print("Provide the multiplier: ");
                    var multiplier = console.nextDouble();

                    System.out.printf("Multiplication result: %.2f%n%n",
                            (multiplicand * multiplier));
                }
                case 4 -> {
                    System.out.print("Provide the dividend: ");
                    var dividend = console.nextDouble();

                    System.out.print("Provide the divisor: ");
                    var divisor = console.nextDouble();
                    if(divisor != 0)
                        System.out.printf("Division result: %.2f%n%n",
                                (dividend / divisor));
                    else
                        System.out.println("Error: Divisor can not be 0\n");

                }
                case 5 ->{
                    System.out.println("Closing Calculator... See you soon\n");
                    isCalculatorInProsses = false;
                }
                default -> System.out.println("Invalid option...\n");
            }
        }
    }
}
