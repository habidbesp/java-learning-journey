public class IfStatement {
    public static void main(String[] args) {
        // This Java code uses an if-else statement to
        // categorize a person's age into different groups:
        var age = 12;

        if( age>=18 ){
            //It first checks if the age is 18 or older. If true,
            // it prints "You are of legal age."
            System.out.println("You are of legal age.");
        }
        else if(age >=13 && age < 18){
            //If not, it checks if the age is between 13 and 17
            // (inclusive of 13 but less than 18). If true, it prints
            // "You are a Teenager."
            System.out.println("You are a Teenager");
        }else{
            //If neither condition is true, it prints "You are boy,"
            // implying the person is under 13 years old.
            System.out.println("You are boy");
        }
    }
}
