package secaoHerancaPolimorfismo.metodosAbstratos.application;

import secaoHerancaPolimorfismo.metodosAbstratos.models.entities.Circle;
import secaoHerancaPolimorfismo.metodosAbstratos.models.entities.Rectangle;
import secaoHerancaPolimorfismo.metodosAbstratos.models.entities.Shape;
import secaoHerancaPolimorfismo.metodosAbstratos.models.enums.Color;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Shape #" + i + " data:");
            char type = 'n';
            do {
                System.out.print("Rectangle or Circle (r / c)? ");
                type = sc.next().charAt(0);
            } while (type != 'r' && type != 'c');
            System.out.print("Color (BLACK / BLUE / RED): ");
            Color color = Color.valueOf(sc.next());
            if (type == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPES AREAS: ");

        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
