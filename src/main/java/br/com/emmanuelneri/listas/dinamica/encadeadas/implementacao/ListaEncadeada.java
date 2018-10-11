package br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao;

public class ListaEncadeada {

    private NoEncadeado primeiro = null;
    private NoEncadeado ultimo = null;
    private int quantidade = 0;

    public void inserirNoInicio(int elemento) {
        NoEncadeado no = new NoEncadeado();
        no.setElemento(elemento);
        no.setProximo(primeiro);

        primeiro = no;

        if(quantidade == 0) {
            ultimo = primeiro;
        }

        quantidade++;
    }

    public void inserirNoFinal(int elemento) {
        if(quantidade == 0) {
            inserirNoInicio(elemento);
        } else {
            NoEncadeado no = new NoEncadeado();
            no.setElemento(elemento);
            no.setProximo(null);
            ultimo.setProximo(no);
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
            NoEncadeado noNaPosicao = buscarNoNaPosicao(posicao);
            noNaPosicao.setElemento(elemento);
        }
    }

    public void removerNoInicio() {
        if(quantidade == 0) {
            return;
        }

        primeiro = primeiro.getProximo();
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
        }

        NoEncadeado noNaPosicaoAnterior = buscarNoNaPosicao(quantidade - 2);
        noNaPosicaoAnterior.setProximo(null);

        ultimo = noNaPosicaoAnterior;
        quantidade--;
    }

    public void removerNaPosicao(int posicao) {
        if (quantidade == 0) {
            removerNoInicio();
        } else if(posicao == quantidade) {
            removerNoFinal();
        } else {
            NoEncadeado noNaPosicaoAnterior = buscarNoNaPosicao(posicao - 1);
            NoEncadeado noNaPosicaoAtual = noNaPosicaoAnterior.getProximo();

            if(noNaPosicaoAtual.getProximo() != null) {
                noNaPosicaoAnterior.setProximo(noNaPosicaoAtual.getProximo());
            } else {
                noNaPosicaoAnterior.setProximo(null);
                ultimo = noNaPosicaoAnterior;
            }


            quantidade--;
        }
    }

    public NoEncadeado buscarNoNaPosicao(int posicao) {
        if(!existeElementoNaPosicao(posicao)) {
            throw new RuntimeException("Posição não existente");
        }

        NoEncadeado atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public Integer retonarElementoPorPosicao(int posicao) {
        return buscarNoNaPosicao(posicao).getElemento();
    }

    public int retornarQuantidadeDeElementos() {
        return quantidade;
    }

    private boolean existeElementoNaPosicao(int posicao){
        return posicao >= 0 && posicao < quantidade;
    }

    public void imprimir() {
        if(quantidade == 0) {
            System.out.println("[]");
            return;
        }

        String elementos = retornarElementos();
        System.out.println(elementos);
    }

    String retornarElementos() {
        StringBuilder elementos = new StringBuilder("[");

        NoEncadeado atual = primeiro;

        while (atual.getProximo() != null) {
            elementos.append(atual.getElemento());
            elementos.append(" ");
            atual = atual.getProximo();
        }

        elementos.append(ultimo.getElemento());

        elementos.append("]");

        return elementos.toString();
    }

    public NoEncadeado getPrimeiro() {
        return primeiro;
    }

    public NoEncadeado getUltimo() {
        return ultimo;
    }
}
