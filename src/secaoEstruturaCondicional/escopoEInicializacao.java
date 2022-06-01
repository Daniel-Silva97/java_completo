package secaoEstruturaCondicional;

public class escopoEInicializacao {
    public static void main(String[] args) {
        // Inicialização

        double price = 400.0;
        System.out.println(price); // Mostrando váriável inicializada

//        double pr;
//        System.out.println(pr); // Váriável não inicializada apresenta erro


        // Escopo
        if (price < 200) {
            double discount = price * 0.02;
        }

//        System.out.println(discount); // Discount está no escopo somente da condicional, não pode ser usado fora deste escopo

    }
}
