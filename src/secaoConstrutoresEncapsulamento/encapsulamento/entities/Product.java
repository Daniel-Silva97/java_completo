package secaoConstrutoresEncapsulamento.encapsulamento.entities;

public class Product {
    // Por convenção, os atributos devem estar em private e só podem ser acessados por Getters and Setters.
    private String name;
    private double price;
    private int quantity;

    // Construtores
    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (Por convenção sempre após os contrutores)
    // Getters para consultar o valor do atributo
    public String getName() {
        return name;
    }

    // Setter para alterar valores do atributo
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    // Criado somente o Getter devido ao fato da quantidade não poder ser alterada com exceção da
    // entrada/saída de estoque, no qual já temos funções que fazem esta alteração, tornando o código
    // mais consistente.
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}