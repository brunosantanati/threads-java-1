package br.com.alura.threads.exercicio;

public class PrincipalOrdemDeExecucao {

    /*
    Ao executar a ordem que os números estão sendo impressos no console deve variar.
    Lembrando, não temos controle sobre essa ordem de execução.
    Mesmo assim, veremos ainda algumas formas de influenciar a execução.
     */

    public static void main(String[] args) {
        new Thread(new TarefaImprimeNumeros ()).start();
        new Thread(new TarefaImprimeNumeros ()).start();
    }
}