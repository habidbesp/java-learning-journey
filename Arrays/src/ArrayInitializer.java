public class ArrayInitializer {
    public static void main(String[] args) {
        // array shorthand syntax
        // int[] integers =  {100, 200, 300, 400, 500};
        var integers = new int[]{100, 200, 300, 400, 500};

        System.out.println("value 1 = " + integers[0]);
        System.out.println("value 2 = " + integers[1]);
        System.out.println("value 3 = " + integers[2]);
        System.out.println("value 4 = " + integers[3]);
        System.out.println("value 5 = " + integers[4]);

        // print the array itself
        System.out.println(integers);
    }
}
