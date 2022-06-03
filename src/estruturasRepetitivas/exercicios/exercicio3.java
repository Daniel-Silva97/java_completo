package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel = 0;
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;


        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            }
            combustivel = sc.nextInt();
        }

        System.out.println(String.format("Muito Obrigado! \n Alcool: %d \n Gasolina: %d \n Diesel: %d", alcool, gasolina, diesel));

        sc.close();
    }
}

