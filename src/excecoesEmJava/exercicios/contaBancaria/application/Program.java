package excecoesEmJava.exercicios.contaBancaria.application;

import excecoesEmJava.exercicios.contaBancaria.models.entities.BankAccount;
import excecoesEmJava.exercicios.contaBancaria.models.exceptions.Withdraw;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            BankAccount account = new BankAccount(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);


            System.out.print("New balance: " + account.getBalance());
        } catch (Withdraw e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }


        sc.close();
    }
}
