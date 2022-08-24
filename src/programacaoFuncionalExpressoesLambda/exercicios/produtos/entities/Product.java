package programacaoFuncionalExpressoesLambda.exercicios.produtos.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + ", " + String.format("%.2f", price);
    }
}
