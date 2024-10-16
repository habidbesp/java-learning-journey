public class UnaryOperators {
    public static void main(String[] args) {
        System.out.println("*** Unary Operators ***");
         int a = 3, b = -2, result;
         var c = true;

         // Unary Operator +
        result = +a;
        System.out.println("result +a = " + result);

        // Unary Operator -
        result = -a;
        System.out.println("result -a = " + result);

        // Unary Operators increment/decrement
        // pre-increment
        a = 3; // The value 3 is assigned to the variable a

        // the pre-increment operator (++a) is used.
        // This means that a is incremented before its
        // value is used in the assignment.
        result = ++a; // a is first increased from 3 to 4
         // the new value of a (which is now 4) is assigned to result.
        System.out.println("result ++a = " + result);

        // post-increment
        a = 3; // The value 3 is assigned to the variable a

        // the current value of a (which is 3) is assigned
        // to result **before** a` is incremented.
        result = a++;
        System.out.println("result a++ = " + result);

        // After this operation, a is incremented to 4
        System.out.println("a = " + a);

        //Pre-decrement
        b = -2;
        result = --b; // // first, b is decremented and then the value is used
        System.out.println("result --b = " + result);
        System.out.println("b is already decremented = " + b);

        // Post-decrement
        b = -2;
        result = b--; // first, the value is used and then it is decremented
        System.out.println("result b-- = " + result);
        System.out.println("b at this moment gets decremented = " + b);


    }
}
