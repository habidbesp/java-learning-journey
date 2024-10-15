import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        System.out.println("*** Employe System ***");

        var console = new Scanner(System.in);

        // Employee Name
        System.out.print("Employee's Name: ");
        var employeeName = console.nextLine();

        // Employee Age
        System.out.print("Employee's Age: ");
        var employeeAge = Integer.parseInt(console.nextLine());

        // Employee Salary
        System.out.print("Employee's Salary: ");
        var employeeSalary = Double.parseDouble(console.nextLine());

        // Is Department Head
        System.out.print("Employee is Head of Department: ");
        var isDepartmentHead = Boolean.parseBoolean(console.nextLine());

        // Print employee's values
        System.out.println("\nEmployee Data: ");
        System.out.println("\tName: " + employeeName);
        System.out.println("\tAge: " + employeeAge + " years");
        // System.out.println("\tSalary: € " + employeeSalary);
        // System.out.println("\tSalary: €%.2f".formatted(employeeSalary));
        System.out.printf("\tSalary: €%.2f%n", employeeSalary);
        System.out.println("\tIs Head of Department: " + isDepartmentHead);
    }
}
