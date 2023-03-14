package br.com.alura.threads;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        this.banheiro.limpa();
    }
}
