package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            if (10 >= valor && valor <= 20) {
                in += 1;
            }
            else out += 1;
        }

        System.out.printf("%d in\n%d out", in, out);


        sc.close();
    }
}
