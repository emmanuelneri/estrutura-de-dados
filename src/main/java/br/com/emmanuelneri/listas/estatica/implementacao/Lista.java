package br.com.emmanuelneri.listas.estatica.implementacao;

/**
 * Implementação da estrutura de dados Lista
 */
public class Lista {

    /**
     * Array para armazenar os elementos da lista
     */
    private Integer[] elementos = new Integer[10];

    /**
     * Método para inserir um elemento na posição
     *
     * @param posicao : Posição a ser inserido o elemento
     * @param elemento : Elemento a ser inserido na posição
     */
    public void inserirPorPosicao(int posicao, Integer elemento) {
        if(estaCheia()) {
            return;
        }

        elementos[posicao] = elemento;
    }

    /**
     * Método para inserir elemento
     * Obs: como não é informado posição o elemento será inserido na primeira posição disponível
     * Obs2: caso a elementos estiver cheia não será feito nada
     *
     * @param elemento : Elemento a ser inserido
     */
    public void inserirPorElemento(Integer elemento) {
        if(estaCheia()) {
            return;
        }

        Integer posicaoDisponivel = null;

        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] == null) {
                posicaoDisponivel = i;
                break;
            }
        }

        elementos[posicaoDisponivel] = elemento;
    }

    /**
     * Método para remover elemento por posição
     * Obs: os valores recebem o valor da posição + 1 (da próxima posição) a partir da posição informada no parâmetro, assim o valor da posição informada deixa de existir
     *
     * @param posicao : posição a ser removido o elemento
     */
    public void removerPorPosicao(int posicao) {
        for(int i = posicao; i < elementos.length - 1; i++) {
            if(elementos[i] != null) {
                elementos[i] = elementos[i + 1];
            }
        }

        elementos[elementos.length - 1] = null;
    }

    /**
     * Método para remover elemento pelo valor do elemento
     * Obs: como não é informado posição o elemento a ser removido será pesquisado por seu valor
     * Obs2: Caso o elemento não for encontrado, nada será feito
     * @param elemento
     */
    public void removerPorElemento(Integer elemento) {
        Integer posicaoDoElemento = null;

        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] != null && elementos[i].equals(elemento)) {
                posicaoDoElemento = i;
                break;
            }
        }

        if(posicaoDoElemento == null) {
            return;
        }

        removerPorPosicao(posicaoDoElemento);
    }

    /**
     * Método para retornar o elemento da posição
     *
     * @param posicao : posição para retornar o valor
     * @return valor da posição informada
     */
    public Integer retornarElemento(int posicao) {
        return elementos[posicao];
    }

    /**
     * Método para retornar a quantidade de elementos da lista, ou seja, elementos diferentes de nulo
     *
     * @return retorna a quantidade de elementos da lista
     */
    public int quantidadeDeElementos() {
        int quantidade = 0;

        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] != null) {
                quantidade++;
            }
        }

        return quantidade;
    }

    /**
     * Método para verificar se a fila está cheia
     *
     * @return verdadeiro se a quantidade de elementos for igual ao tamano da elementos
     */
    public boolean estaCheia() {
        return quantidadeDeElementos() == elementos.length;
    }

    /**
     * Método para verificar se a fila está vazia
     *
     * @return verdadeiro se a quantidade de elementos for igual a zero
     */
    public boolean estaVazia() {
        return quantidadeDeElementos() == 0;
    }

    /**
     * Método para imprimir elementos da lista
     *
     * Obs: apenas elementos diferentes de nulos serão apresentados
     */
    public void imprimir() {
        String elementosDaLista = "[ ";

        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] != null) {
                elementosDaLista = elementosDaLista + elementos[i] + " ";
            }
        }

        elementosDaLista = elementosDaLista + "]";

        System.out.println(elementosDaLista);
    }

}
