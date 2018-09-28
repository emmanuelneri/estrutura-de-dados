package br.com.emmanuelneri.listas.estatica;

// Remover um elemento na lista por posição
public class RetornarElementoListaPorPosicao {

    public static void main(String args[]) {

        String[] lista =  {"A", "B", "C", "D", "E"}; // Cria um array de 5 posições com os valores A, B, C, D e E

        String elemento = retornarPorPosicao(lista, 1);// retorna elemento da posição 1

        System.out.println(elemento); // Apresenta o elemento da posição 1

    }

    // Método para retornar elemento da posição informada
    public static String retornarPorPosicao(String[] lista, int posicao) {
        return lista[posicao]; // retorna o elemento da posição informada
    }

}
