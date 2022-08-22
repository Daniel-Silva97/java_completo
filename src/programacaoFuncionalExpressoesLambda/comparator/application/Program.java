package programacaoFuncionalExpressoesLambda.comparator.application;


import programacaoFuncionalExpressoesLambda.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 400.0));

        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
