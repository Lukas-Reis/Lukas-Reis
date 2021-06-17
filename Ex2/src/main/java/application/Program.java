
package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        //Chmamando variavel name-String
        System.out.print("Name: ");
        employee.name = sc.nextLine();

        //Chmamando variavel grossSalaray-double
        System.out.print("Gross Salaray: ");
        employee.grossSalary = sc.nextDouble();

        //Chmamando variavel tax-double
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

//Processamento do método netSalary (grossSalary-tax)
        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);
        sc.close();




    }
}
