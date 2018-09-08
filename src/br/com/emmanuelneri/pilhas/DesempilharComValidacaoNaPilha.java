package br.com.emmanuelneri.pilhas;

import java.util.Arrays;

// Desempilhar (remover) elementos da pilha com validação quando a pilha estiver vazia
public class DesempilharComValidacaoNaPilha {

    public static void main(String args[]) {

        String[] pilha = {"A", "B", "C", "D", "E"}; // Cria um array de 10 posições com os valores A, B, C, D e E
        Integer topo = pilha.length - 1;// inicializa variável com a posição topo da pilha, iniciando com a última posição do array

        topo = desempilhar(pilha, topo); // remove E / topo = 4
        topo = desempilhar(pilha, topo); // remove D / topo = 3
        topo = desempilhar(pilha, topo); // remove C / topo = 2
        topo = desempilhar(pilha, topo); // remove B / topo = 1
        topo = desempilhar(pilha, topo); // remove A / topo = 0
        topo = desempilhar(pilha, topo); // não remove nada / topo = 0
        topo = desempilhar(pilha, topo); // não remove nada / topo = 0

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [null, null, null, null, null]
    }

    // Método genérico para desempilhar elemento na pilha de acordo com o topo
    public static Integer desempilhar(String[] pilha, Integer topo) {
        if(topo == null) { // verifica se o topo está nulo
            return null; // caso verdadeiro, returno nulo e não faz nada, porque não há elementos para desempilhar
        }

        pilha[topo] = null; // remove elemento do topo da pilha

        if(topo > 0) { // verifica se a posição topo é maior que zero
            topo = topo - 1; // caso verdadeiro, topo recebe o topo menos um
        } else {
            topo = null; // caso falso, topo recebe nulo para sinalizar que a pilha está vazia
        }

        return topo; // retorna posição do topo
    }

}
