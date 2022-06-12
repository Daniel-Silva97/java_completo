package secaoConstrutoresEncapsulamento.exercicios.contaBancaria.application;

import secaoConstrutoresEncapsulamento.exercicios.contaBancaria.entities.BankAccount;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount register;


        System.out.println("Welcome to Daniel's Bank");
        System.out.println("Register your account!");
        System.out.printf("Enter account number:  ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char confirmInitialDeposit = sc.next().charAt(0);

        if (confirmInitialDeposit == 'y') {
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            register = new BankAccount(account, name, initialDeposit);
        } else {
            register = new BankAccount(account, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(register.toString());
        System.out.println();

        System.out.printf("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        register.makeDeposit(deposit);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(register.toString());
        System.out.println();

        System.out.printf("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        register.withdrawValue(withdraw);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(register.toString());
        System.out.println();

        sc.close();
    }
}
