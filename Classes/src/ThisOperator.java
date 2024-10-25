public class ThisOperator {
    int operand1;
    int operand2;

    public  ThisOperator(){
    }

    public ThisOperator(int operand1, int operand2){
        System.out.println("Constructor executing");
        this.operand1 = operand1;
        this.operand2 = operand2;
        System.out.println("this operator: " + this);
    }

    void sum(){
        var result = this.operand1 + this.operand2;
        System.out.println("Result Sum: " + result);
    }

    void subtract(){
        var result = this.operand1 - this.operand2;
        System.out.println("Result Subtraction: " + result);
    }

    public static void main(String[] args) {
        System.out.println("*** this Operator Example ***");
        var thisOperator1 = new ThisOperator(5, 7);
        thisOperator1.sum();
        thisOperator1.subtract();
        System.out.println("Memory Direction obj1: " + thisOperator1);

        // create a second object
        System.out.println();
        var thisOperator2 = new ThisOperator(12, 13);
        thisOperator2.sum();
        System.out.println("Memory Direction obj2: " + thisOperator2);

    }
}
