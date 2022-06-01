package secaoEstruturaCondicional;

public class expressaoCondicionalTernaria {
    public static void main(String[] args) {
        // Sintaxe (condição) ? valor_se_verdadeiro : valor_se_falso

        // Exemplo
        // (2 > 4) ? 40 : 80 RESULTADO - 80

        // Na prática...

        double preco = 34.5;
        double desconto;
        // Condicional if ... else
//        if (preco < 20.0){
//            desconto = preco * 0.1;
//        }
//        else {
//            desconto = preco * 0.05;
//        }

        // Condicional Ternária
        desconto = (preco < 20) ? preco * 0.1 :  preco * 0.05;
    }
}
