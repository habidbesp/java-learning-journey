package snack_machine_files.service;

import snack_machine_files.domain.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServiceSnacksList implements IServiceSnacks{
    private static final List<Snack> snacks;

    // Static block initializer
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chips", 2.50));
        snacks.add(new Snack("Soda", 1.50));
        snacks.add(new Snack("Sandwich", 3.65));
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public void showSnacks(){
        var inventorySnacks = "";
        for(var snack: snacks){
            inventorySnacks += snack.toString() + "\n";
        }
        System.out.println("--- Inventory of Snacks---");
        System.out.println(inventorySnacks);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }
}
