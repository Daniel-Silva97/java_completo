package excecoesEmJava.tryCatchFinally.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        // Usado para encerrar conexões com bancos, arquivos, etc, sempre para códigos que independente de execeção precisa ser executado
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed!");
        }
    }
}