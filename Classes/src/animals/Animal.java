/*
Inheritance is a fundamental concept in object-oriented
programming that allows a subclass to inherit properties and methods from a
superclass. This promotes code reuse and establishes a hierarchy among classes.
Subclasses can override methods from the superclass to implement specific behaviors,
enabling customization while maintaining shared functionality. Inheritance helps represent
"is-a" relationships, making it easier to organize and manage code.
*/

package animals;

// superclass "Animal"
public class Animal {


    protected void makeSound(){
        System.out.println("Animal makes sound");
    }

/*
    The access modifier "protected" means that only
    subclasses can access these methods.
    If for some reason the access modifier is "private,"
    it means that no other subclass will have access to that method.
    private void eat() {
        System.out.println("I eat many times during the day.");
    }
    protected void eat() {
        System.out.println("I eat many times during the day.");
    }

    protected void sleep() {
        System.out.println("I sleep for a long time during the day.");
    }
*/
}

// subclass "Dog"
class Dog extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("woof!");
    }

   /* @Override
    Method overriding: customize the inherited method.
    protected void sleep() {
        System.out.println("I sleep 15 hours a day.");
        System.out.println("Superclass method: ");
        super.sleep();
    }*/
}

class Cat extends Animal {
    @Override
    protected void makeSound(){
        System.out.println("Meow");
    }
}

class TestAnimal{

    // This method accepts an Animal reference and calls the makeSound() method.
    // It prints the sound that the specific animal (subclass) makes, demonstrating polymorphism.
    static void printSound(Animal animal){
        animal.makeSound();
    }
    public static void main(String[] args) {
        // object superclass Animal
        var animal = new Animal();
        printSound(animal);

        // object subclass Dog
        var dog = new Dog();
        printSound(dog);

        // object subclass Cat
        var cat = new Cat();
        printSound(cat);


       /* System.out.println("*** Inheritance Example ***");
        System.out.println("Superclass, 'I am an Animal'");
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        System.out.println("\nSubclass, I'm a Dog");
        var dog1 = new Dog();
        dog1.sleep();
        dog1.eat();
        dog1.makeSound();
        */

    }
}