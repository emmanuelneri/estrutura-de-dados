package br.com.emmanuelneri.filas;

import java.util.Arrays;

// Retornar próximo elemento da fila
public class RetornarProximoDaFila {

    public static void main(String args[]) {

        String[] fila = {"X", "A", "C", "WW", "E"};  // Cria um array de 5 posições com os valores X, A, C, WW e E

        System.out.println(retornarProximoDaFila(fila)); // retorna o proximo da fila
        // Resultado: X
    }

    // Método genérico para retornar proximo elemento da fila
    public static String retornarProximoDaFila(String[] fila) {
        return fila[0]; // o próximo da fila sempre é o elemento na primeira posição (posição 0 do array)
    }

}
