import java.util.Random;
import java.util.Scanner;

//In this game, the user has 5 chances to guess a randomly
// generated number between 1 and 50. The user will input their
// guessed number, and the program will provide hints based
// on the user's input. If the guessed number is larger than the
// number to guess, the program will indicate that the guess is
// too high. If the guessed number is smaller than the number to
// guess, the program will indicate that the guess is too low. The
// game continues until the user either guesses the correct number
// or exhausts all their chances.

public class MysteryNumberChallenge {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var random = new Random();

        var mysteryNumber = random.nextInt(50) + 1; // Generate a number between 1 and 50
        var attempts = 0;
        var userGuess = 0;
        final var MAX_ATTEMPTS = 5;

        while ((mysteryNumber != userGuess) && attempts < MAX_ATTEMPTS){
            System.out.print("Find the Mystery number between 1 and 50! :");
            userGuess = console.nextInt();

            if(userGuess < mysteryNumber)
                System.out.printf("%n%d is smaller than Mystery number\n", userGuess);
            else if(userGuess > mysteryNumber)
                System.out.printf("%n%d is greater than Mystery number\n", userGuess);
            attempts++;
        }

        if(userGuess == mysteryNumber){
            System.out.printf("%nCongratulations! %d is the" +
                    " Mystery number, you made it in just %d attempts\n",mysteryNumber , attempts);
        }
        else
            System.out.printf("""
                    %nYou lose! Your %d attempts are over,
                    the Mystery number was: %d
                    """, MAX_ATTEMPTS, mysteryNumber);
    }
}
