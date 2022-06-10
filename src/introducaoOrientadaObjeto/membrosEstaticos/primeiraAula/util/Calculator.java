package introducaoOrientadaObjeto.membrosEstaticos.primeiraAula.util;

public class Calculator {
    // Váriável estática e constante (sabemos pelo uso do final que será valor fixo) deve ser toda em maiúscula.
    public static final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
