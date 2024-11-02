package files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        var fileName = "my_file.txt";
        try {
            // Read all lines in the file
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("File content: ");
//            for(String line: lines){
//                System.out.println(line);
//            }

            // Lamda function
            lines.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error at reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
