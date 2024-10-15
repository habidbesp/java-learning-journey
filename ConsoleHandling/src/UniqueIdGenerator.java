import java.util.Random;
import java.util.Scanner;

public class UniqueIdGenerator {
    public static void main(String[] args) {
        System.out.println("*** Unique ID System Generator ***");

        // This code initializes a Scanner object to
        // capture user input from the console and a Random
        // object to generate random numbers.
        var console = new Scanner(System.in);
        var random = new Random();

        // This code prompts the user to enter their first name,
        // captures the input from the console, and stores it in
        // the variable firstName.
        System.out.print("Enter your first name: ");
        var firstName = console.nextLine();

        // This code formats the firstName by removing any leading or
        // trailing spaces, converting it to uppercase, and extracting the
        // first two characters, storing the result in nameId.
        var nameId = firstName.strip().toUpperCase().substring(0, 2);

        // This code captures the user's last name and formats
        // it similarly to the first name, storing the result
        // in lastNameId.
        System.out.print("Enter yor last name: ");
        var lastName = console.nextLine();
        var lastNameId = lastName.strip().toUpperCase().substring(0, 2);


        // This code prompts the user to enter their year of
        // birth, captures the input, and formats it by
        // extracting the last two digits, storing the
        // result in the variable yearId.
        System.out.print("Enter your year of birth (yyyy): ");
        var yearOfBirth = console.nextLine();
        var yearId = yearOfBirth.strip().substring(2);

        // This code generates a random integer between 1 and 9999,
        // ensuring it is formatted as a four-digit number by
        // padding with leading zeros if necessary, and stores
        // the result in formattedRandomFourDigits.
        var randomFourDigits = random.nextInt(9999) + 1;
        var formattedRandomFourDigits = String.format("%04d", randomFourDigits);

        // This code combines the formatted variables
        // (nameId, lastNameId, yearId, and formattedRandomFourDigits)
        // into a single string, creating a unique ID stored in
        // the variable uniqueId.
        var uniqueId =  String.join("", nameId, lastNameId, yearId, formattedRandomFourDigits);

        // This code uses printf() to format and display a
        // message that greets the user by their first name
        // and presents their newly generated unique ID,
        // including line breaks and indentation for better
        // readability.
        System.out.printf("""
                %nHi %s,\s
                \tYour new ID-Number is ready:
                \t%s
                \tCongratulations!
                """, firstName, uniqueId);
    }
}
