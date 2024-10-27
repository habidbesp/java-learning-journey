package arithmetic;

// Packages in Java
//
//A package is a collection of related classes, interfaces,
// and sub-packages grouped together. It helps in organizing classes
// into namespaces, reducing naming conflicts, and enhancing code
// maintainability. By grouping related classes, packages make code easier
// to manage and reuse, as well as providing access control.

public class Arithmetic {
    // **Encapsulation**  is a fundamental principle of object-oriented
    // programming (OOP) that involves hiding an object's internal details
    // and protecting its data, allowing access only through specific public methods.
    // Access Modifiers: Class attributes are declared as private to
    // restrict direct access from outside the class.
    private int operand1;
    private int operand2;


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


    // **Encapsulation**
    // Accessor Methods (getters and setters): Public methods called
    // getters (to read) and setters (to modify) are created to control
    // and validate access to private data.
    public int getOperand1(){
        return  this.operand1;
    }

    public void setOperand1(int operand1){
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return this.operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}
// Advantages of Encapsulation
//Access Control: Allows data to be modified only through controlled methods.
//Data Protection: Attributes are protected and can only be manipulated in specific ways.
//Maintainability: If the way data is handled needs to change, only the methods are updated,
// not the code accessing the data from other places.
//In Java, encapsulation helps maintain modular and secure code, promoting data integrity
// and clarity in interactions with objects.
