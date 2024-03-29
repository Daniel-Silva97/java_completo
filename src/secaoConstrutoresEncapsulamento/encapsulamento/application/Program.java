package secaoConstrutoresEncapsulamento.encapsulamento.application;

import secaoConstrutoresEncapsulamento.encapsulamento.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();


        Product product = new Product(name, price);


        // Usando o secaoConstrutoresEncapsulamento.encapsulamento atribuindo e consultando atributos por meio dos Getters and Setters
        product.setName("Computer");
        System.out.println("Updated Name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());


        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}

