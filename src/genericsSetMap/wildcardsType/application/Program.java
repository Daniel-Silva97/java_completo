package genericsSetMap.wildcardsType.application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);


        List<String> myStrs = Arrays.asList("Maria", "Bob", "Brown");
        printList(myStrs);
    }

    // <?> é o tipo curinga das listas com isso no método abaixo vou conseguir percorrer qualquer tipo de lista que
    // ser enviada a ele.

    //Listas do tipo curinga não podem ser manipuladas para ADICIONAR novos itens, pois sendo de tipos diferentes podem
    // gerar erro de compilação.
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
