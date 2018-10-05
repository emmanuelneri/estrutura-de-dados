package br.com.emmanuelneri.listas.estatica.implementacao;

import java.util.Random;

public class PerformanceTest {

    public static void main(String args[]) throws InterruptedException {

        Lista lista = new Lista();

        while (true) {

            long inicio = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++) {
                lista.inserirPorElemento(new Random().nextInt());
            }

            long duracao = System.currentTimeMillis() - inicio;
            System.out.println("Duração: " + duracao);
            Thread.sleep(100);

        }

    }

}
