package br.com.emmanuelneri.filas.estatica.implementacao;

import java.util.Random;

public class PerformanceTest {

    public static void main(String args[]) throws InterruptedException {

        Fila fila = new Fila();

        while (true) {

            long inicio = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++) {
                fila.enfileirar(new Random().nextInt());
            }

            long duracao = System.currentTimeMillis() - inicio;
            System.out.println("Duração: " + duracao);
            Thread.sleep(100);

        }

    }

}
