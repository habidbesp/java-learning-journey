package person;

public class Person {
    private static int personCounter = 0;
    private int id;
    private String name;
    private String lastName;

//    constructor
    public  Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;

        // increment personCounter (static attribute)
        // Person.personCounter++;

        // Use pre-increment to increase personCounter by one before assigning it to this.id
        this.id = ++Person.personCounter;

    }

    // method overriding -
    @Override
    public String toString(){
        return "Id: " + this.id +
                ", Name: " + this.name +
                ", Lastname: " + this.lastName +
                ", Dir. mem." + super.toString();
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

    /**
     * Returns the current count of Person instances created.
     *
     * @return the value of personCounter
     */
    public static int getPersonCounter() {
        return Person.personCounter;
    }

    public int getId() {
        return this.id;
    }
}
