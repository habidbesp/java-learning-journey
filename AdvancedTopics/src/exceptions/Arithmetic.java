package exceptions;

public class Arithmetic {
    public static int division(int numerator, int denominator) throws Exception{
        if(denominator == 0)
             throw new Exception("Division by 0");
        return numerator / denominator;
    }
}
