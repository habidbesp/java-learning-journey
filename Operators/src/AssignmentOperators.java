public class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("*** Assignment Operators ***");

        // Assignment
        var myNumber = 10;
        int myNumber2;
        myNumber2 = 15;

        // Compound Assignment
        // +=
        myNumber += 5; // myNumber = myNumber + 5
        System.out.println("myNumber = " + myNumber);

        // -=, *=, /=, and %=
        myNumber *= 2; // myNumber = myNumber * 2 => 30
        System.out.println("myNumber = " + myNumber);

        // multiple variable declaration ( not possible with var declaration )
        int a = 10, b = 15, c = 20;

        // Positional Format Specifiers
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
