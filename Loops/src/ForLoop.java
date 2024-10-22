public class ForLoop {
    public static void main(String[] args) {
        System.out.println("*** For Loop ***");

        // var i = 1; => this initializes the variable i to 1
        // and runs once at the start of the for loop


        // i <= 10; => this is the condition that checks if i
        // is less than or equal to 10, and determines whether the
        // loop should continue


        // i++ => after the code inside the loop runs, this increments
        // i by 1 before the next iteration

        for(var i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
    }
}
