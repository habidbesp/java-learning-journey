package snacks_machine;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    // Static block initializer
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chips", 2.50));
        snacks.add(new Snack("Soda", 1.50));
        snacks.add(new Snack("Sandwich", 3.65));
    }

    public static void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void showSnacks(){
        var inventorySnacks = "";
        for(var snack: snacks){
            inventorySnacks += snack.toString() + "\n";
        }
        System.out.println("--- Inventory of Snacks---");
        System.out.println(inventorySnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
