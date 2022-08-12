package trabalhandoComArquivos.exercicios.application;


import trabalhandoComArquivos.exercicios.entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ManipularCSV {
    public static void main(String[] args) {
        // Passo 1 — Ler o caminho para CSV original
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produtos> produtos = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String strCaminho = sc.nextLine();

        File arquivoOriginal = new File(strCaminho);

        String caminhoPasta = arquivoOriginal.getParent();

        // Passo 4 — Criar uma subpasta "out" dentro da pasta em que o arquivo original se encontra
        boolean success = new File(caminhoPasta + "\\out").mkdir();
        String targetFile = caminhoPasta + "\\out\\summary.csv";

        // Passo 2 — Armazenar nome, preço e quantidade (Separado por vírgula no arquivo)
        try (BufferedReader br = new BufferedReader(new FileReader(strCaminho))) {
            String itemsCSV = br.readLine();
            while (itemsCSV != null) {
                String[] campos = itemsCSV.split(";");
                String nome = campos[0];
                Double preco = Double.parseDouble(campos[1]);
                Integer quantidade = Integer.parseInt(campos[2]);

                produtos.add(new Produtos(nome, preco, quantidade));

                itemsCSV = br.readLine();
            }

            // Passo 5 — Guardar um novo arquivo nesta pasta chamado sumary.csv
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (Produtos item : produtos) {
                    bw.write(item.getNome() + ";" + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFile + " CRIADO!");
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        sc.close();


    }
}
