package br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao;

import org.junit.Assert;
import org.junit.Test;

public class ListaEncadeadaApenasPrimeiroTest {

    @Test
    public void deveInserir3ElementosNoInicio() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoInicio(1);
        listaEncadeada.inserirNoInicio(2);
        listaEncadeada.inserirNoInicio(3);

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(3, primeiro.getElemento());

        final NoEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(2, segundo.getElemento());

        final NoEncadeado terceiro = segundo.getProximo();
        Assert.assertEquals(1, terceiro.getElemento());
        Assert.assertNull(terceiro.getProximo());

        Assert.assertEquals(3, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveInserir3ElementosNoFinal() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoFinal(1);
        listaEncadeada.inserirNoFinal(2);
        listaEncadeada.inserirNoFinal(3);

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());

        final NoEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(2, segundo.getElemento());

        final NoEncadeado terceiro = segundo.getProximo();
        Assert.assertEquals(3, terceiro.getElemento());
        Assert.assertNull(terceiro.getProximo());

        Assert.assertEquals(3, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void inserirPorPosicaoDeveSubstituirOValorDaPosicaoInseriadaParaProximoEInserirValorInformadoNaPosicaoInformada() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNaPosicao(0, 1);
        listaEncadeada.inserirNaPosicao(1, 2);
        listaEncadeada.inserirNaPosicao(1, 10);

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());

        final NoEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(10, segundo.getElemento());

        Assert.assertEquals(2, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarErroAoInserirElementoEmPosicaoInexistenteNaLista() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();
        listaEncadeada.inserirNaPosicao(1, 1);
        listaEncadeada.inserirNaPosicao(10, 2);
    }

    @Test
    public void deveRemover2ElementosDoInicioEmUmaListaDe3Elementos() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoInicio(3);
        listaEncadeada.inserirNoInicio(2);
        listaEncadeada.inserirNoInicio(1);

        listaEncadeada.removerNoInicio();
        listaEncadeada.removerNoInicio();

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(3, primeiro.getElemento());


        Assert.assertEquals(1, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemover2ElementosDoFinalEmUmaListaDe3Elementos() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoFinal(1);
        listaEncadeada.inserirNoFinal(2);
        listaEncadeada.inserirNoFinal(3);

        listaEncadeada.removerNoFinal();
        listaEncadeada.removerNoFinal();

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());

        Assert.assertEquals(1, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemoverUmElementoPorPosicaoEmUmaListaDe3Elementos() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoInicio(3);
        listaEncadeada.inserirNoInicio(2);
        listaEncadeada.inserirNoInicio(1);

        listaEncadeada.removerNaPosicao(1);

        final NoEncadeado primeiro = listaEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());

        final NoEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(3, segundo.getElemento());

        Assert.assertEquals(2, listaEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveBuscarElementosPorPosicao() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoInicio(3);
        listaEncadeada.inserirNoInicio(2);
        listaEncadeada.inserirNoInicio(1);

        Assert.assertEquals(1, listaEncadeada.buscarNoNaPosicao(0).getElemento());
        Assert.assertEquals(2, listaEncadeada.buscarNoNaPosicao(1).getElemento());
        Assert.assertEquals(3, listaEncadeada.buscarNoNaPosicao(2).getElemento());
    }

    @Test
    public void deveImprimir4() {
        final ListaEncadeadaApenasPrimeiro listaEncadeada = new ListaEncadeadaApenasPrimeiro();

        listaEncadeada.inserirNoInicio(1);
        listaEncadeada.inserirNoInicio(2);
        listaEncadeada.inserirNoFinal(3);
        listaEncadeada.inserirNaPosicao(2, 4);
        listaEncadeada.inserirNaPosicao(3, 5);

        listaEncadeada.removerNoInicio();
        listaEncadeada.removerNaPosicao(1);
        listaEncadeada.removerNoFinal();

        Assert.assertEquals("[1]", listaEncadeada.retornarElementos());
    }

}
