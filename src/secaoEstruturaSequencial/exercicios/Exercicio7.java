package secaoEstruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double numero = sc.nextInt();
            double divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double resultado = numero / divisor;
                System.out.println(String.format("%.1f", resultado));
            }
        }

        sc.close();

    }
}
