package br.com.emmanuelneri.filas.dinamica.implementacao;

import br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao.NoEncadeado;

/**
 * Implementação da estrutura de dados Fila, implementada com lista encadeada
 */
public class FilaListaEncadeada {

    private NoEncadeado primeiro = null;
    private NoEncadeado ultimo = null;
    private int quantidade;

    public void enfileirar(int elemento) {
        NoEncadeado no = new NoEncadeado();
        no.setElemento(elemento);
        no.setProximo(null);

        if(quantidade == 0) {
           primeiro = no;
           ultimo = no;
        } else {
            ultimo.setProximo(no);
            ultimo = no;
        }

        quantidade++;
    }

    public void desenfileirar() {
        if(estaVazia()) {
            return;
        }

        primeiro = primeiro.getProximo();
        quantidade--;

        if(quantidade == 0) {
            ultimo = null;
        }
    }


    public int retornarQuantidadeDeElementos() {
        return quantidade;
    }


    public Integer proximo() {
        if(quantidade == 0) {
            return null;
        }

        return primeiro.getElemento();
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public String imprimir() {
        if(quantidade == 0) {
            String vazio = "[]";
            System.out.println(vazio);
            return vazio;
        }

        StringBuilder elementos = new StringBuilder("[");

        NoEncadeado atual = primeiro;

        while (atual.getProximo() != null) {
            elementos.append(atual.getElemento());
            elementos.append(" ");
            atual = atual.getProximo();
        }

        elementos.append(atual.getElemento());
        elementos.append("]");

        System.out.println(elementos.toString());

        return elementos.toString();
    }

    public NoEncadeado getPrimeiro() {
        return primeiro;
    }

    public NoEncadeado getUltimo() {
        return ultimo;
    }
}
