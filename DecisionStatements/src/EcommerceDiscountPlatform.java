import java.util.Scanner;

public class EcommerceDiscountPlatform {
    public static void main(String[] args) {
        System.out.println("*** E-commerce Discount Platform ***");

        //Constants and Input:
        //
        //MINIMUM_PURCHASE_AMOUNT: A constant set to 1000,
        // representing the minimum purchase amount required
        // for certain discounts.

        final var MINIMUM_PURCHASE_AMOUNT = 1000;

        //The code uses a Scanner to read user input
        // from the console for the purchase amount and
        // membership status.
        var console = new Scanner(System.in);

        // The user is prompted to enter the amount of their purchase,
        // which is parsed as a Double.
        System.out.print("What was the amount of your purchase? ");
        var purchaseAmount = Double.parseDouble(console.nextLine());

        //The user is also asked if they have a membership in the
        // store, which is parsed as a Boolean.
        System.out.print("Do you have a membership in this store (true/false)? ");
        var hasMembership = Boolean.parseBoolean(console.nextLine());


        //Discount Calculation:
        //The code checks if the purchaseAmount meets the
        // MINIMUM_PURCHASE_AMOUNT and if the
        // user has a membership:
        //If both conditions are true, a 10% discount is applied.
        //If the user has a membership but the purchase amount is below the minimum, a 5% discount is applied.
        //If the user does not have a membership, they receive no discount.
        double discountAmount;
        double amountAfterDiscount;

        if(purchaseAmount >= MINIMUM_PURCHASE_AMOUNT && hasMembership){
            discountAmount = 0.1 * purchaseAmount;
            amountAfterDiscount = purchaseAmount - discountAmount;
            System.out.printf("""
                    %nCongratulations, you have received a discount of 10%%!:\s
                    \tPurchase Amount: €%.2f
                    \tDiscount Amount: €%.2f
                    \tAmount After Discount: €%.2f%n
                    """, purchaseAmount, discountAmount, amountAfterDiscount);
        }
        else if(hasMembership){
            discountAmount = 0.05 * purchaseAmount;
            amountAfterDiscount = purchaseAmount - discountAmount;
            System.out.printf("""
                    %nCongratulations, you have received a discount of 5%%!:\s
                    \tPurchase Amount: €%.2f
                    \tDiscount Amount: €%.2f
                    \tAmount After Discount: €%.2f%n
                    """, purchaseAmount,discountAmount, amountAfterDiscount);
        }
        else{
            //If there is no discount, it informs the user and encourages
            // them to become a member while displaying the purchase amount.
            System.out.printf("""
                    %nYou did not receive any type of discount;\s
                    We invite you to become a member of our store.\s
                    \tPurchase Amount: €%.2f%n
                    """, purchaseAmount);
        }
    }
}
