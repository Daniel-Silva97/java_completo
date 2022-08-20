
package genericsSetMap.set.exercicios.quantidadeAlunos.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i++) {
            int number = sc.nextInt();
            setA.add(number);
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int i = 0; i < courseB; i++) {
            int number = sc.nextInt();
            setB.add(number);
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int i = 0; i < courseC; i++) {
            int number = sc.nextInt();
            setC.add(number);
        }

        Set<Integer> total = new HashSet<>(setA);
        total.addAll(setB);
        total.addAll(setC);

        System.out.println("Total students: " + total.size());


        sc.close();
    }
}
