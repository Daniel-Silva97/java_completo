package secaoHerancaPolimorfismo.exercicios.exercicioExemplo.application;

import secaoHerancaPolimorfismo.exercicios.exercicioExemplo.entities.Employee;
import secaoHerancaPolimorfismo.exercicios.exercicioExemplo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Outsourced? (y / n): ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            double valueperHour = sc.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valueperHour, additionalCharge));
            }
            else employees.add(new Employee(name, hours, valueperHour));
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employees){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }


        sc.close();
    }
}
