package construtores.application;

import construtores.entities.Product;

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
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        // Após criar o construtor agora quando instancio o objeto, o programa me obriga a enviar os campos como parâmetros
        // Previne erros como a instanciação de um objeto com valores vazios podendo causar erros no programa
        Product product = new Product(name, price, quantity);
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

