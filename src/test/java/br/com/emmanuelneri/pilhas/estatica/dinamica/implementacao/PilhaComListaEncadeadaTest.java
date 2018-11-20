package br.com.emmanuelneri.pilhas.estatica.dinamica.implementacao;

import br.com.emmanuelneri.pilhas.dinamica.implementacao.PilhaComListaEncadeada;
import br.com.emmanuelneri.pilhas.estatica.implementacao.Pilha;
import org.junit.Assert;
import org.junit.Test;

public class PilhaComListaEncadeadaTest {

    @Test
    public void deveInserir3Elementos() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        Assert.assertEquals("[10 20 30]", pilha.imprimir());
        Assert.assertEquals(3, pilha.retornarQuantidadeDeElementos());
        Assert.assertNull(pilha.getUltimo().getProximo());
        Assert.assertNotNull(pilha.getUltimo().getAnterior());
        Assert.assertEquals(Integer.valueOf(20), Integer.valueOf(pilha.getUltimo().getAnterior().getElemento()));
    }

    @Test
    public void deveRemover2ElementosDeUmaPilhaDe3Elementos() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.desempilhar();
        pilha.desempilhar();

        Assert.assertEquals("[10]", pilha.imprimir());
        Assert.assertEquals(1, pilha.retornarQuantidadeDeElementos());
        Assert.assertNotNull(pilha.getUltimo());
        Assert.assertNull(pilha.getUltimo().getAnterior());
        Assert.assertNull(pilha.getUltimo().getProximo());
    }

    @Test
    public void deveRemover3ElementosDeUmaPilhaDe3Elementos() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();

        Assert.assertEquals("[]", pilha.imprimir());
        Assert.assertEquals(0, pilha.retornarQuantidadeDeElementos());
        Assert.assertNull(pilha.getUltimo());
    }

    @Test
    public void naoDeveLancarErroAoDesempilharEmUmaFilaVazia() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        pilha.desempilhar();

        Assert.assertEquals(0, pilha.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRetornarOProximoValorASerDesempilhado() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        pilha.empilhar(10);

        Assert.assertEquals(Integer.valueOf(10), pilha.topo());
    }

    @Test
    public void naoDeveLancarErroAoRetornarOTopoEmUmaPilhaVazia() {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        Assert.assertNull(pilha.topo());
    }

}
