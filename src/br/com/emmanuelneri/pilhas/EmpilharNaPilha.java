package br.com.emmanuelneri.pilhas;

import java.util.Arrays;

public class EmpilharNaPilha {

    public static void main(String args[]) {

        String[] pilha = new String[10]; // Cria um array de 10 posições
        int topo = 0;// inicializa variável com a posição topo da pilha, iniciando em zero

        topo = empilhar(pilha, topo, "A"); // empilha elemento A / topo = 0
        topo = empilhar(pilha, topo, "B"); // empilha elemento B / topo = 1
        topo = empilhar(pilha, topo, "C"); // empilha elemento B / topo = 2

        System.out.println(Arrays.toString(pilha)); // Apresenta valores do array
        // Resultado: [A, B, C, null, null, null, null, null, null, null]
    }

    // Método genérico para empilhar elemento na pilha de acordo com o topo
    public static int empilhar(String[] pilha, int topo, String elemento) {
        pilha[topo] = elemento; // inserer elemento no topo da pilha
        return topo + 1; // conta mais um na posição do topo
    }

}
