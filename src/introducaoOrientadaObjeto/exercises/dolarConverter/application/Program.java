package introducaoOrientadaObjeto.exercises.dolarConverter.application;

import introducaoOrientadaObjeto.exercises.dolarConverter.util.CurrencyConverter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double buyDollarQuant = sc.nextDouble();

        double finalValue = CurrencyConverter.calculator(dollar, buyDollarQuant);

        System.out.println("Amount to be paid in Reais: " + finalValue);

        sc.close();
    }
}
