/*
* JavaBeans is a reusable software component model for the Java
* programming language. It follows specific conventions to create
* objects that can be manipulated in various environments, such
* as IDEs (Integrated Development Environments) and frameworks.
*/

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Barbara");
        person.setLastname("Hubert");
        System.out.println("person = " + person);
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getLastname() = " + person.getLastname());
    }
}

class Person implements Serializable {
    private String name;
    private String lastname;

    public Person(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

