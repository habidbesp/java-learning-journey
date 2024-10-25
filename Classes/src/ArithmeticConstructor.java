public class ArithmeticConstructor {

    // Declaration of operands
    int operand1;
    int operand2;

    // constructor overloading
    // This term refers to the practice of defining multiple
    // constructors within the same class, each with a different parameter
    // list. This allows instances of the class to be created in different ways,
    // depending on the arguments provided at the time of instantiation.
    public  ArithmeticConstructor(){
    }


    // The constructor name should match the class name.
    // Constructors do not return any data type.
    // Only the access modifier is required, in this case, public.
    public ArithmeticConstructor(int op1, int op2){
        System.out.println("Constructor executing");
        operand1 = op1;
        operand2 = op2;
    }

    void sum(){
        var result = operand1 + operand2;
        System.out.println("Result Sum: " + result);
    }

    void subtract(){
        var result = operand1 - operand2;
        System.out.println("Result Subtraction: " + result);
    }

    public static void main(String[] args) {
        System.out.println("*** Arithmetic Constructor Example ***");
        System.out.println();
        // When using a constructor, there's no need to assign values
        // to the class variables after instantiation, as they are
        // already initialized through the constructor parameters.
        var arithmetic1 = new ArithmeticConstructor(12, 16);
        // arithmetic2.operand1 = 12; // These assignments are unnecessary
        // arithmetic2.operand2 = 16; // since the constructor initializes them.
        arithmetic1.sum();
        arithmetic1.subtract();
        System.out.println();

        // Thanks to the concept of "Constructor Overloading," it is
        // possible to instantiate the object without passing initial
        // values, and then reassign the variables with new values.
        var arithmetic2 = new ArithmeticConstructor();
        arithmetic2.operand1 = 20;
        arithmetic2.operand2 = 15;
        arithmetic2.sum();
        arithmetic2.subtract();
    }
}
