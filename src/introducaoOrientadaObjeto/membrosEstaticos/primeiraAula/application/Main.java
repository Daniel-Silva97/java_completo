package introducaoOrientadaObjeto.membrosEstaticos.primeiraAula.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    // Váriável estática e constante (sabemos pelo uso do final que será valor fixo) deve ser toda em maiúscula.
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", PI);


        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
