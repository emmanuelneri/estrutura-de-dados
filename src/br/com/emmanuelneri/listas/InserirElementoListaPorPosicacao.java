package br.com.emmanuelneri.listas;

import java.util.ArrayList;
import java.util.Arrays;

// Inserir um elemento na lista passando uma posição
public class InserirElementoListaPorPosicacao {

    public static void main(String args[]) {

        String[] lista = new String[10]; // Cria um array de 10 posições do tipo "Texto"

        insere(lista, 0, "A"); // Adiciona A na lista na posição 1 pelo método insere
        insere(lista, 1, "B"); // Adiciona B na lista na posição 1 pelo método insere
        insere(lista, 0, "C"); // Adiciona C na lista na posição 1 pelo método insere

        System.out.println(Arrays.toString(lista)); // Apresenta valores da lista
        // Resultado: C, B

    }

    // Método genérico para inserir um elemento em uma posição da lista
    public static String[] insere(String[] lista, int posicao, String elemento) {

        lista[posicao] = elemento; //atribui elemento na posição informada no parâmetro

        return lista; // retorna a lista após a inserção do elemento
    }


}
