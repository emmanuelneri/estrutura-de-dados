package br.com.emmanuelneri.arrays;

import java.util.Arrays;

//Armazenar 4 notas de 5 alunos e apresentar as notas
public class ProblemaNotasAlunos {

    public static void main(String args[]) {

        int[][] notasAlunos = new int[5][4]; // Cria array de 5 x 4 do tipo inteiro

        notasAlunos[0][0] = 70; // insere o número 70 na linha 0 e na coluna 0
        notasAlunos[0][1] = 90; // insere o número 90 na linha 0 e na coluna 1
        notasAlunos[0][2] = 100; // insere o número 100 na linha 0 e na coluna 2
        notasAlunos[0][3] = 95; // insere o número 95 na linha 0 e na coluna 3

        notasAlunos[1][0] = 100; // insere o número 100 na linha 1 e na coluna 0
        notasAlunos[1][1] = 100; // insere o número 100 na linha 1 e na coluna 1
        notasAlunos[1][2] = 100; // insere o número 100 na linha 1 e na coluna 2
        notasAlunos[1][3] = 100; // insere o número 100 na linha 1 e na coluna 3

        notasAlunos[2][0] = 95; // insere o número 95 na linha 2 e na coluna 0
        notasAlunos[2][1] = 65; // insere o número 65 na linha 2 e na coluna 1
        notasAlunos[2][2] = 75; // insere o número 75 na linha 2 e na coluna 2
        notasAlunos[2][3] = 100; // insere o número 100 na linha 2 e na coluna 3

        notasAlunos[3][0] = 60; // insere o número 60 na linha 3 e na coluna 0
        notasAlunos[3][1] = 70; // insere o número 70 na linha 3 e na coluna 1
        notasAlunos[3][2] = 60; // insere o número 60 na linha 3 e na coluna 2
        notasAlunos[3][3] = 60; // insere o número 60 na linha 3 e na coluna 3

        notasAlunos[4][0] = 98; // insere o número 98 na linha 4 e na coluna 0
        notasAlunos[4][1] = 99; // insere o número 99 na linha 4 e na coluna 1
        notasAlunos[4][2] = 100; // insere o número 100 na linha 4 e na coluna 2
        notasAlunos[4][3] = 100; // insere o número 100 na linha 4 e na coluna 3

        for(int i = 0; i < notasAlunos.length; i++) { // percorre as linhas do array de notasAlunos
            String notas = ""; // criar uma variável notas do tipo texto

            for(int j = 0; j < notasAlunos[i].length; j++) { // percorre as colunas da linha na posição i
                notas = notas + notasAlunos[i][j] + " ";  // concatena a nota com o valor da linha e coluna nas posições i e j
            }

            System.out.println("Aluno " + i + ": notas: " + notas); // Apresenta o aluno na posição i e suas 4 notas
        }
    }

}
