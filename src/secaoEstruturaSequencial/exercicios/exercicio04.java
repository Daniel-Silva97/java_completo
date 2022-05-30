package secaoEstruturaSequencial.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;


        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int resultado = (A * B) - (C * D);

        System.out.println(resultado);

        sc.close();
    }
}
