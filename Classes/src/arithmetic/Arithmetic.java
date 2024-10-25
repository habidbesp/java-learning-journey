package arithmetic;

// Packages in Java
//
//A package is a collection of related classes, interfaces,
// and sub-packages grouped together. It helps in organizing classes
// into namespaces, reducing naming conflicts, and enhancing code
// maintainability. By grouping related classes, packages make code easier
// to manage and reuse, as well as providing access control.

public class Arithmetic {
    int operand1;
    int operand2;


    public  Arithmetic(){
    }

    public Arithmetic(int operand1, int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void sum(){
        var result = this.operand1 + this.operand2;
        System.out.println("Result Sum: " + result);
    }

    public void subtract(){
        var result = this.operand1 - this.operand2;
        System.out.println("Result Subtraction: " + result);
    }
}
