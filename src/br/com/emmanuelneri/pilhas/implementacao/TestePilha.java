package br.com.emmanuelneri.pilhas.implementacao;

public class TestePilha {

//    public static   void main(String args[]) {
//        Pilha pilha = new Pilha();
//
//        pilha.empilhar(10);
//        pilha.empilhar(20);
//        pilha.empilhar(2);
//        pilha.empilhar(5);
//        pilha.empilhar(pilha.topo());
//
//        pilha.imprimir();
//
//        pilha.desempilhar();
//        pilha.desempilhar();
//        pilha.desempilhar();
//        pilha.desempilhar();
//        pilha.imprimir();
//
//        System.out.println("Pilha vazia: " + pilha.estaVazia());
//        System.out.println("Pilha cheia: " + pilha.estaCheia());
//
//        System.out.println("Quantidade: " + pilha.retornarQuantidadeDeElementos());
//    }

    public static void main(String args[]) {
        Pilha pilha = new Pilha();

        pilha.empilhar(1);
        pilha.empilhar(10);
        pilha.desempilhar();
        pilha.empilhar(pilha.topo());
        pilha.empilhar(pilha.topo());
        pilha.empilhar(10);
        pilha.desempilhar();
        pilha.empilhar(pilha.topo());

        pilha.imprimir();
    }


}
