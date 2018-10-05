package br.com.emmanuelneri.pilhas;

import java.util.Arrays;

// Empilhar (inserir) elementos da pilha com validação para não ultrapassar o limite de itens da pilha
public class EmpilharComValidacaoNaPilha {

    public static void main(String args[]) {

        String[] pilha = new String[10]; // Cria um array de 10 posições
        Integer topo = 0;// inicializa variável com a posição topo da pilha, iniciando com nulo

        topo = empilhar(pilha, topo, "A"); // empilha elemento A / topo = 0
        topo = empilhar(pilha, topo, "B"); // empilha elemento B / topo = 1
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 2
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 3
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 4
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 5
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 6
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 7
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 8
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 9
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 10

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [java.lang.RuntimeException: Tamanho máximo da pilha atingido
    }

    // Método genérico para empilhar elemento na pilha de acordo com o topo
    public static int empilhar(String[] pilha, Integer topo, String elemento) {
        if(topo == null) { // verifica se tem algum elemento no topo da linha
            topo = 0; // caso verdadeiro, inicializa topo com posição zero
        } else {
            topo = topo + 1; // caso falso, topo recebe o topo mais um
        }

        if(topo >= pilha.length) { // verifica se o topo é maior ou igual o tamanho da pilha
            throw new RuntimeException("Tamanho máximo da pilha atingido"); // caso for verdadeiro, retornar uma mensagem que o tamanho máximos da pilha foi atingido
        }

        pilha[topo] = elemento; // inserer elemento no topo da pilha
        return topo; // retorna posição do topo
    }

}
