package introducaoOrientadaObjeto.estoqueProgram.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        // usando this para dizer que quero acessar o atributo quantity e não o parâmetro da função quantity
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }


    // Este é um método que sobrepoe o toString presente no Tipo objeto, portanto o padrão não será usado e sim o que
    // for definido abaixo
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
