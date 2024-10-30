package person.test;

import person.Person;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("*** Object class methods - toString() - ***");
        System.out.println("static variable :" +  Person.getPersonCounter());

        var person1 = new Person("Layla", "Acosta");
        System.out.println(person1);  // automatically the method toString() will be called

        System.out.println("static variable :" +  Person.getPersonCounter());
        var person2 = new Person("Ian", "Pérez");
        System.out.println(person2);
        System.out.println("static variable :" +  Person.getPersonCounter());


    }
}
