package br.com.emmanuelneri.arrays;

import java.util.Arrays;

// Dado um array com 4 números inteiros, apresentar a soma dos números ímpares e também apresentar o maior número informado
public class ProblemaSomarValoresImparesEApresentarMaior {

    public static void main(String args[]) {

        int[] numeros = {9, 10, 20, 3, 11};

        int totalImpares = 0;
        int maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 != 0) {
                totalImpares = totalImpares + numeros[i];
            }

            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println(totalImpares);
        System.out.println(maiorNumero);
    }

}
