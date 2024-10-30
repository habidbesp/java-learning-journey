package sales;

public class SalesTest {
    public static void main(String[] args) {
        System.out.println("*** Sales System ***");
        var blouse = new Product("Blouse", 30.67);

        var shoes = new Product("Shoes", 47.79);

        // Objects ShoppingCart
        var order1 = new ShoppingCart();
        order1.addProduct(blouse);
        order1.addProduct(shoes);

        var order2 = new ShoppingCart();
        order2.addProduct(new Product("T-Shirt", 15.34));
        order2.addProduct(shoes);
        order2.addProduct(blouse);

        System.out.println(order1);
        System.out.println(order2);
    }
}
