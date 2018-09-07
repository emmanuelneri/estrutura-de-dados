package br.com.emmanuelneri.filas;

import java.util.Arrays;

// Enfileirar (inserir) elemento da fila
public class EnfileirarNaFila {

    public static void main(String args[]) {

        String[] fila = new String[10]; // Cria um array de 10 posições
        int proximaPosicao = 0;// inicializa variável com valor da posição disponível para inserir na fila, iniciando em zero

        proximaPosicao = enfileirar(fila, proximaPosicao, "A"); // enfileira elemento A / proximaPosicao = 0
        proximaPosicao = enfileirar(fila, proximaPosicao, "B"); // enfileira elemento B / proximaPosicao = 1
        proximaPosicao = enfileirar(fila, proximaPosicao, "C"); // enfileira elemento C / proximaPosicao = 2

        System.out.println(Arrays.toString(fila)); // Apresenta valores do array
        // Resultado:  A, B, C

    }

    // Método genérico para enfileirar elemento na fila de acordo com a próxima posição
    public static int enfileirar(String[] fila, int proximaPosicao, String elemento) {
        fila[proximaPosicao] = elemento; // inserer elemento na próximaPosicacao
        return proximaPosicao + 1; // conta mais um na próximaPosicacao
    }


}
