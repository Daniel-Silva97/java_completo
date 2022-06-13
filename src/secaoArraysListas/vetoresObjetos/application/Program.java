package secaoArraysListas.vetoresObjetos.application;

import secaoArraysListas.vetoresObjetos.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto[] vect = new Produto[n];
        // vect.lenght nos dá o tamanho do vetor, boa prática
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double media = sum / vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n", media);


        sc.close();
    }
}
