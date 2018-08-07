package br.com.emmanuelneri.arrays;

// Armazenar 5 números e apresentar o maior
public class ProblemaMaiorNumero {

    public static void main(String args[]) {

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 5;
        numeros[3] = 1;

        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
           if(numeros[i] > maior) {
               maior = numeros[i];
           }
        }

        System.out.println("Maior: " + maior);
    }
}
