package br.com.emmanuelneri.arrays;

import java.util.Arrays;

//Armazenar 5 números inteiros e retirar os valores ímpares.
public class ProblemaRetirarValoresImpares {

    public static void main(String args[]) {

        int[] numeros = {9, 10, 11, 3, 20}; // cria um array do tipo int com 5 valores

        for (int i = 0; i < numeros.length; i++) { // percorre o array de números
            if(numeros[i] % 2 != 0) { // verifica se o número da posição não é divisível por 2
                numeros[i] = 0; // caso for verdadeiro, coloca 0 na posição i para retirar o valor ímpar
            }
        }

        System.out.println(Arrays.toString(numeros)); // apresenta apenas os valores pares
    }

}
