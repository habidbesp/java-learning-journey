import java.util.Scanner;

public class VIPDiscountSystem {
    public static void main(String[] args) {
        System.out.println("*** VIP Discount System ***");

        final var PRODUCTS_DISCOUNT_NUM = 10;
        var console = new Scanner(System.in);

        System.out.print("How many products did you purchase today? ");
        var productQuantity = Integer.parseInt(console.nextLine());

        System.out.print("Do you have a membership of our store (true/false)? ");
        var hasMembership = Boolean.parseBoolean(console.nextLine());

        var isEligibleForDiscount =
                productQuantity >= PRODUCTS_DISCOUNT_NUM && hasMembership;

        System.out.println("Are you eligible for the VIP discount? " + isEligibleForDiscount);
    }
}
