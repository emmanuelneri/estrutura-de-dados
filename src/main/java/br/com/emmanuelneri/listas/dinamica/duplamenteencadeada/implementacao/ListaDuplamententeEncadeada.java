package br.com.emmanuelneri.listas.dinamica.duplamenteencadeada.implementacao;

public class ListaDuplamententeEncadeada {

    private NoDuplamenteEncadeado primeiro = null;
    private NoDuplamenteEncadeado ultimo = null;
    private int quantidade = 0;

    public void inserirNoInicio(int elemento) {
        NoDuplamenteEncadeado no = new NoDuplamenteEncadeado();
        no.setElemento(elemento);

        if(quantidade == 0) {
            primeiro = no;
            ultimo = no;
        } else {
            no.setProximo(primeiro);
            primeiro.setAnterior(no);
            primeiro = no;
        }

        quantidade++;
    }

    public void inserirNoFinal(int elemento) {
        if(quantidade == 0) {
            inserirNoInicio(elemento);
        } else {
            NoDuplamenteEncadeado no = new NoDuplamenteEncadeado();
            no.setElemento(elemento);
            ultimo.setProximo(no);
            no.setAnterior(ultimo);
            ultimo = no;
            quantidade++;
        }
    }

    /**
     * Insere elemento na posição, substituindo elemento atual
     *
     * @param posicao
     * @param elemento
     */
    public void inserirNaPosicao(int posicao, int elemento) {
        if (quantidade == 0) {
            inserirNoInicio(elemento);
        } else if(posicao == quantidade) {
            inserirNoFinal(elemento);
        } else {
            NoDuplamenteEncadeado noNaPosicao = buscarNoNaPosicao(posicao);
            noNaPosicao.setElemento(elemento);
        }
    }


    public void removerNoInicio() {
        if(quantidade == 0) {
            return;
        }

        primeiro = primeiro.getProximo();
        primeiro.setAnterior(null);
        quantidade--;

        if(quantidade == 0) {
            ultimo = null;
        }
    }

    public void removerNoFinal() {
        if(quantidade == 0) {
            return;
        }

        if(quantidade == 1) {
            removerNoInicio();
        } else {
            NoDuplamenteEncadeado anterior = ultimo.getAnterior();
            anterior.setProximo(null);
            ultimo = anterior;
            quantidade--;
        }
    }

    public void removerNaPosicao(int posicao) {
        if (quantidade == 0) {
            removerNoInicio();
        } else if(posicao == quantidade) {
            removerNoFinal();
        } else {
            NoDuplamenteEncadeado noNaPosicaoAtual = buscarNoNaPosicao(posicao);
            NoDuplamenteEncadeado noNaPosicaoAnterior = noNaPosicaoAtual.getAnterior();

            NoDuplamenteEncadeado proximo = noNaPosicaoAtual.getProximo();
            if(proximo != null) {
                noNaPosicaoAnterior.setProximo(proximo);
                proximo.setAnterior(noNaPosicaoAnterior);
            } else {
                noNaPosicaoAnterior.setProximo(null);
                ultimo = noNaPosicaoAnterior;
            }


            quantidade--;
        }
    }

    public NoDuplamenteEncadeado buscarNoNaPosicao(int posicao) {
        if(!existeElementoNaPosicao(posicao)) {
            throw new RuntimeException("Posição não existente");
        }

        NoDuplamenteEncadeado atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    private boolean existeElementoNaPosicao(int posicao){
        return posicao >= 0 && posicao < quantidade;
    }

    public int retornarQuantidadeDeElementos() {
        return quantidade;
    }

    public void imprimir() {
        if(quantidade == 0) {
            System.out.println("[ ]");
            return;
        }

        String elementos = retornarElementos();
        System.out.println(elementos.toString());
    }

    String retornarElementos() {
        StringBuilder elementos = new StringBuilder("[");

        NoDuplamenteEncadeado atual = primeiro;

        while (atual.getProximo() != null) {
            elementos.append(atual.getElemento());
            elementos.append(" ");
            atual = atual.getProximo();
        }

        elementos.append(ultimo.getElemento());

        elementos.append("]");
        return elementos.toString();
    }

    public NoDuplamenteEncadeado getPrimeiro() {
        return primeiro;
    }

    public NoDuplamenteEncadeado getUltimo() {
        return ultimo;
    }
}
