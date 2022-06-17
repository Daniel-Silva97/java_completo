package secaoArraysListas.exercicios.matriz.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines? ");
        int lines = sc.nextInt();
        System.out.print("How many collums? ");
        int columns = sc.nextInt();

        int[][] mat = new int[lines][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter a number: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("Which number do you want to seek? ");
        int numberSearch = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numberSearch) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat[i].length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
