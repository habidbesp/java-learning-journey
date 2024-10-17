import java.util.Scanner;

public class SalesTicketGenerator {
    public static void main(String[] args) {
        System.out.println("*** Sales Ticket Generator ***");

        //This code implements a simple sales ticket generator
        // that calculates the total amount for a purchase based
        // on the prices of various items and applies a discount if
        // specified. The program prompts the user to enter the
        // prices of milk, bread, lettuce, and bananas. It then
        // asks if the user would like to apply a discount,
        // expressed as a percentage.

        var console = new Scanner(System.in);

        System.out.print("Milk price: ");
        var milkPrice = Double.parseDouble(console.nextLine());

        System.out.print("Bread price: ");
        var breadPrice = Double.parseDouble(console.nextLine());

        System.out.print("Lettuce price: ");
        var lettucePrice = Double.parseDouble(console.nextLine());

        System.out.print("Banana price: ");
        var bananaPrice = Double.parseDouble(console.nextLine());

        System.out.print("Would you like to apply a discount (%)? ");
        var discountPercentage = Integer.parseInt(console.nextLine());

        //The system calculates the subtotal (without tax) by summing
        // the prices of the items. If a discount is applied, it
        // calculates the discount amount and subtracts it from the
        // subtotal. The tax is then calculated at a rate of 19% of
        // the original subtotal. Finally, the program computes the
        // total purchase amount by adding the discounted subtotal and
        // the tax.

        // Calculate subtotal (without tax)
        var subtotal = milkPrice + breadPrice + lettucePrice + bananaPrice;

        // Calculate subtotal's discount
        var discount = subtotal * (discountPercentage / 100.0);

        // subtract subtotal's discount
        var subtotalWithDiscount = subtotal - discount;

        // Calculate tax (19%)
        var tax = subtotal * 0.19 ;

        // Calculate total purchase amount (with tax).
        var totalPurchaseAmount = subtotalWithDiscount + tax;

        //The sales ticket is printed, detailing the subtotal, discount
        // amount, tax, and the total amount due. This code
        // demonstrates basic arithmetic operations and formatted
        // output in Java, providing a clear breakdown of the
        // transaction for the user.

        // Print sales ticket
        System.out.printf("""
                %nSales Ticket
                ------------------
                Subtotal: € %.2f
                Discount: € %.2f (%d%%)
                Tax (19%%): € %.2f
                Total Amount: € %.2f
                """, subtotal, discount, discountPercentage,tax, totalPurchaseAmount);
    }
}
