package genericsSetMap.genericsDelimited.application;

import genericsSetMap.genericsDelimited.entities.Product;
import genericsSetMap.genericsDelimited.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();
        String path = "C://Temp//teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product maxValue = CalculationService.max(products);
            System.out.println("Most expensive:");
            System.out.println(maxValue);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
