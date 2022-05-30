package secaoEstruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valor;

        numFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valor = sc.nextDouble();

        double salario = horasTrabalhadas * valor;

        System.out.println("Number = " + numFuncionario);
        System.out.format("Salary = U$ %.2f", salario);


        sc.close();
    }
}
