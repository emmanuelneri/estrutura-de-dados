package br.com.emmanuelneri.pilhas;

import java.util.Arrays;

// Empilhar (inserir) elementos da pilha
public class EmpilharNaPilha {

    public static void main(String args[]) {

        String[] pilha = new String[10]; // Cria um array de 10 posições
        Integer topo = null;// inicializa variável com a posição topo da pilha, iniciando com nulo

        topo = empilhar(pilha, topo, "A"); // empilha elemento A / topo = 0
        topo = empilhar(pilha, topo, "B"); // empilha elemento B / topo = 1
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 2

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [A, B, C, null, null, null, null, null, null, null]
    }

    // Método genérico para empilhar elemento na pilha de acordo com o topo
    public static int empilhar(String[] pilha, Integer topo, String elemento) {
        if(topo == null) { // verifica se tem algum elemento no topo da linha
            topo = 0; // caso verdadeiro, inicializa topo com posição zero
        } else {
            topo = topo + 1; // caso falso, topo recebe o topo mais um
        }

        pilha[topo] = elemento; // inserer elemento no topo da pilha

        return topo; // retorna posição do topo
    }

}
