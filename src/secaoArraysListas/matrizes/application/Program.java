package secaoArraysListas.matrizes.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        /*
        mat.length -> É o tamanho da linha da matriz
        mat[linha].length -> É o tamanho da coluna da matriz
         */
        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                mat[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int count = 0;

        for (int linha = 0; linha < mat.length; linha++){
            for (int coluna = 0; coluna < mat[linha].length; coluna++){
                if(mat[linha][coluna] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative Numbers: " + count);

            sc.close();
    }
}
