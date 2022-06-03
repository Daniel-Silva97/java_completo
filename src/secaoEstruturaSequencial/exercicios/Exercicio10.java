package secaoEstruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
//        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//        exemplo.
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            int primeiro = i;
            int segundo = (int) Math.pow(i, 2);
            int terceiro = (int) Math.pow(i, 3);

            System.out.println(String.format("%d %d %d", primeiro, segundo, terceiro));
        }


            sc.close();

    }
}
