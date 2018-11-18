package br.com.emmanuelneri.arvores.implementacao;

import java.util.List;

public class NoArvore {

    private String valor;
    private NoArvore pai;
    private List<NoArvore> filhos;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NoArvore getPai() {
        return pai;
    }

    public void setPai(NoArvore pai) {
        this.pai = pai;
    }

    public List<NoArvore> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<NoArvore> filhos) {
        this.filhos = filhos;
    }
}
