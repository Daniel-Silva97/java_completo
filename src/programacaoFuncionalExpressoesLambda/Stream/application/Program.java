package programacaoFuncionalExpressoesLambda.Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Multiplicou por 10 cada elemento
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        // Reduce efetua a soma de todos os elementos da lista, 0 é o número neutro do somatório
        int sum = list.stream().reduce(0, (x, y) -> x + y);

        System.out.println("Sum = " + sum);


        List<Integer> newList = list.stream()
                // Filter, retorna somente os elementos desejados de acordo com um predicado
                .filter(x -> x % 2 == 0)
                // Transformando com map multiplicado por 10 o resultado do filter
                .map(x -> x * 10)
                // Convertendo em lista
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
