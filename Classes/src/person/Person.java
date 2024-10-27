package person;

public class Person {
    private String name;
    private String lastName;

    public Person(){
    }

    public  Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void showPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("LastName: " + this.lastName);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
