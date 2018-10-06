package br.com.emmanuelneri.listas.dinamica.encadeadas.implementacao;

public class TesteListaEncadeada {

    public static void main(String args[]) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserirNoFinal(1);
        listaEncadeada.inserirNoFinal(2);
        listaEncadeada.inserirNoFinal(3);
//        listaEncadeada.inserirNoFinal(3);
//        listaEncadeada.inserirNaPosicao(1, 4);
//
//        listaEncadeada.removerNoInicio();
//        listaEncadeada.removerNaPosicao(1);
        listaEncadeada.removerNoFinal();

        listaEncadeada.imprimir();
    }

}
