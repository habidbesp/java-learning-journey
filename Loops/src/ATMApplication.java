import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        System.out.println("*** ATM System Application ***");

        var balance = 1000.00;
        var console = new Scanner(System.in);
        var logOut = false;

        while (!logOut){
            System.out.print("""
                *** ATM System Application ***
                Choose which operation you want to perform:
                1. Check Balance
                2. Withdraw
                3. Deposit
                4. Exit
                choose an option:\s""");

            var option = console.nextInt();

            switch (option){
                case 1 -> System.out.printf("Your current balance is: € %.2f%n%n",  balance);
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    var withdraw = console.nextDouble();
                    if(withdraw > balance)
                        System.out.printf("Insufficient funds, current balance: € %.2f%n%n", balance);
                    else {
                        balance -= withdraw;
                        System.out.printf("""
                                You withdrew: € %.2f
                                Current balance: € %.2f%n%n
                                """,
                                withdraw, balance);
                    }
                }
                case 3 -> {
                    System.out.print("Enter the amount to deposit: ");
                    var deposit = console.nextDouble();
                    var previousBalance = balance;
                    if(deposit > 0)
                        balance += deposit;
                    System.out.printf("""
                                    Previous balance: € %.2f
                                    You deposited: € %.2f
                                    Current balance is: € %.2f%n%n
                                    """, previousBalance, deposit, balance);
                }
                case 4 -> {
                    System.out.println("Logging out of the ATM, see you soon\n");
                    logOut = true;
                }
                default -> System.out.println("Invalid option...\n");
            }
        }
    }
}
