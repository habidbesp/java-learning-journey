import java.util.Scanner;

public class MirrorHouse {
    public static void main(String[] args) {
        System.out.println("*** Welcome to the Mirror House ***");

        var console = new Scanner(System.in);

        //The user is prompted to input their age, which
        // is read from the console and parsed as an Integer.
        System.out.print("How old are you? ");
        var age = Integer.parseInt(console.nextLine());

        //The user is also asked if they are afraid of
        // the dark. Their response is captured as a Boolean value.
        System.out.println("Are you afraid of the dark? ");
        var isAfraidOfTheDark = Boolean.parseBoolean(console.nextLine());

        // Conditional Logic:
        //The code checks two conditions using an if statement:
        //The user must not be afraid of the dark (!isAfraidOfTheDark).
        //The user’s age must be 10 or older (age >= 10).
        //If both conditions are met, it prints
        // "You can enter the house of mirrors."
        // indicating that the user is allowed to enter.
        if(!isAfraidOfTheDark && age >= 10){
            System.out.println("You can enter the house of mirrors.");
        }
        else{
            // If either condition is not satisfied, the
            // code executes the else block, printing "I'm sorry,
            // the house of mirrors is not for you."
            // This informs the user that they cannot enter.
            System.out.println("I'm sorry, the house of mirrors is not for you.");
        }
    }
}
