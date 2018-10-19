package br.com.emmanuelneri.filas.estatica.implementacao;

/**
 * Implementação da estrutura de dados Fila
 */
public class Fila {

    /**
     * Array para armazenar os elementos da fila
     */
    private Integer[] elementos = new Integer[10];

    /**
     * Variável para controlar a próxima posição da fila
     * Obs: iniciado com zero
     */
    private int proximaPosicao = 0;

    /**
     *  Método para inserir um elemento na fila
     *  Obs: O elemento sempre é inserido no fim da fila
     *
     * @param elemento: valor a ser inserido na fila
     */
    public void enfileirar(Integer elemento) {
        if(estaCheia()) {
            return;
        }

        elementos[proximaPosicao] = elemento;
        proximaPosicao = proximaPosicao + 1;
    }

    /**
     * Método para remover um elemento da fila
     * Obs: O elemento removido sempre é o primeiro elemento da pilha
     *
     */
    public void desenfileirar() {
        if(estaVazia()) {
            return;
        }

        for (int i = 0; i < elementos.length - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[elementos.length - 1] = null;

        proximaPosicao = proximaPosicao - 1;
    }

    /**
     * Método para retornar a quantidade de elementos da fila
     *
     * @return: retorna a quantidade de elementos da fila
     */
    public int retornarQuantidadeDeElementos() {
        return proximaPosicao;
    }

    /**
     * Método para retornar o próximo elemento da fila
     *
     * @return: retorna o elemento do início da fila
     */
    public int proximo() {
        return elementos[0];
    }

    /**
     * Método para verificar se a fila está cheia
     *
     * @return verdadeiro se a próxima posição for igual ao tamanho a fila
     */
    public boolean estaCheia() {
        return proximaPosicao == elementos.length;
    }

    /**
     * Método para verificar se a fila está vazia
     *
     * @return verdadeiro se a próxima posição for igual a zero
     */
    public boolean estaVazia() {
        return proximaPosicao == 0;
    }

    /**
     * Método para imprimir elementos do fila
     *
     * Obs: apenas elementos diferentes de nulos serão apresentados
     */
    public void imprimir() {
        String texto = "[ ";

        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] != null) {
                texto = texto + elementos[i] + " ";
            }
        }

        texto = texto + "]";

        System.out.println(texto);
    }

}
