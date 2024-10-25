public class Person {
    String name;
    String lastName;

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("LastName: " + lastName);
    }

    public static void main(String[] args) {
        System.out.println("*** Creation of Class and Objects - Person ***");
        var obj1 = new Person();
        obj1.name = "Layla";
        obj1.lastName = "Acosta";
        obj1.showPerson();
        System.out.println();
        // second object
        var obj2 = new Person();
        obj2.name = "Ian";
        obj2.lastName = "Gómez";
        obj2.showPerson();
    }
}
