package outrosTopicosJava;

public class FuncoesParaString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        System.out.println("Original: -" + original + "-");

        // Deixando todas as letras minúsculas
        String s01 = original.toLowerCase();
        System.out.println("toLowerCase: -" + s01 + "-");

        // Deixando todas as letras maiúsculas
        String s02 = original.toUpperCase();
        System.out.println("toUpperCase: -" + s02 + "-");

        // Removendo os espaços da String
        String s03 = original.trim();
        System.out.println("trim: -" + s03 + "-");

        // Utilizando substring, a partir de um caractere X,
        // cria uma nova string com os valores a partir da posição informada
        String s04 = original.substring(2);
        System.out.println("subString: -" + s04 + "-");

        // Substring com 2 argumentos (posiçãoInicial, posiçãoFinal)
        String s05 = original.substring(2, 9);
        System.out.println("subString 2 argumentos: -" + s05 + "-");

        // Replace, substituindo um dado por outro
        // trocando a por x no exemplo abaixo
        String s06 = original.replace('a', 'x');
        System.out.println("replace(a, x): -" + s06 + "-");

        // Procurando o index da primeira posição que a aplicação encontrou "bc" na String
        int i = original.indexOf("bc");
        System.out.println("indexOf bc: " + i);

        // Procurando o index da última posição que a aplicação encontrou "bc" na String
        int j = original.lastIndexOf("bc");
        System.out.println("lastIndexOf bc: " + j);

        // Usando split para separar as strings em Variáveis por meio de um separador
        String s = "potato apple lemon";
        // Criando um vetor para armazenar as strings separadas em index
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}
