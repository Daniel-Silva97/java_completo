package secaoEstruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        // Area do Triangulo a.c/2
        double triangulo = (A * C) / 2;
        System.out.format("Área do triangulo: %.3f", triangulo);
        System.out.println();

        // Área do circulo pi.raio^2
        double pi = 3.14159;
        double circulo = pi * Math.pow(C, 2);

        System.out.format("Área do Círculo: %.3f", circulo);
        System.out.println();

        // Área do trapézio a+b/2 * c
        double trapezio = ((A + B) / 2) * C;

        System.out.format("Área do Trapézio: %.3f", trapezio);
        System.out.println();

        // Área do Quadrado b * b
        double quadrado = B * B;

        System.out.format("Área do Quadrado: %.3f", quadrado);
        System.out.println();

        // Área do Retangulo a * b
        double retangulo = A * B;

        System.out.format("Área do Retângulo: %.3f", retangulo);
        System.out.println();


        sc.close();
    }
}
