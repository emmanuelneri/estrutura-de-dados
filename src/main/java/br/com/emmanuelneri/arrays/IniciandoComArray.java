package br.com.emmanuelneri.arrays;

// Iniciando com array - operações base
public class IniciandoComArray {

    public static void main(String args[]) {

        int[] numeros = new int[10]; // Cria array de 10 posições do tipo inteiro

        numeros[0] = 1; //atribui valor 1 na primeira posição do array (posição 0)
        numeros[1] = 2; //atribui valor 2 na segunda posição do array

        System.out.println(numeros[0]); // apresenta a primeira posição do array
        System.out.println(numeros); // apresenta o endereço de memória do array, ou seja, não apresenta os elementos do array


        for (int i = 0; i < numeros.length; i++) { // percorre o array iniciando da posição 0 até o tamanho do array (de 0 a 9)
            System.out.print(numeros[i] + " "); // apresenta o valor do array na posição i
        }
    }

}
