public class AndOperator {
    public static void main(String[] args) {
        System.out.println("*** AND Operator ***");
        boolean a = true, b = false;
        // AND (returns false if either evaluated value is false)
        var result = a && b;
        System.out.println("result a && b = " + result);

        // AND (returns true if both evaluated values are true)
        boolean x = true, y = true;
        result = x && y;
        System.out.println("result = " + result);
    }
}
