package genericsSetMap.set.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        // Inicio demo1

        /*
        HashSet - Não garante a ordenação em que os itens foi inserido, mas é o mais rápido
        TreeSet - Ordena de acordo com o objeto que está sendo inserido, por exemplo, String é ordenada em ordem alfabética
        LinkedHashSet - Mantém a ordem de inserção dos itens.
         */

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        // removendo um item com set
        set.remove("Tablet");

        // removendo passando um predicado com removeIf
        // Exemplo removendo tudo que tiver mais que 3 letras
        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }
        // FIM demo1

        // Inicio demo2
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        // FIM demo2
    }
}
