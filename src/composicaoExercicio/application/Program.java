package composicaoExercicio.application;

import composicaoExercicio.entities.Client;
import composicaoExercicio.entities.Order;
import composicaoExercicio.entities.OrderItem;
import composicaoExercicio.entities.Product;
import composicaoExercicio.entities.enums.OrderStatus;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("E-mail: ");
        String clienteEmail = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate =sdf.parse(sc.next());

        Client client = new Client(clientName, clienteEmail, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();
        for (int i = 1; i <= numItems; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String name = sc.next();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            Product product = new Product(name, price);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
