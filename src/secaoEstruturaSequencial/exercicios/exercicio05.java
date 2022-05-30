package secaoEstruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2;
        int qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2;

        codigoPeca1 = sc.nextInt();
        qtdPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        qtdPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        double valorFinal = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);

        System.out.format("Valor a pagar: %.2f", valorFinal);

        sc.close();
    }
}
