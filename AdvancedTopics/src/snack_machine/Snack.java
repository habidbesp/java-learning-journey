package snack_machine;

import java.io.Serializable;
import java.util.Objects;

// Class Snack fulfills the requirements of a JavaBean
public class Snack implements Serializable {
    private static int snacksCounter = 0;
    private int idSnack;
    private String name;
    private  double price;

    public Snack() {
        this.idSnack = ++Snack.snacksCounter;
    }

    public Snack(String name, double price){
        // Calls the empty constructor (no-argument constructor) using 'this()'.
        // This increments the static attribute 'snacksCounter' by one,
        // and assigns this new value to the 'idSnack' attribute.
        this(); // Must be the first line of code in the constructor to call the no-argument constructor.
        this.name = name;
        this.price = price;
    }

    public static int getSnacksCounter() {
        return snacksCounter;
    }

    public int getIdSnack() {
        return this.idSnack;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(price, snack.price) == 0 && Objects.equals(name, snack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, name, price);
    }
}
