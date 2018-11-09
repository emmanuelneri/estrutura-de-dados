package br.com.emmanuelneri.java.exercicios;

import java.util.*;

//Armazenar 4 notas de 5 alunos e apresentar as notas utilizando Map
public class ArmazenarIdadeDosAlunosComMap {

    public static void main(String args[]) {

       Map<String, Integer> notasAlunos = new HashMap<>();

        notasAlunos.put("Aluno 1", 17);
        notasAlunos.put("Aluno 2", 20);
        notasAlunos.put("Aluno 3", 35);
        notasAlunos.put("Aluno 4", 21);
        notasAlunos.put("Aluno 5", 22);

        for(String chave : notasAlunos.keySet()) {
            String aluno = chave;
            Integer idade = notasAlunos.get(chave);

            System.out.println("Aluno " + aluno + ": Idade: " + idade);

        }
    }

}
