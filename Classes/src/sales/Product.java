package sales;

public class Product {
    private final int ID_PRODUCT;
    private String name;
    private double price;
    private static int productsCounter;


    public Product(String name, double price ){
        this.ID_PRODUCT = ++Product.productsCounter;
        this.name = name;
        this.price = price;
    }

    public int getID_PRODUCT() {
        return this.ID_PRODUCT;
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
        return "Product{" +
                "ID_PRODUCT=" + this.ID_PRODUCT +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}
