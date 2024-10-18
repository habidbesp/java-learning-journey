public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("*** Ternary Operator ***");

        // Syntax
        // condition ? resultIfTrue : resultIfFalse;

        // Determine if a number is even or not.
        var number = 3;
        var result = (number % 2 == 0)  ? "even" : "odd";

        System.out.println("The number "+ number + " is " + result);

        // "Calculate if one is of legal age."
        var age = 17;
        var message = (age >= 18) ? "you are of legal age" : "you are a minor.";
        System.out.println("\nYou are " + age +" years old, "+ message);

        // Positive, negative, or zero value (nested ternary operator).
        number = 0;
        result = (number > 0) ? "positive" :
                (number < 0) ? "negative" :
                        "zero";
        System.out.println("\nThe number " + number + " is " + result);
    }

}

