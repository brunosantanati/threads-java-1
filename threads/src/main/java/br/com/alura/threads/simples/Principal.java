package br.com.alura.threads.simples;

public class Principal {

    public static void main(String[] args) {

        Runnable tarefa = new ImprimeString();
        Thread thread = new Thread(tarefa);
        thread.start();
    }
}
