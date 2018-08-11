package br.com.emmanuelneri.arrays;

//Armazenar 4 notas de 5 alunos e apresentar as notas
public class ProblemaNotasAlunosOtimizado {

    public static void main(String args[]) {

        int[][] notasAlunos = { // Cria array bidimensional
                {70, 90, 100, 95}, // atribui os valores nas colunas 0,1,2,3 da linha 0
                {100, 100, 100, 100}, // atribui os valores nas colunas 0,1,2,3 da linha 1
                {95, 65, 75, 100}, // atribui os valores nas colunas 0,1,2,3 da linha 2
                {60, 70, 60, 60}, // atribui os valores nas colunas 0,1,2,3 da linha 3
                {98, 99, 100, 100}, // atribui os valores nas colunas 0,1,2,3 da linha 4
        };

        imprimirNotas(notasAlunos); // Imprime as notas dos alunos
    }

    private static void imprimirNotas(int[][] notasAlunos) {
        for(int i = 0; i < notasAlunos.length; i++) { // percorre as linhas do array de notasAlunos
            String notas = ""; // criar uma variável notas do tipo texto

            for(int j = 0; j < notasAlunos[i].length; j++) { // percorre as colunas da linha na posição i
                notas = notas + notasAlunos[i][j] + " "; // concatena a nota com o valor da linha e coluna nas posições i e j
            }

            System.out.println("Aluno" + i + ": notas: " + notas); // Apresenta o aluno na posição i e suas 4 notas
        }
    }

}
