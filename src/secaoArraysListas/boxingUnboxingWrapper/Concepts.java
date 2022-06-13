package secaoArraysListas.boxingUnboxingWrapper;

public class Concepts {
    // Boxing - Quando tansformamos uma variável do tipo valor para um objeto, por exemplo:
    int x = 20; // Tipo valor
    Object obj = x; // Tipo referencia

    // Unboxing - Processo contrário, convertendo um objeto para uma variável do tipo valor compatível
    int y = (int) obj; // Fazendo o cast para int e convertendo o objeto para valor int

    // Wrapper Classes - São Classes equivalentes aos tipos primitivos
    // Usando para que a conversão dos objetos sejam feitas de forma natural no programa sem necessidade de cast,
    // por exemplo
    Integer wrapper = x; // Criando um objeto do tipo inteiro

    int z = wrapper; // Convertendo sem obrigatoriedade do cast

    /*
    Temos Classes Wrapper para todos os tipos primitivos:
    Boolean, Integer, Character, etc...


    Wrapper classes aceitam valor nulos naturalmente.
     */
}
