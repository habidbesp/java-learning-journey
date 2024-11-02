package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AddContentToFile {
    public static void main(String[] args) {
        boolean attach = false;
        var fileName = "my_file.txt";
        var file = new File(fileName);
        try{
            // check if the file exists
            attach = file.exists();
            var output = new PrintWriter(new FileWriter(file, attach));
            var newContent = "New\ncontent";
            output.println(newContent);
            output.close();
            System.out.println("New content was added to the file...");
        } catch (Exception e) {
            System.out.println("Error at writing the file: " + e.getMessage());
        }
    }
}
