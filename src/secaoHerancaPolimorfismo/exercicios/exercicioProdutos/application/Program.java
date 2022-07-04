package secaoHerancaPolimorfismo.exercicios.exercicioProdutos.application;

import secaoHerancaPolimorfismo.exercicios.exercicioProdutos.entities.ImportedProduct;
import secaoHerancaPolimorfismo.exercicios.exercicioProdutos.entities.Product;
import secaoHerancaPolimorfismo.exercicios.exercicioProdutos.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        for (int i = 1; i <= numberProducts; i++) {
            System.out.println("Product #" + i + " data:");
            char typeProduct = 'n';
            do {
                System.out.print("Common, used or imported ( c / u / i ): ");
                typeProduct = sc.next().charAt(0);
            } while (typeProduct != 'c' && typeProduct != 'u' && typeProduct != 'i');
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (typeProduct == 'c'){
                products.add(new Product(name, price));
            }
            else if (typeProduct == 'u'){
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            }
            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
