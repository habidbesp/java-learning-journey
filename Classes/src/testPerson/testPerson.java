package testPerson;

import person.Person;

public class testPerson {
    public static void main(String[] args) {
        System.out.println("*** Creation of Class and Objects - Encapsulation ***");

        var person1 = new Person("Layla", "Acosta");
        person1.showPerson();
        System.out.printf("Show just the attribute " +
                "'name' of the instantiated person1: '%s'\n" , person1.getName());
        System.out.printf("Show just the attribute " +
                "'lastName' of the instantiated person1: '%s'\n" , person1.getLastName());

        // setting a new name and last name to person1
        person1.setName("Rafael");
        person1.setLastName("Barajas");

        System.out.printf("Setter method rewrites the attribute " +
                "'name' of the instantiated person1: '%s'\n" , person1.getName());
        System.out.printf("Setter method rewrites the attribute " +
                "'lastName' of the instantiated person1: '%s'\n" , person1.getLastName());
        System.out.println();

        var person2 = new Person("Inna", "Melquiades");
        person2.setLastName("Burn");
        person2.showPerson();


// NOTE: This code will be refactored to implement encapsulation principles,
// ensuring better data protection and access control.
     /*   System.out.println("*** Creation of Class and Objects - Person ***");
        var obj1 = new Person();
        obj1.name = "Layla";
        obj1.lastName = "Acosta";
        obj1.showPerson();
        System.out.println();
        // second object

        var obj2 = new Person();
        obj2.name = "Ian";
        obj2.lastName = "Gómez";
        obj2.showPerson();*/
    }
}
