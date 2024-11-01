/**
 * This class demonstrates the use of the for-each loop in Java.
 * The for-each loop is a convenient way to iterate over elements in a collection or array
 * without needing an explicit index.
 *
 * In this example:
 *   - The `ages` array is initialized with integer values.
 *   - The for-each loop iterates over each element in the `ages` array, storing each value
 *     temporarily in the `age` variable during each iteration.
 *   - Each `age` value is then printed directly, providing a simple and readable way to process each element.
 *
 * Key Points:
 *   1. The for-each loop is typically used when you need to access each element in a collection
 *      sequentially and do not need to modify the collection.
 *   2. Syntax: for (Type element : collection) { ... }
 *      - `Type` is the type of elements in the array (e.g., int).
 *      - `element` is the variable that will hold each item in the array during each loop iteration.
 *      - `collection` is the array or collection being iterated over.
 */


public class ForEach {
    public static void main(String[] args) {
        int ages[] = {5, 10, 30, 40};
        // foreach
        for (int age : ages){
            System.out.println("age = " + age );
        }
    }
}
