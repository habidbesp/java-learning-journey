public class FunctionsIntroduction {

    static void greet(String message){
        System.out.println("Message: "+ message);
    }

    // the "public" is known as "access modifier".
    public static void main(String[] args) {
        greet("Hello from Java");
        greet("Good bye");
    }
}

//Access Modifiers
//public: Access modifier that allows visibility from any other class.
//private: Access modifier that restricts visibility to the same class only.
//protected: Access modifier that allows visibility to the same package and subclasses.
//default (no modifier): Access modifier that restricts visibility to the same package only.
