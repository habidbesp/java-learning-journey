public class IfStatement {
    public static void main(String[] args) {
        // if statement usage
        var age = 12;
        if( age>=18 ){
            System.out.println("You are of legal age.");
        } // with else if
        else if(age >=13 && age < 18){
            System.out.println("You are a Teenager");
        }else{
            System.out.println("You are boy");
        }
    }
}
