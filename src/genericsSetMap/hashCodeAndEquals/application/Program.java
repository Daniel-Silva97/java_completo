package genericsSetMap.hashCodeAndEquals.application;

import genericsSetMap.hashCodeAndEquals.entities.Client;

public class Program {
    public static void main(String[] args) {
        // String equals
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        // HashCode - Gera números inteiros com base no valor
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        // Utilizando o que foi criado na classe Client
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        // Comparando se os dados dos objetos são iguais
        System.out.println(c1.equals(c2));


        // Comparando se a posição no heap da memória (referências) é o mesmo
        System.out.println(c1 == c2);
    }
}
