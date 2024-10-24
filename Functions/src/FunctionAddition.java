public class FunctionAddition {

    // define addition function
    static int sum(int a, int b){
        var result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int arg1 =3, arg2 =8;
        var function_result = sum(arg1, arg2);
        System.out.println(function_result);
    }
}
