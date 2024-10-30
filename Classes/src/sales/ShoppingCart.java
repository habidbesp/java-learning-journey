package sales;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingCart {
    private final int idCart;
    private Product[] products;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;
    private static int cartCounter;

    public ShoppingCart(){
        this.idCart = ++ShoppingCart.cartCounter;
        this.products = new Product[ShoppingCart.MAX_PRODUCTS];
    }

    public void addProduct(Product product){
        if(this.productCounter < ShoppingCart.MAX_PRODUCTS)
            this.products[this.productCounter++] = product;
        else
            System.out.println("The maximum number of products has been exceeded."
                    + ShoppingCart.MAX_PRODUCTS);
    }

    public double calculateTotal(){
        double total = 0;
        for(var i = 0; i < this.productCounter; i++){
            var product = this.products[i];
            total += product.getPrice();
        }
        return  total;
    }

//    public void showShoppingCart(){
//        System.out.println("Order Id: " + this.idCart);
//        var cartTotal = this.calculateTotal();
//        System.out.printf("\tOrder Total: € %.2f\n", cartTotal);
//        System.out.println("\t Products Order: ");
//        for(var i = 0; i < this.productCounter; i++)
//            System.out.println("\t\t" + this.products[i]);
//    }

    @Override
    public String toString(){
        var result = "Order Id: " + this.idCart + "\n";
        var cartTotal = this.calculateTotal();

        BigDecimal bd = new BigDecimal(cartTotal);
        bd = bd.setScale(2, RoundingMode.HALF_UP); // round to 2 decimals

        result += "\tOrder Total: € " +  bd + "\n";
        result += "\t Products Order: \n";
        for(var i = 0; i < this.productCounter; i++)
            result += "\t\t" + this.products[i] + "\n";
        return result;
    }


}
