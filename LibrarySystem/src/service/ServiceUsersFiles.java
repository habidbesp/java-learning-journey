package service;

import domain.Book;
import domain.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceUsersFiles implements IServiceUsers {
    private final String USERS_FILE = "users.txt";

    private List<User> users = new ArrayList<>();

    // Constructor
    public ServiceUsersFiles(){
        var file = new File(USERS_FILE);
        var fileExist = false;

        try{
            fileExist = file.exists();
            if (fileExist)
                this.users = getFileUsers();
            else{
                var output = new PrintWriter(new FileWriter(file));
                output.close(); // Saving the file on the hard drive
                System.out.println("File created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error: while creating file: " + e.getMessage());
        }
    }


    private List<User> getFileUsers(){
        var users = new ArrayList<User>();
        try{
            List<String> lines = Files.readAllLines(Paths.get(USERS_FILE));
            for(String line: lines){
                String[] lineUser = line.split(",");
                // var idUser = lineUser[0];
                var firstname = lineUser[1];
                var lastname = lineUser[2];
                //var loans = lineUser[3];

                var user = new User();
                users.add(user); // Add the read user to the list
            }
        } catch (Exception e) {
            System.out.println("Error while reading file 'snacks': " + e.getMessage());
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

        this.addUserFile(user);
    }

    private void addUserFile(User user){
        boolean attach = false;
        var file = new File(USERS_FILE);
        try{
            attach = file.exists();
            var output = new PrintWriter(new FileWriter(file, attach));
            output.println(user.writeUser());
            output.close();
        } catch (Exception e) {
            System.out.println("Error while adding snack: " + e.getMessage());
        }
    }
}
