package construtores.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Criando o construtor para obrigar o programa a instaciar o objeto informando valores diferentes do default
    public Product(String name, double price, int quantity) {
        // this é usado para acessar o atributo da classe, por exemplo this.name acessa o atributo name
        // fora do construtor e name é o parâmetro que passei na criação do construtor, então com isso, quando o
        // objeto for instanciado no programa, os parâmetros que o Construtor recebeu na instanciação,
        // serão copiados aos atributos da classe.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Método de Sobrecarga - Podemos criar dois construtores que recebem parâmetros diferentes, com isso podemos
    // instaciar objetos com TODOS os dados igual o primeiro acima, ou remover atributos não obrigatórios como o caso
    // do construtor abaixo, sem o atributo quantity, que por padrão será instanciado como 0.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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