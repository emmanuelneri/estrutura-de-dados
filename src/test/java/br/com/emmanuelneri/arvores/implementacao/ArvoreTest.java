package br.com.emmanuelneri.arvores.implementacao;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArvoreTest {

    @Test
    public void deveCriarUmaArvore() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("RAIZ");

        Assert.assertEquals("RAIZ", raiz.getValor());
        Assert.assertNull(raiz.getPai());
        Assert.assertNull(raiz.getFilhos());
        Assert.assertEquals(1, arvore.retornarQuantidadeDeNos());
        Assert.assertEquals("(RAIZ)", arvore.imprimir().toString());
    }

    @Test
    public void deveCriarUmaArvoreComDoisFilhos() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("RAIZ");

        arvore.inserir(raiz, "FILHO 1");
        arvore.inserir(raiz, "FILHO 2");

        List<NoArvore> filhos = raiz.getFilhos();
        Assert.assertEquals(2, filhos.size());

        NoArvore filho1 = filhos.get(0);
        Assert.assertEquals("FILHO 1", filho1.getValor());
        Assert.assertEquals(raiz, filho1.getPai());
        Assert.assertNull(filho1.getFilhos());

        NoArvore filho2 = filhos.get(1);
        Assert.assertEquals("FILHO 2", filho2.getValor());
        Assert.assertEquals(raiz, filho2.getPai());
        Assert.assertNull(filho2.getFilhos());

        Assert.assertNull(raiz.getPai());
        Assert.assertEquals(3, arvore.retornarQuantidadeDeNos());
        Assert.assertEquals("(RAIZ(FILHO 1)(FILHO 2))", arvore.imprimir().toString());
    }

    @Test
    public void deveRemoverARaizDeUmArvoreSemFilhos() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("RAIZ");

        Assert.assertEquals(1, arvore.retornarQuantidadeDeNos());

        arvore.remover(raiz);

        Assert.assertEquals(0, arvore.retornarQuantidadeDeNos());
        Assert.assertEquals("()", arvore.imprimir().toString());
    }

    @Test
    public void deveRemoverUmNoFilhoDaArvore() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("RAIZ");
        NoArvore filho1 = arvore.inserir(raiz, "FILHO 1");
        NoArvore filho2 = arvore.inserir(raiz, "FILHO 2");

        Assert.assertEquals(3, arvore.retornarQuantidadeDeNos());

        arvore.remover(filho1);

        Assert.assertEquals(2, arvore.retornarQuantidadeDeNos());
        Assert.assertEquals("(RAIZ(FILHO 2))", arvore.imprimir().toString());
    }

    @Test
    public void deveRemoverUmNoPaiDaArvoreEDeslocarSubArvoreParaOPaiDoPai() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");

        NoArvore b1 = arvore.inserir(raiz, "B1");
        arvore.inserir(raiz, "B2");

        NoArvore b11 = arvore.inserir(b1, "B1.1");
        NoArvore b12 = arvore.inserir(b1, "B1.2");

        Assert.assertEquals(b1, b11.getPai());
        Assert.assertEquals(b1, b12.getPai());

        Assert.assertEquals(5, arvore.retornarQuantidadeDeNos());

        arvore.remover(b1);

        NoArvore b11AposRemoverB1 = raiz.getFilhos().get(1);
        Assert.assertEquals("B1.1", b11AposRemoverB1.getValor());
        Assert.assertEquals(raiz, b11AposRemoverB1.getPai());

        NoArvore b12AposRemoverB1 = raiz.getFilhos().get(2);
        Assert.assertEquals("B1.2", b12AposRemoverB1.getValor());
        Assert.assertEquals(raiz, b12AposRemoverB1.getPai());

        Assert.assertEquals(4, arvore.retornarQuantidadeDeNos());
        Assert.assertEquals("(B(B2)(B1.1)(B1.2))", arvore.imprimir().toString());
    }

    @Test
    public void exercicio() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");

        NoArvore b1 = arvore.inserir(raiz, "B1");
        arvore.inserir(raiz, "B2");
        NoArvore b3 = arvore.inserir(raiz, "B3");

        NoArvore b111 = arvore.inserir(b1, "B1.1");
        arvore.inserir(b1, "B1.2");

        arvore.inserir(b3, "B3.1");
        arvore.inserir(b3, "B3.2");
        arvore.inserir(b3, "B3.3");

        arvore.inserir(b111, "B1.1.1");

        Assert.assertEquals("(B(B1(B1.1(B1.1.1))(B1.2))(B2)(B3(B3.1)(B3.2)(B3.3)))", arvore.imprimir().toString());
        Assert.assertEquals(10, arvore.retornarQuantidadeDeNos());
    }

    @Test(expected = RuntimeException.class)
    public void deveRetornarErroAoInserirUmNoEmUmaArvoreSemRaiz() {
        Arvore arvore = new Arvore();
        arvore.inserir(null, "Teste");
    }

    @Test(expected = RuntimeException.class)
    public void deveRetornarErroAoInserirUmNoSemPai() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");
        arvore.inserir(null, "Teste");
    }

    @Test
    public void naoDeveRetornarErroENaoFazerNadaAoRemoverUmNoExistente() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");
        arvore.remover(new NoArvore());
    }

    @Test(expected = RuntimeException.class)
    public void deveRetornarErroAoRemoverUmaRaizComFilhos() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");
        arvore.inserir(raiz, "Teste");
        arvore.remover(raiz);
    }

    @Test
    public void imprimir() {
        Arvore arvore = new Arvore();
        NoArvore raiz = arvore.criarArvore("B");

        NoArvore b1 = arvore.inserir(raiz, "B1");
        NoArvore b2 = arvore.inserir(raiz, "B2");

        arvore.inserir(b1, "B1.1");
        arvore.inserir(b1, "B1.2");

        arvore.inserir(b2, "B2.1");
        arvore.inserir(b2, "B2.2");

        Assert.assertEquals("(B(B1(B1.1)(B1.2))(B2(B2.1)(B2.2)))", arvore.imprimir().toString());
        Assert.assertEquals(7, arvore.retornarQuantidadeDeNos());
    }

}
