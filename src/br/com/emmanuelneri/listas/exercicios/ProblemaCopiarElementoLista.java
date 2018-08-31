package br.com.emmanuelneri.listas.exercicios;

import java.util.Arrays;

//Copiar uma lista de 15 elementos para uma lista de 30 elementos
public class ProblemaCopiarElementoLista {

    public static void main(String args[]) {
        Integer[] lista =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // Cria um array de 15 posições com os valores
        Integer[] listaMaior = new Integer[30]; // Cria um array de 30 posições sem valores

        for(int i = 0; i < lista.length; i++) { // percorre a lista iniciando na posição 0
            listaMaior[i] = lista[i]; // atribui valor da lista na posição i para a listaMaior na posição i
        }

        System.out.println(Arrays.toString(listaMaior)); // apresenta valores da lista maior
        // Resultado: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
    }

}
