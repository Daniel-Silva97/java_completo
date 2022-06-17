package secaoArraysListas.exercicios.listas.application;

import secaoArraysListas.exercicios.listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();

        System.out.println("How many employees do you want to register?");
        int n = sc.nextInt();

        System.out.println("Register here your " + n + " employees:");
        for (int i = 0;i < n; i++){
            System.out.print("ID Register: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employee.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have increase salary: ");
        int  id = sc.nextInt();
        Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : employee) {
            System.out.println(obj);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
