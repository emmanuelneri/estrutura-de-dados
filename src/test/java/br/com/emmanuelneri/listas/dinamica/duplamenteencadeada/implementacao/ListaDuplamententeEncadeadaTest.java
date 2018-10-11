package br.com.emmanuelneri.listas.dinamica.duplamenteencadeada.implementacao;

import org.junit.Assert;
import org.junit.Test;

public class ListaDuplamententeEncadeadaTest {

    @Test
    public void deveInserir3ElementosNoInicio() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoInicio(1);
        listaDuplamententeEncadeada.inserirNoInicio(2);
        listaDuplamententeEncadeada.inserirNoInicio(3);

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(3, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());

        final NoDuplamenteEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(2, segundo.getElemento());
        Assert.assertEquals(3, segundo.getAnterior().getElemento());
        Assert.assertEquals(1, segundo.getProximo().getElemento());

        final NoDuplamenteEncadeado terceiro = segundo.getProximo();
        Assert.assertEquals(1, terceiro.getElemento());
        Assert.assertEquals(2, terceiro.getAnterior().getElemento());
        Assert.assertNull(terceiro.getProximo());

        Assert.assertEquals(terceiro, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(3, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveInserir3ElementosNoFinal() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoFinal(1);
        listaDuplamententeEncadeada.inserirNoFinal(2);
        listaDuplamententeEncadeada.inserirNoFinal(3);

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());

        final NoDuplamenteEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(2, segundo.getElemento());
        Assert.assertEquals(1, segundo.getAnterior().getElemento());
        Assert.assertEquals(3, segundo.getProximo().getElemento());

        final NoDuplamenteEncadeado terceiro = segundo.getProximo();
        Assert.assertEquals(3, terceiro.getElemento());
        Assert.assertEquals(2, terceiro.getAnterior().getElemento());
        Assert.assertNull(terceiro.getProximo());

        Assert.assertEquals(terceiro, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(3, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void inserirPorPosicaoDeveSubstituirOValorDaPosicaoInseriadaParaProximoEInserirValorInformadoNaPosicaoInformada() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNaPosicao(0, 1);
        listaDuplamententeEncadeada.inserirNaPosicao(1, 2);
        listaDuplamententeEncadeada.inserirNaPosicao(1, 10);

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());
        Assert.assertEquals(10, primeiro.getProximo().getElemento());

        final NoDuplamenteEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(10, segundo.getElemento());
        Assert.assertEquals(1, segundo.getAnterior().getElemento());
        Assert.assertNull(segundo.getProximo());



        Assert.assertEquals(segundo, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(2, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarErroAoInserirElementoEmPosicaoInexistenteNaLista() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();
        listaDuplamententeEncadeada.inserirNaPosicao(1, 1);
        listaDuplamententeEncadeada.inserirNaPosicao(10, 2);
    }

    @Test
    public void deveRemover2ElementosDoInicioEmUmaListaDe3Elementos() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoInicio(3);
        listaDuplamententeEncadeada.inserirNoInicio(2);
        listaDuplamententeEncadeada.inserirNoInicio(1);

        listaDuplamententeEncadeada.removerNoInicio();
        listaDuplamententeEncadeada.removerNoInicio();

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(3, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());
        Assert.assertNull(primeiro.getProximo());

        Assert.assertEquals(primeiro, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(1, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemover1ElementosDoInicioEmUmaListaDe3Elementos() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoFinal(1);
        listaDuplamententeEncadeada.inserirNoFinal(2);
        listaDuplamententeEncadeada.inserirNoFinal(3);

        listaDuplamententeEncadeada.removerNoInicio();

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(2, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());
        Assert.assertEquals(3, primeiro.getProximo().getElemento());

        final NoDuplamenteEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(3, segundo.getElemento());
        Assert.assertEquals(2, segundo.getAnterior().getElemento());
        Assert.assertNull(segundo.getProximo());

        Assert.assertEquals(segundo, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(2, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemoverUmElementoPorPosicaoEmUmaListaDe3Elementos() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoInicio(3);
        listaDuplamententeEncadeada.inserirNoInicio(2);
        listaDuplamententeEncadeada.inserirNoInicio(1);

        listaDuplamententeEncadeada.removerNaPosicao(1);

        final NoDuplamenteEncadeado primeiro = listaDuplamententeEncadeada.getPrimeiro();
        Assert.assertEquals(1, primeiro.getElemento());
        Assert.assertNull(primeiro.getAnterior());
        Assert.assertEquals(3, primeiro.getProximo().getElemento());

        final NoDuplamenteEncadeado segundo = primeiro.getProximo();
        Assert.assertEquals(3, segundo.getElemento());
        Assert.assertEquals(1, segundo.getAnterior().getElemento());
        Assert.assertNull(segundo.getProximo());

        Assert.assertEquals(segundo, listaDuplamententeEncadeada.getUltimo());
        Assert.assertEquals(2, listaDuplamententeEncadeada.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveBuscarElementosPorPosicao() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoInicio(3);
        listaDuplamententeEncadeada.inserirNoInicio(2);
        listaDuplamententeEncadeada.inserirNoInicio(1);

        Assert.assertEquals(1, listaDuplamententeEncadeada.buscarNoNaPosicao(0).getElemento());
        Assert.assertEquals(2, listaDuplamententeEncadeada.buscarNoNaPosicao(1).getElemento());
        Assert.assertEquals(3, listaDuplamententeEncadeada.buscarNoNaPosicao(2).getElemento());
    }

    @Test
    public void deveImprimir4() {
        final ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

        listaDuplamententeEncadeada.inserirNoInicio(1);
        listaDuplamententeEncadeada.inserirNoInicio(2);
        listaDuplamententeEncadeada.inserirNoFinal(3);
        listaDuplamententeEncadeada.inserirNaPosicao(2, 4);
        listaDuplamententeEncadeada.inserirNaPosicao(3, 5);

        listaDuplamententeEncadeada.removerNoInicio();
        listaDuplamententeEncadeada.removerNaPosicao(1);
        listaDuplamententeEncadeada.removerNoFinal();

        Assert.assertEquals("[1]", listaDuplamententeEncadeada.retornarElementos());
    }


}
