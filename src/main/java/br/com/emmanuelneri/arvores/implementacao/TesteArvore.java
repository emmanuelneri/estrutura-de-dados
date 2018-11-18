package br.com.emmanuelneri.arvores.implementacao;

public class TesteArvore {

    public static void main(String args[]) {

        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");

        NoArvore b1 = arvore.inserir(raiz, "B1");
        NoArvore b2 = arvore.inserir(raiz, "B2");
        NoArvore b3 = arvore.inserir(raiz, "B3");

        NoArvore b11 = arvore.inserir(b1, "B1.1");
        NoArvore b12 = arvore.inserir(b1, "B1.2");

        NoArvore b111 = arvore.inserir(b11, "B1.1.1");

        NoArvore b31 = arvore.inserir(b3, "B3.1");
        NoArvore b32 = arvore.inserir(b3, "B3.2");
        NoArvore b33 = arvore.inserir(b3, "B3.2");

        arvore.imprimir();

    }

}
