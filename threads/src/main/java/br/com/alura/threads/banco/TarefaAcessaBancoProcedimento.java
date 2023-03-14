package br.com.alura.threads.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBancoProcedimento(PoolDeConexao pool,
                                         GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        // código para gerar deadlock (ordem inversa da classe TarefaAcessaBanco)
        /*synchronized (tx) {

            System.out.println("Peguei a chave da tx");
            tx.begin();

            synchronized (pool) {

                System.out.println("Peguei a chave do pool");
                pool.getConnection();
            }
        }*/

        // código ok na mesma ordem da classe TarefaAcessaBanco - não gera deadlock
        synchronized (pool) {

            System.out.println("Peguei a chave do pool");
            pool.getConnection();

            synchronized (tx) {

                System.out.println("Peguei a chave da tx");
                tx.begin();

            }
        }
    }
}
