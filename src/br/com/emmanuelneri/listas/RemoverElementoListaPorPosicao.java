package br.com.emmanuelneri.listas;

import java.util.Arrays;

// Remover um elemento na lista por posição
public class RemoverElementoListaPorPosicao {

    public static void main(String args[]) {

        String[] lista =  {"A", "B", "C", "D", "E"}; // Cria um array de 5 posições com os valores A, B, C, D e E

        remover(lista, 1); // Remove a posição 1 da lista

        System.out.println(Arrays.toString(lista)); // Apresenta valores da lista
        // Resultado: A, C, D e E porque a posição 1 (elemento B foi removido)

    }

    // Método genérico para remover um elemento em uma posição da lista
    public static String[] remover(String[] lista, int posicao) {

        for(int i = posicao; i < lista.length - 1 ; i++) { // percorre a lista iniciando da posição informada até a penultima posição
            if(lista[i] != null) { // verifica a lista na posição i não é nulo (vazio)
                lista[i] = lista[i + 1]; // caso verdadeiro, atribui o valor da posição à frente para a posição atual
            }
        }

        lista[lista.length - 1] = null; // remove o último item do lista

        return lista; // retorna a lista após a inserção do elemento
    }

}
