package introducaoOrientadaObjeto.orientadaObjeto.application;

import introducaoOrientadaObjeto.orientadaObjeto.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class orientadoObjetoSolucao {
    public static void main(String[] args) {
        // Calculando a área do Triângulo utilizando Linguagem Orientada a objetos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();



        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

//        Utilização sem Métodos (Má prática)
//        double pX = (x.a + x.b + x.c) / 2;
//        double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
//        double pY = (y.a + y.b + y.c) / 2;
//        double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));

//      Utilizando métodos (Boas práticas)
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }


        sc.close();
    }
}
