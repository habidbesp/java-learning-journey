public class ComparisonOperators {
    public static void main(String[] args) {
        System.out.println("*** Comparison Operators ***");

        int a = 3,  b = 2;

        // Equal to (==): Checks if two values are equal.
        var result = a == b;
        System.out.println("result a == b : " + result); // false

        // Not equal to (!=): Checks if two values are not equal.
        result = a != b;
        System.out.println("result a != b : " + result); // true

        // Greater than (>): Checks if the left value is greater than the right value.
        result = a > b;
        System.out.println("result a > b : " + result); // true

        // Greater than or equal to (>=): Checks if the left value is greater
        // than or equal to the right value.
        result = a >= b;
        System.out.println("result a >= b : " + result); // true

        // Less than (<): Checks if the left value is less than the right value.
        result = a < b;
        System.out.println("result a < b : " + result); // false

        // Less than or equal to (<=): Checks if the left value is less than
        // or equal to the right value.
        result = a <= b;
        System.out.println("result a <= b : " + result); // false


    }
}
