package br.com.emmanuelneri.arrays;

import java.util.Arrays;
import java.util.Random;

//Armazenar 10 números com Math.random e apresentar números repetidos se houver.
public class ProblemaApresentarRepetidos {

    public static void main(String args[]) {

        int[] numeros = new int[10]; // cria um array do tipo int com 10 posições

        for (int i = 0; i < numeros.length; i++) { // percorre o array de números para popular com números aleatórios
            numeros[i] = (int)(Math.random() * 15); // atribuir valor na posição i com algum número aleatório até 15
//            numeros[i] = new Random().nextInt(15); uma alternativa ao Math.random é o new Random().nextInt
        }

        String elementosDoArray = ""; //inicializa variável para apresenta todos elementos do array
        String elementosRepetidos = ""; //inicializa variável para apresentar números repetidos

        for (int i = 0; i < numeros.length; i++) { // percorre o array de números
            for (int j = i + 1; j < numeros.length; j++) { // percorre o array de números a partir da próxima posição de i, ou seja, o j inicia na posição i + 1
                if(numeros[i] == numeros[j]) { // verifica se o número na posição i é igual ao número da posição j
                    elementosRepetidos = elementosRepetidos + numeros[j] + " "; // caso for verdadeiro, concatena o valor de número na posição j na variável elementosRepetidos
                }
            }

            elementosDoArray = elementosDoArray + numeros[i] + " "; // concatena o valor de número na posição i na variável elementosDoArray para apresentar todos os valores do elemento
        }

        System.out.println("Todos elementos: "  + elementosDoArray); // apresenta todos elementos
        System.out.println("Elementos repetidos: " + elementosRepetidos); // apresenta elementos repetidos
    }

}
