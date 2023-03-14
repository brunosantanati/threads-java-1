package br.com.alura.threads.lista.customizada;

public class TarefaImprimir implements Runnable {

    private Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        synchronized (lista) { //novo, obtendo a chave da lista
            if(!lista.estaCheia()) {
                try { //novo try-catch
                    System.out.println("esperando, aguardando notificacao");
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(i + " - " + lista.pegaElemento(i));
            }
        }
    }
}
