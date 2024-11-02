package files;

import java.io.File; // io => input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileGenerator {
    public static void main(String[] args) {
        var fileName = "my_file.txt";
        var file = new File(fileName);
        try {
            if(file.exists()){
                System.out.println("The file already exits");
            }
            else{
                // Create the file
                var output = new PrintWriter(new FileWriter(file));
                // The file was saved on the hard drive
                output.close();
                System.out.println("The file was created");
            }
        } catch (IOException e) {
            System.out.println("Error at creating file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
