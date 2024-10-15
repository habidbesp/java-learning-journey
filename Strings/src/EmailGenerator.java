public class EmailGenerator {
    public static void main(String[] args) {
        System.out.println("*** Email Generator App ***");

        // Format the username for the email by joining all first names and last names with a '.'
        // and converting them to lowercase.
        var userName = " Juan Perez Salas ";
        // remove whitespace characters from both the beginning and the end of "userName",
        // including all Unicode whitespace characters.
        var userNameFormatted = userName.strip();
        // Replace all whitespace characters with a '.'
        userNameFormatted = userNameFormatted.replace(" ", ".");
        // transform to lowercase format
        userNameFormatted = userNameFormatted.toLowerCase();

        // Format the company's name with the prefix '@' followed by the country's domain.
        var companyName = "  Global Mentoring ";
        // repeat process like username
        var companyNameFormatted = companyName.strip();
        companyNameFormatted = companyNameFormatted.replace(" ","");
        companyNameFormatted = companyNameFormatted.toLowerCase();

        var countryDomain = ".at";
        var atSymbol = "@";

        var companyDomainFormatted = String.join("", atSymbol, companyNameFormatted, countryDomain);

        // generate final email
        var formattedEmail = String.join("", userNameFormatted, companyDomainFormatted);

        System.out.println("Username: " + userName);
        System.out.println("User Name Formatted: " + userNameFormatted);
        System.out.println();
        System.out.println("Company Name: " + companyName);
        System.out.println("Domain's Extension: " + countryDomain);
        System.out.println("Email's Domain: " + companyDomainFormatted);
        System.out.println();
        System.out.println("Final Generated Email: " + formattedEmail);
    }
}
