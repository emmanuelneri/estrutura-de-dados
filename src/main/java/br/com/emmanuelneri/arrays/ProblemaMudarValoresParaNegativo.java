package br.com.emmanuelneri.arrays;

import java.util.Arrays;

//Armazenar 5 números inteiros positivos e mudar os 5 números para negativo.
public class ProblemaMudarValoresParaNegativo {

    public static void main(String args[]) {

        int[] numeros = {9, 21, 11, 3, 20}; // cria um array do tipo int com 5 valores pré definidos
        int[] numerosNegativos =  new int[numeros.length]; // cria um array do tipo int com o tamanho do array de números


        for (int i = 0; i < numeros.length; i++) { // percorre o array de números
            int numeroNegativo = numeros[i] * -1; // multiplica o número na posição i por -1 para deixar ele negativo
            numerosNegativos[i] = numeroNegativo; // atribui o número negativo para a posição i do array numerosNegativos
        }

        System.out.println(Arrays.toString(numerosNegativos)); // apresenta os valores do array numerosNegativos
    }

}
