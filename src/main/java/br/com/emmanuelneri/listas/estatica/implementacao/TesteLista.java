package br.com.emmanuelneri.listas.estatica.implementacao;

// Classe com objetivo de testar a implementação de lista
public class TesteLista {

    public static void main(String args[]) {

        Lista lista = new Lista(); // inicializa a Lista

        lista.inserirPorElemento(10);
        lista.inserirPorElemento(20);
        lista.inserirPorPosicao(2, 30);
        lista.inserirPorPosicao(3, 40);
        lista.inserirPorPosicao(4, 50);
        lista.removerPorPosicao(1);
        lista.removerPorElemento(50);

        System.out.println("Lista está cheia? " + lista.estaCheia());
        System.out.println("Primeira posição " + lista.retornarElemento(0));

        lista.imprimir();
    }

}
