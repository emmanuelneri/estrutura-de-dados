package br.com.emmanuelneri.java.exercicios;

import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

//Armazenar 4 notas de 5 alunos e apresentar as notas utilizando Map
public class ProblemaNotasAlunosComMap {

    public static void main(String args[]) {

       Map<String, List<Integer>> notasAlunos = new TreeMap<>();

        notasAlunos.put("Aluno 1", Arrays.asList(70, 90, 100, 95));
        notasAlunos.put("Aluno 2", Arrays.asList(100, 100, 100, 100));
        notasAlunos.put("Aluno 3", Arrays.asList(95, 65, 100, 100));
        notasAlunos.put("Aluno 4", Arrays.asList(98, 99, 60, 95));
        notasAlunos.put("Aluno 5", Arrays.asList(60, 70, 100, 60));

        for(Map.Entry<String, List<Integer>> entry : notasAlunos.entrySet()) {
            StringBuilder notas = new StringBuilder();

            for(Integer nota : entry.getValue()) {
                notas.append(nota);
                notas.append(" ");
            }
            System.out.println("Aluno " + entry.getKey() + ": notas: " + notas);

        }
    }

}
