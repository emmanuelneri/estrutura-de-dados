package br.com.emmanuelneri.pilhas.estatica;

import java.util.Arrays;

// Desempilhar (remover) elementos da pilha
public class DesempilharNaPilha {

    public static void main(String args[]) {

        String[] pilha = {"A", "B", "C", "D", "E"}; // Cria um array de 10 posições com os valores A, B, C, D e E
        Integer topo = pilha.length - 1;// inicializa variável com a posição topo da pilha, iniciando com a última posição do array

        topo = desempilhar(pilha, topo); // remove E / topo = 4
        topo = desempilhar(pilha, topo); // remove D / topo = 3
        topo = desempilhar(pilha, topo); // remove C / topo = 2

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [A, B, null, null, null]
    }

    // Método genérico para desempilhar elemento na pilha de acordo com o topo
    public static int desempilhar(String[] pilha, Integer topo) {
        pilha[topo] = null; // remove elemento do topo da pilha

        if(topo > 0) { // verifica se a posição topo é maior que zero
            topo = topo - 1; // caso verdadeiro, topo recebe o topo menos um
        } else {
            topo = null; // caso falso, topo recebe nulo para sinalizar que a pilha está vazia
        }

        return topo; // retorna posição do topo
    }

}
