package br.com.emmanuelneri.arrays;

public class ErroAcessoArray {

    public static void main(String args[]) {

        int[] numeros = new int[10]; // Cria array de 10 posições do tipo inteiro

        System.out.println(numeros[10]); // Tenta acessar a posição 10 do array

        // O Resultado é ArrayIndexOutOfBoundsException: 10
        // Porque a array começa na posição 0 e sua última posição é 9
    }

}
