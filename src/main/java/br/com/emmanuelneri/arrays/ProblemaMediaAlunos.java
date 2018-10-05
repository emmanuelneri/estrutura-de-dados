package br.com.emmanuelneri.arrays;

//•
//Armazenar 4 notas de 10 alunos e apresentar as 4 notas, a média e o se aluno passou de ano(nota superior ou igual a 60).
public class ProblemaMediaAlunos {

    public static void main(String args[]) {

        int[][] notasAlunos = { // inicializando array bidimensional de 10x4
                {70, 90, 100, 95},
                {100, 100, 100, 100},
                {95, 65, 75, 100},
                {50, 70, 50, 60},
                {98, 99, 100, 100},
                {60, 60, 60, 60},
                {60, 60, 30, 50},
                {20, 30, 100, 100},
                {100, 95, 70, 93},
                {55, 65, 70, 55},
        };

        imprimirNotas(notasAlunos); //imprime as notas
    }

    // Método genérico que recebe uma array bidimensional com as notas por aluno
    private static void imprimirNotas(int[][] notasAlunos) {
        for(int i = 0; i < notasAlunos.length; i++) { // percorre os alunos da estutura de notasAlunos

            String notas = ""; // inicializa a variavel para apresentar as notas
            int quantidadeDeNotas = notasAlunos[i].length;  // inicializa a variavel com a quantidade de notas do aluno
            int totalNotas = 0; // inicializa o total de notas do aluno

            for(int j = 0; j < quantidadeDeNotas; j++) { // percorre as notas dos alunos, da posição zero até a quantidade de notas
                totalNotas += notasAlunos[i][j]; // soma o valor da nota do aluno (valor da linha i na coluna j)
                notas = notas + notasAlunos[i][j] + " "; // concatena a nota do aluno (valor da linha i na coluna j)
            }

            int media = totalNotas / quantidadeDeNotas; // atribui o resultado a divisão de total das notas pela quantidade de notas do ano na variável media
            String passou = "Não"; // inicializa a variável passou como não, ou seja, por padrão o aluno não passou porque não foi verificado a média

            if(media >= 60) { // verifica se média do aluno é maior ou igual a 60
                passou = "Sim"; // caso verdadeiro, atribui o texto Sim para para variável passou
            }

            System.out.println("Aluno " + i + ": notas: " + notas + " | média: " + media + " | passou de ano: " + passou); // apresenta a posição do aluno, suas notas, sua média e se passou de ano
        }
    }

}
