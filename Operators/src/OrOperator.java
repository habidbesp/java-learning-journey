public class OrOperator {
    public static void main(String[] args) {
        System.out.println("*** OR Operator ***");

        // OR (returns true if at least one of the evaluated values is true)
        boolean a = true, b = false;
        var result = a || b; // logical OR operator
        System.out.println("result = " + result); // true

        // If both values are false, result returns false
        a = false;
        result = a || b;
        System.out.println("result = " + result); // false

        // If both values are true, result returns true
        a = true;
        b = true;
        result = a || b;
        System.out.println("result = " + result); // true
    }
}
