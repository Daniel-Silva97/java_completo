import java.util.Locale;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Alterando para o padrão americano (.)
        Scanner sc = new Scanner(System.in); //Instanciando o Scanner

        String x;
        x = sc.next(); // Entrada de String via Teclado
        System.out.println("Você digitou: " + x);


        int y;
        y = sc.nextInt(); // Entrada de números inteiros
        System.out.println("Você digitou: " + y);


        double z;
        z = sc.nextDouble(); //Entrada de Ponto flutuante em Java, entende se deve ser " . " ou " , " para separar as
        // casas decimais de acordo com a localidade da máquina
        // para usar . use o comando Locale
        System.out.println("Você digitou: " + z);

        //Usando CharAt
        char a;
        // Extraindo o primeiro caractere da entrada
        a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);

        // Lendo dados digitados na mesma linha separados por espaço
        String b;
        int c;
        double d;

        b = sc.next();
        c = sc.nextInt();
        d = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        String s1, s2, s3;

        s1 = sc.nextLine();
        // Armazenado a quebra de linha antes de passar para a próxima variável (Limpar Buffer)
        sc.nextLine();
        s2 = sc.nextLine();
        // Armazenado a quebra de linha antes de passar para a próxima variável (Limpar Buffer)
        sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); //Encerrando e desalocando a entrada do dado da memória
    }
}
