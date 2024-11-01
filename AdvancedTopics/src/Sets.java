import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // TreeSet has a time complexity of O(log n) for insertions, deletions, and searches.
        Set<String> set = new TreeSet<>();
        // No duplicates - The Set interface does not allow storing duplicates.
        // "Charles" will be stored only once in the set
        set.add("Charles");
        set.add("Charles");
        set.add("Karla");
        set.add("Victoria");

        System.out.println("Elements of the set: ");
        set.forEach(System.out::println);

        // Remove element
        set.remove("Karla");
        System.out.println("\nNew elements in the set: ");
        set.forEach(System.out::println);
    }
}
