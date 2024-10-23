public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("*** break and continue ***");

        // break - print first even number
        for(var number = 1; number < 10; number++){
            if(number % 2 == 0){
                System.out.print(number + " ");
                break; // break stops the loop iterations
            }
        }

        // continue - print even numbers, ignoring odds
        System.out.println("\nPalabra continue: ");
        for (var number = 1; number < 10; number++){
            if(number % 2 == 1 ){ // odd number
                continue; // continuing to the next iteration
            }
            System.out.print(number + " ");
        }
    }
}
