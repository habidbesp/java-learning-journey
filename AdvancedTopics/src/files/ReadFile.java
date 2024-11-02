package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        // Read the file
        var fileName = "my_file.txt";
        var file = new File(fileName);
        try {
            System.out.println("File content: ");
            // Open file for reading
            var input = new BufferedReader(new FileReader(file));
            // Reading line by line the file
            var line = input.readLine();
            while (line != null){
                System.out.println(line);
                // before finishing iterating, iteration moves to the next line
                line = input.readLine();
            }
            // Close file
            input.close();
        } catch (Exception e) {
            System.out.println("Error at reading the file: " + e);
        }
    }
}
