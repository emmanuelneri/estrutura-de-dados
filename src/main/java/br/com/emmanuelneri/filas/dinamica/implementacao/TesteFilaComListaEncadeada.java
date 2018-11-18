package br.com.emmanuelneri.filas.dinamica.implementacao;

// Classe com objetivo de testar a implementação de fila
public class TesteFilaComListaEncadeada {

    public static void main(String args[]) {

        FilaListaEncadeada fila = new FilaListaEncadeada();

        System.out.println("FilaListaEncadeada está vazia? " + fila.estaVazia());

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);

        fila.desenfileirar();
        fila.desenfileirar();

        System.out.println("Próximo da fila: " + fila.proximo());
        System.out.println("Quantidade de elementos da fila: " + fila.retornarQuantidadeDeElementos());

        fila.imprimir();
    }

}
