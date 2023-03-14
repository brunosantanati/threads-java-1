package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable { //não esqueça de implementar a interface

    private String nomeArquivo;
    private String nome;

    public TarefaBuscaNome(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));

            int numeroLinha = 1;

            while (scanner.hasNextLine()) {

                String linha = scanner.nextLine();

                if (linha.contains(nome)) {
                    System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
                }

                numeroLinha++;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
