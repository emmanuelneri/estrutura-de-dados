package br.com.emmanuelneri.arrays;

public class ProblemaNotasAlunosOtimizado {

    public static void main(String args[]) {

        int[][] notasAlunos = {
                {70, 90, 100, 95},
                {100, 100, 100, 100},
                {95, 65, 75, 100},
                {60, 70, 60, 60},
                {98, 99, 100, 100},
        };

        imprimirNotas(notasAlunos);
    }

    private static void imprimirNotas(int[][] notasAlunos) {
        for(int i = 0; i < notasAlunos.length; i++) {
            final StringBuilder notas = new StringBuilder();
            for(int j = 0; j < notasAlunos[i].length; j++) {
                notas.append(notasAlunos[i][j]).append(" ");
            }

            System.out.println("Aluno" + i + ": notas: " + notas);
        }
    }

}
