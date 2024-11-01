import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "Diego");
        person.put("lastname", "Flores");

        person.put("age", "38");
        person.put("age", "38"); // duplicates are not allowed
        System.out.println("Values in the Map person: ");
        person.entrySet().forEach(System.out::println);

        person.put("age", "35"); // modifying existing value
        person.remove("lastname"); // removes the key "lastname"
        System.out.println("\nNew values in the Map: ");
        person.entrySet().forEach(System.out::println);

        // Iterate over the map elements separately
        System.out.println("\nIterating the elements (key, value)");
        person.forEach((key, value) ->
                System.out.println("Key: " + key +", Value: " + value));

    }
}
