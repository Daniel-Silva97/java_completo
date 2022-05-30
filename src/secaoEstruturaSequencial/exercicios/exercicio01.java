package secaoEstruturaSequencial.exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;


        A = sc.nextInt();
        B = sc.nextInt();

        int sumNumbers = A + B;

        System.out.println("A soma é: " + sumNumbers);



        sc.close();
    }
}
