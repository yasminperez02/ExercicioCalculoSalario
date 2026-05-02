package application;

import entities.Employees;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employees employee = new Employees();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $" + employee.netSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);
        sc.close();
    }
}
