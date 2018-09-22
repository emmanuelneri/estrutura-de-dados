package br.com.emmanuelneri.pilhas.implementacao;

/**
 * Implementação da estrutura de dados Lista
 */
public class Pilha {

    /**
     * Array para armazenar os elementos da elementos
     */
    private Integer[] elementos = new Integer[10];

    /**
     * Variável para controlar o topo da pilha
     * Obs: iniciado com nulo
     */
    private Integer topo = null;

    /**
     *  Método para inserir um elemento na pilha
     *  Obs: O elemento sempre é inserido no topo da pilha
     *  Obs2: Caso o tamanho da pilha for atigindo, será lançando uma RuntimeException
     *
     * @param elemento: valor a ser inserido na pilha
     */
    public void empilhar(Integer elemento) {
        if(estaCheia()) {
            return;
        }

        if (topo == null) {
            topo = 0;
        }  else {
            topo = topo + 1;
        }

        elementos[topo] = elemento;
    }

    /**
     * Método para remover um elemento da pilha
     * Obs: O elemento removido sempre é o do topo da pilha
     * Obs2: Caso a pilha estiver vazia, será retornado null
     *
     * @return: retorna o elemento removido
     */
    public Integer desempilhar() {
        if(estaVazia()) {
            return null;
        }

        Integer elementoDesempilhado = elementos[topo];
        elementos[topo] = null;

        if(topo > 0) {
            topo = topo - 1;
        } else {
            topo = null;
        }

        return elementoDesempilhado;
    }

    /**
     * Método para retornar a quantidade de elementos da pilha
     *
     * @return: retorna a quantidade de elementos da pilha
     */
    public int retornarQuantidadeDeElementos() {
        if(topo == null) {
            return 0;
        }

        return topo + 1;
    }

    /**
     * Método para retornar o elemento do topo da pilha
     *
     * @return: retorna o elemento do topo da pilha
     */
    public Integer topo() {
        return elementos[topo];
    }

    /**
     * Método para verificar se a pilha está cheia
     *
     * @return verdadeiro se a posição do topo tiver o tamanho da quantidade de elementos da pilha
     */
    public boolean estaCheia() {
        if(topo == null) {
            return false;
        }

        return topo == elementos.length - 1;
    }

    /**
     * Método para verificar se a pilha está vazia
     *
     * @return verdadeiro se o topo for nulo, consequentemente a pilha está vazia
     */
    public boolean estaVazia() {
        return topo == null;
    }

    /**
     * Método para imprimir elementos do pilha
     *
     * Obs: apenas elementos diferentes de nulos serão apresentados
     */
    public void imprimir() {
        String elementos = "[ ";

        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                elementos = elementos + this.elementos[i] + " ";
            }
        }

        elementos = elementos + "]";

        System.out.println(elementos);
    }
}
