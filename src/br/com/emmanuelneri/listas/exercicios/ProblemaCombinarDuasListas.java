package br.com.emmanuelneri.listas.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Combinar duas listas de 10 elementos em uma lista de 20 elementos
public class ProblemaCombinarDuasListas {

    public static void main(String args[]) {
        Integer[] lista1 =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // Cria um array de 15 posições com os valores
        Integer[] lista2 =  {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}; // Cria um array de 15 posições com os valores
        Integer[] listaCombinada = new Integer[30]; //Criar um array de 30 posições para receber as duas listas
        int posicao = 0; // inicializa variavel posição para controlar os index disponíveis da lista

        for(int i = 0; i < lista1.length; i++) { // percorre a lista iniciando na posição 0
            listaCombinada[posicao] = lista1[i]; // atribui valor da lista na posição i para a listaMaior na posição i
            posicao++; // conta mais um na posição
        }

        for(int i = 0; i < lista2.length; i++) { // percorre a lista iniciando na posição 0
            listaCombinada[posicao] = lista2[i]; // atribui valor da lista na posição i para a listaMaior na posição i
            posicao++; // conta mais um na posição
        }

        System.out.println(Arrays.toString(listaCombinada)); // apresenta da lista combinada
        // Resultado: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
    }

}
