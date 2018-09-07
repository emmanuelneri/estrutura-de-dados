package br.com.emmanuelneri.pilhas;

import java.util.Arrays;

public class DesempilharNaPilha {

    public static void main(String args[]) {

        String[] pilha = {"A", "B", "C", "D", "E"}; // Cria um array de 10 posições com os valores A, B, C, D e E
        int topo = pilha.length - 1;// inicializa variável com a posição topo da pilha, iniciando com a última posição do array

        topo = desempilhar(pilha, topo); // remove E / topo = 4
        topo = desempilhar(pilha, topo); // remove D / topo = 3
        topo = desempilhar(pilha, topo); // remove C / topo = 2

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [A, B, null, null, null]
    }

    // Método genérico para desempilhar elemento na pilha de acordo com o topo
    public static int desempilhar(String[] pilha, int topo) {
        pilha[topo] = null; // remove elemento do topo da pilha
        return topo - 1; // conta menos um na posição do topo
    }

}
