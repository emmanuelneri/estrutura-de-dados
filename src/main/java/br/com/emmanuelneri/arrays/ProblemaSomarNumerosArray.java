package br.com.emmanuelneri.arrays;

//Armazenar 5 números reais, somar todos eles e apresentar o total.
public class ProblemaSomarNumerosArray {

    public static void main(String args[]) {

        double[] numeros = {92, 104, 100.50, 20.25, 20}; // cria um array do tipo double com 5 valores

        double total = 0; // cria uma variável para tomar os números

        for (int i = 0; i < numeros.length; i++) { // percorre o array
            total = total + numeros[i]; // atribui o valor total somado com o valor de números na posição i
        }

        System.out.println("A soma dos números é: " + total); // apresenta o valor da soma
    }

}
