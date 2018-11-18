package br.com.emmanuelneri.pilhas.dinamica.implementacao;

import br.com.emmanuelneri.pilhas.estatica.implementacao.Pilha;

public class TestePilhaComListaEncadeada {

    public static void main(String args[]) {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        Integer desempilhar1 = pilha.desempilhar();

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6);
        pilha.empilhar(7);
        pilha.empilhar(8);
        pilha.empilhar(9);
        pilha.empilhar(10);

        pilha.empilhar(pilha.topo());

        pilha.desempilhar();
        pilha.desempilhar();

        System.out.println("Apresentar o topo da pilha: " + pilha.topo());
        System.out.println("Quantidade de elementos: " + pilha.retornarQuantidadeDeElementos());

        pilha.imprimir();
    }


}
