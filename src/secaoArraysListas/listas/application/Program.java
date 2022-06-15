package secaoArraysListas.listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /*
        Tamanho da lista: size()
        Obter o elemento de uma posição: get(position)
        Inserir elemento na lista: add(obj), add(int, obj)
        Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
        Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
        Filtrar lista com base em predicado:
            List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
        Encontrar primeira ocorrência com base em predicado:
            Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

         */

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna"); // Adicionando itens na ordem

        list.add(2, "Marco"); // Adicionando o item em uma posição específica.

        System.out.println(list.size());


        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------------------------------------------");
        list.remove("Anna"); // Informando o dado que está na posição
        list.remove(1); // removendo pelo index
        list.removeIf(x -> x.charAt(0) == 'M'); // remover usando predicado (condição), no exemplo removo todos que começam com M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // retorna posição do Bob
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // retorna -1 quando não existe na lista


        System.out.println("-----------------------------------------------------------");
        // Criando uma segunda lista que só tenha os nomes iniciados com 'A' da lista 1
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /*
        Lista result:

        list.stream - Tipo especial que permite que eu possa manipular lista com expressões lambda
        x -> charAt (0)  == A - Retorna True para todos que começarem com A
        collect(Collectors.toList()) - Converte para lista novamente
         */
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        /*
        findFirst - identifica o primeiro elemento que atende determinada condição
        orElse - Se nenhum elemento atender o findFirst substituirá por null
         */

    }
}
