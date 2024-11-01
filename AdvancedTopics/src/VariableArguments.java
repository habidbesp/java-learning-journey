/**
 * This class demonstrates the use of varargs (variable-length arguments) in Java.
 * Varargs allow a method to accept a variable number of arguments of a specified type,
 * providing flexibility for cases where the number of inputs can vary.
 *
 * In this example:
 *   - The `differentParams` method uses varargs to take a variable number of integers
 *     alongside a String parameter. This is a useful approach when a method needs both fixed
 *     and flexible parameters.
 *   - The `printNumbers` method also uses varargs to receive and print any number of integers.
 */
/**
 * Key Points:
 *   1. Varargs are declared by appending an ellipsis (...) to the type, e.g., int... numbers.
 *      They are treated as arrays within the method, allowing operations like iteration.
 *   2. A method can have only one varargs parameter, which must be placed last in the parameter list.
 *   3. In this example, we pass numbers as a varargs argument to `printNumbers`, which prints each integer.
 */

public class VariableArguments {
    public static void main(String[] args) {

        // printNumbers(1, 2, 3, 4, 5, 6, 7, 8); // vararg
        differentParams("Karla", 10, 20, 30);
    }

    static void differentParams(String name, int... numbers) {
        System.out.println("Name: " + name);
        printNumbers(numbers);
    }

    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
