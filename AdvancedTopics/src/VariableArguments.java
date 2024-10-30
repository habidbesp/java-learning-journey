public class VariableArguments {
    public static void main(String[] args) {

        // printNumbers(1, 2, 3, 4, 5, 6, 7, 8); // vararg
        differentParams("Karla", 10, 20, 30);
    }

    static void differentParams(String name, int... numbers) {
        System.out.println("Name: " + name);
        printNumbers(numbers);
    }

    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
