import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        // ArrayList: It is dynamic and array-based. It is efficient in access operations.
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

        // for(Object day: myList){
        //     System.out.println("day = " + day);
        // }

        // Lambda functions (anonymous function of very compact code)
        // myList.forEach(element-> {
        //     System.out.println("element: " + element);
        // });

        // Using a Method Reference with forEach:
        // The forEach method iterates over each element in myList and applies the specified action.
        // In this case, System.out::println is a method reference to the println method of System.out,
        // which will be called on each element of the list, effectively printing each element on a new line.
        // Method references provide a shorthand, readable way to pass behavior as an argument.
        myList.forEach(System.out::println);

        // The asList() method from the Arrays class generates a fixed-size list
        // initialized with the provided elements. In this case, a List of Strings
        // with the names "Pedro", "Ivonne", and "Noemi" is created.
        // The resulting list is backed by the original array, meaning it cannot be resized
        // (no additions or removals allowed). However, existing elements can be modified.
        // The forEach method is used with a method reference to print each name in the list.
        List<String> names = Arrays.asList("Pedro", "Ivonne", "Noemi");
        System.out.println("\nList of Names:");
        names.forEach(System.out::println);

    }

}
