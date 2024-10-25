package test;

//A package is a collection of related classes, interfaces,
// and sub-packages grouped together. It helps in organizing classes
// into namespaces, reducing naming conflicts, and enhancing code
// maintainability. By grouping related classes, packages make code easier
// to manage and reuse, as well as providing access control.

import arithmetic.Arithmetic;

public class TestArithmetic {
    public static void main(String[] args) {
        System.out.println("*** Arithmetic Example ***");
        var arithmetic1 = new Arithmetic(5, 7);
        arithmetic1.sum();
        arithmetic1.subtract();

        // create a second object
        System.out.println();
        var arithmetic2 = new Arithmetic(12, 13);
        arithmetic2.sum();
    }
}
