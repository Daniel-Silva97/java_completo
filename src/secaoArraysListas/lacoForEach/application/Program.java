package secaoArraysListas.lacoForEach.application;

public class Program {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for (int i= 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        // Neste for eu informo o tipo do vetor (String), um apelido e a lista que deseja iterar (vect)
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
