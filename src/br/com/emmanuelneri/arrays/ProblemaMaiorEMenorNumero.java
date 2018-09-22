package br.com.emmanuelneri.arrays;

// Armazenar 10 números reais e apresentar o maior e o menor.
public class ProblemaMaiorEMenorNumero {

    public static void main(String args[]) {

        int[] numeros = {15, 1, 10, 20, 0, -1, 60, 9, 10, 2}; // inicializando array com 10 números

        int maior = numeros[0]; // inicializa a variável maior com a primeira posição do array
        int menor = numeros[0]; // inicializa a variável maior com a primeira posição do array

        for(int i = 0; i < numeros.length; i++) {  // percorre o array de número
           if(numeros[i] > maior) {  // verifica se o número na posição i é maior que o valor da variável maior
               maior = numeros[i]; // caso for verdadeiro, atribui o número da posição i na variável maior
           }

            if(numeros[i] < menor) {  // verifica se o número na posição i é maior que o valor da variável maior
                menor = numeros[i]; // caso for verdadeiro, atribui o número da posição i na variável maior
            }
        }

        System.out.println("Maior: " + maior);  // Imprime o valor da variável maior, que é 60
        System.out.println("Menor: " + menor);  // Imprime o valor da variável menor, que é -1
    }
}
