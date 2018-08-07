package br.com.emmanuelneri.arrays;

import java.util.Arrays;

//Armazenar 4 notas de 5 alunos e apresentar as notas
public class ProblemaNotasAlunos {

    public static void main(String args[]) {

        int[][] notasAlunos = new int[5][4];
        notasAlunos[0][0] = 70;
        notasAlunos[0][1] = 90;
        notasAlunos[0][2] = 100;
        notasAlunos[0][3] = 95;

        notasAlunos[1][0] = 100;
        notasAlunos[1][1] = 100;
        notasAlunos[1][2] = 100;
        notasAlunos[1][3] = 100;

        notasAlunos[2][0] = 95;
        notasAlunos[2][1] = 65;
        notasAlunos[2][2] = 75;
        notasAlunos[2][3] = 100;

        notasAlunos[3][0] = 60;
        notasAlunos[3][1] = 70;
        notasAlunos[3][2] = 60;
        notasAlunos[3][3] = 60;

        notasAlunos[4][0] = 98;
        notasAlunos[4][1] = 99;
        notasAlunos[4][2] = 100;
        notasAlunos[4][3] = 100;

        for(int i = 0; i < 5; i++) {
            String notas = "";
            for(int j = 0; j < 4; j++) {
                notas = notas + notasAlunos[i][j] + " ";
            }

            System.out.println("Aluno " + i + ": notas: " + notas);
        }
    }

}
