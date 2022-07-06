package secaoHerancaPolimorfismo.exercicios.exercicioTaxs.application;

import secaoHerancaPolimorfismo.exercicios.exercicioTaxs.entities.Company;
import secaoHerancaPolimorfismo.exercicios.exercicioTaxs.entities.Individual;
import secaoHerancaPolimorfismo.exercicios.exercicioTaxs.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberInput = sc.nextInt();

        for (int i = 1; i <= numberInput; i++) {
            System.out.println("Tax payer #" + i + " data:");
            char payer = 'n';

            do {
                System.out.print("Individual or Company (i/c)? ");
                payer = sc.next().charAt(0);
            } while (payer != 'i' && payer != 'c');

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (payer == 'i') {
                System.out.print("Health Expeditures: ");
                double healthExpeditures = sc.nextDouble();
                payers.add(new Individual(name, anualIncome, healthExpeditures));
            } else {
                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                payers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer payer : payers) {
            System.out.println(payer.getName() + ":" + " $ " + String.format("%.2f", payer.tax()));
            sum += payer.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
