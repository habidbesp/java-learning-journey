import java.util.Scanner;

public class RecipeCreator {
    public static void main(String[] args) {
        System.out.println("*** Recipe Creator ***");
        var console = new Scanner(System.in);

        System.out.print("Enter Recipe Name: ");
        var recipeName = console.nextLine();

        System.out.print("Enter Ingredients (separate them by a coma \",\"): ");
        var ingredients = console.nextLine();

        System.out.print("Enter Preparation Time (in minutes): ");
        var preparationTime = Integer.parseInt(console.nextLine());

        System.out.print("Enter Difficulty Level (Easy, Medium, Hard): ");
        var difficulty = console.nextLine();

        // Print Recipe Data
        System.out.println("\nRecipe Data: ");
        System.out.println("\tRecipe Name: " + recipeName);
        System.out.println("\tIngredients: " + ingredients);
        System.out.println("\tPreparation Time: " + preparationTime + " minutes");
        System.out.println("\tDifficulty: " + difficulty);
    }
}
