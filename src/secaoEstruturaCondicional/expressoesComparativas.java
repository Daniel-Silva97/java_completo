package secaoEstruturaCondicional;

import java.util.Scanner;

public class expressoesComparativas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;

        // Estrutura condicional Simples
        int x = 5;
        if (x > 0) {
            System.out.println("Bom dia!");
        }

        // Estrutura condicional composta IF ... Else
        System.out.println("Quantas horas?");
        horas = sc.nextInt();
        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde!");
        }

        // Encadeamento de estruturas condicionais
        System.out.println("Quantas horas?");
        horas = sc.nextInt();
        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
        sc.close();
}
}
