public class StringFormatting {
    public static void main(String[] args) {
        System.out.println("***  String Formatting ***");

        var name = "Albert";
        var age = 38;
        var salary = 2150.76;

        // String.format
        var message = String.format("Name: %s, Age: %d, Salary: €%.2f",  name, age, salary);
        System.out.println(message);

        // Method printf()
        System.out.printf("Name: %s, Age: %d, Salary: €%.2f%n",
                name, age, salary);

        var employeeNumber = 12;

        // Formatting text block
        message = """
                %nPerson Details:\s
                ----------------
                \tName: %s
                \tEmployee Number: %04d
                \tAge: %d years
                \tSalary: €%.2f
                """.formatted(name, employeeNumber,age, salary);
        System.out.println(message);

        // Formatting with next block and printf() directly
        System.out.printf("""
                %nPerson Details:\s
                ----------------
                \tName: %s
                \tEmployee Number: %04d
                \tAge: %d years
                \tSalary: €%.2f
                """, name, employeeNumber,age, salary);
    }
}
