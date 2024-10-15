import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("*** Random Numbers ***");
        var random = new Random();

         // Generate a random number (integer) between 0 and 9
        var randomNumber = random.nextInt(10);
        System.out.println("randomNumber between 0 and 9 = " + randomNumber);

        // Generate a random number between 1 and 10
        randomNumber = random.nextInt(10) + 1;
        System.out.println("randomNumber between 1 and 10 = " + randomNumber);

        // Generate a random number (float) between 0.0 and 1.0
        var randomFloat = random.nextFloat();
        System.out.println("randomFloat between 0.0 and 1.0 = " + randomFloat);

        // Simulate a dice roll (1 and 6)
        var dice = random.nextInt(6) +1;
        System.out.println("Dice roll result = " + dice);




    }
}
