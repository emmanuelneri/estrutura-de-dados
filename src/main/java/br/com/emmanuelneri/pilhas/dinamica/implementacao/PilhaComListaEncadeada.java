package br.com.emmanuelneri.pilhas.dinamica.implementacao;

import br.com.emmanuelneri.listas.dinamica.duplamenteencadeada.implementacao.NoDuplamenteEncadeado;
import br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao.NoEncadeado;

/**
 * Implementação da estrutura de dados Pilha, implementada com lista encadeada
 */
public class PilhaComListaEncadeada {

    private NoDuplamenteEncadeado ultimo;
    private int quantidade;

    public void empilhar(int elemento) {
        NoDuplamenteEncadeado no = new NoDuplamenteEncadeado();
        no.setElemento(elemento);
        no.setProximo(null);
        no.setAnterior(ultimo);

        if(ultimo != null) {
            ultimo.setProximo(no);
        }

        ultimo = no;
        quantidade++;
    }

    public Integer desempilhar() {
        if(quantidade == 0) {
            return null;
        }

        int valorDesempilhado = ultimo.getElemento();

        ultimo = ultimo.getAnterior();
        quantidade--;

        return valorDesempilhado;
    }

    public int retornarQuantidadeDeElementos() {
        return quantidade;
    }

    public Integer topo() {
        if(quantidade == 0) {
            return null;
        }

        return ultimo.getElemento();
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

        StringBuilder elementos = new StringBuilder();

        NoDuplamenteEncadeado atual = ultimo;

        while (atual.getAnterior() != null) {
            elementos.insert(0, " " + atual.getElemento());
            atual = atual.getAnterior();
        }

        elementos.insert(0, atual.getElemento());
        elementos.insert(0, "[");
        elementos.append("]");


        System.out.println(elementos.toString());
        return elementos.toString();
    }

}
