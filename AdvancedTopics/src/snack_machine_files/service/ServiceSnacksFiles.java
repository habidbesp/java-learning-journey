package snack_machine_files.service;

import snack_machine_files.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceSnacksFiles implements IServiceSnacks {
    private final String NAME_FILE = "snacks.txt";

    // Create snacks list
    private List<Snack> snacks = new ArrayList<>();

    // Constructor
    public ServiceSnacksFiles(){
        // Create the file if not exist
        var file = new File(NAME_FILE);
        var fileExist = false;
        try {
            fileExist = file.exists();
            if(fileExist){
                 this.snacks = getFileSnacks();
            }else {
                var output = new PrintWriter(new FileWriter(file));
                output.close(); // Saving the file on the hard drive
                System.out.println("File created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error while creating file: " + e.getMessage());
        }
        // if the file does not exist, load some initial values.
        if(!fileExist)
            loadInitialSnacks();
    }

    private void loadInitialSnacks(){
        this.addSnack(new Snack("Chips", 1.55));
        this.addSnack(new Snack("Soda", 1.75));
        this.addSnack(new Snack("Sandwich", 3.65));
    }

    private List<Snack> getFileSnacks(){
        var snacks = new ArrayList<Snack>();
        try{
            List<String> lines = Files.readAllLines(Paths.get(NAME_FILE));
            for(String line: lines){
                String[] lineSnack = line.split(",");
                // var idSnack = lineSnack[0];
                var name = lineSnack[1];
                var price = Double.parseDouble(lineSnack[2]);
                var snack = new Snack(name, price);
                snacks.add(snack); // Add the read snack to the list
            }
        } catch (Exception e) {
            System.out.println("Error while reading file 'snacks': " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void addSnack(Snack snack) {
        // Add a new snack:
        // 1. Save it in the in-memory list
        this.snacks.add(snack);
        // 2. Save the new snack to a file
        this.addSnackFile(snack);
    }

    private void addSnackFile(Snack snack){
        boolean attach = false;
        var file = new File(NAME_FILE);
        try{
            attach = file.exists();
            var output = new PrintWriter(new FileWriter(file, attach));
            output.println(snack.writeSnack());
            output.close();
        } catch (Exception e) {
            System.out.println("Error while adding snack: " + e.getMessage());
        }
    }

    @Override
    public void showSnacks() {
        System.out.println("--- Snack Inventory ---");
        // Show list of snacks in the file
        var inventorySnacks = "";
        for(var snack: this.snacks){
            inventorySnacks += snack.toString() + "\n";
        }
        System.out.println(inventorySnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
