package programacaoFuncionalExpressoesLambda.exercicios.funcionarios.application;

import programacaoFuncionalExpressoesLambda.exercicios.funcionarios.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salary));

                line = br.readLine();
            }

            System.out.println();
            Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
            System.out.println("Email of people whose salary is more than 2000.00:");
            List<String> emails = list.stream().filter(p -> p.getSalary() >= 2000)
                    .map(p -> p.getEmail())
                    .sorted(comparator)
                    .collect(Collectors.toList());
            emails.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
