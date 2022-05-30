package secaoEstruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            // Fórmula da área: area = π . raio2
            // Considere o valor de π = 3.14159
        double pi = 3.14159;
        double raio;

        raio = sc.nextDouble();

       double area = pi * Math.pow(raio, 2);

        System.out.format("Área = %.4f", area);

        sc.close();
    }
}
