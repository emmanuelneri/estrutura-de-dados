package br.com.emmanuelneri.arrays;

// Armazenar 5 números e apresentar o maior
public class ProblemaMaiorNumero {

    public static void main(String args[]) {

        int[] numeros = new int[5]; // Cria array de 5 posições do tipo inteiro

        numeros[0] = 10; // insere o número 10 na posição 0
        numeros[1] = 30; // insere o número 30 na posição 1
        numeros[2] = 5; // insere o número 5 na posição 2
        numeros[3] = 2; // insere o número 2 na posição 3
        numeros[4] = 3; // insere o número 3 na posição 4

        int maior = numeros[0]; // inicializa a variável maior com a primeira posição do array

        for(int i = 0; i < numeros.length; i++) {  // percorre o array de número
           if(numeros[i] > maior) {  // verifica se o valor na posição i é maior que o número da variável maior
               maior = numeros[i]; // caso for verdadeiro, atribui o valor da posição i na variável maior
           }
        }

        // Imprime o valor da variável maior, que é 30
        System.out.println("Maior: " + maior);
    }
}
