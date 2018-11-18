package br.com.emmanuelneri.filas.dinamica.implementacao;

import br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao.ListaEncadeadaApenasPrimeiro;
import br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao.NoEncadeado;
import org.junit.Assert;
import org.junit.Test;

public class FilaListaEncadeadaTest {

    @Test
    public void deveInserir3Elementos() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        Assert.assertEquals("[10 20 30]", fila.imprimir());
        Assert.assertEquals(3, fila.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemover2ElementosDeUmaFilaDe3Elementos() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        fila.desenfileirar();
        fila.desenfileirar();

        Assert.assertEquals("[30]", fila.imprimir());
        Assert.assertEquals(1, fila.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRemover3ElementosDeUmaFilaDe3Elementos() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();

        Assert.assertEquals(0, fila.retornarQuantidadeDeElementos());
    }

    @Test
    public void naoDeveLancarErroAoDesenfileirarEmUmaFilaVazia() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.desenfileirar();

        Assert.assertEquals(0, fila.retornarQuantidadeDeElementos());
    }

    @Test
    public void deveRetornarOProximoValorASerDesenfileirado() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.enfileirar(10);

        Assert.assertEquals(Integer.valueOf(10), fila.proximo());
    }

    @Test
    public void naoDeveLancarErroAoRetornarOProximoEmUmaFilaVazia() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        Assert.assertNull(fila.proximo());
    }

}
