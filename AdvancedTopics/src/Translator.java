/*
* Interfaces in Java are contracts that define a set of
* methods that a class must implement. All methods in an interface are
* public and abstract by default, meaning they have no implementation and
* must be provided by the classes that implement the interface. Starting
* from Java 8, interfaces can include default and static methods with
* implementations. Interfaces allow for multiple inheritance and promote
* interoperability between different classes.
*/
public interface Translator {
    // interfaces are public and abstracts
    void translate();

    // default methods with implementation
    default void startTranslator(){
        System.out.println("Initializing translator...");
    }
}

class English implements Translator {
    @Override
    public void translate(){
        System.out.println("I translate to English.");
    }
}

class French implements Translator {
    @Override
    public void translate() {
        System.out.println("I translate to French");
    }

    @Override
    public void startTranslator() {
        System.out.println("Initializing translator to French...");
    }
}

class TranslatorTest{
    public static void main(String[] args) {
        Translator english = new English();
        english.startTranslator();
        english.translate();

        // French Translator
        Translator french = new French();
        french.startTranslator();
        french.translate();
    }
}