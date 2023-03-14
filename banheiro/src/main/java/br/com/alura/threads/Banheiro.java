package br.com.alura.threads;

public class Banheiro {

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " entrando no banheiro");
        System.out.println(nome + " fazendo coisa rapida");

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " lavando a mao");
        System.out.println(nome + " saindo do banheiro");
    }

    public void fazNumero2() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " entrando no banheiro");
        System.out.println(nome + " fazendo coisa demorada");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " lavando a mao");
        System.out.println(nome + " saindo do banheiro");
    }
}
