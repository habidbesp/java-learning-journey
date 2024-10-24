import java.util.Scanner;

public class FunctionIsEven {

    // function returns a boolean if the provided number is even or false
    static  boolean isEven(int number){
         return (number % 2 == 0);
    }

    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("Provide an Integer Value: ");
        var promptedInteger = Integer.parseInt(console.nextLine());

        var message = isEven(promptedInteger) ? "is Even" : "is Odd";

        System.out.printf("%d %s\n",promptedInteger, message);
    }
}
