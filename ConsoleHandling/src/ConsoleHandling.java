import java.util.Scanner;

public class ConsoleHandling {
    public static void main(String[] args) {
        var console = new Scanner(System.in); // in - input - data input
        System.out.print("Write your name: ");
        var name = console.nextLine();
        System.out.println("name = " + name);
    }
}
