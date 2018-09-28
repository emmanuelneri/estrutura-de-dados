package br.com.emmanuelneri.listas.estatica;

import java.util.Arrays;

// Remover um elemento na lista por elemento
public class RemoverElementoListaPorElemento {

    public static void main(String args[]) {

        String[] lista =  {"A", "B", "C", "D", "E"}; // Cria um array de 5 posições com os valores A, B, C, D e E

        remover(lista, "D"); // Remove a posição 1 da lista

        System.out.println(Arrays.toString(lista)); // Apresenta valores da lista
        // Resultado: A, B, C e E porque o elemento D foi removido

    }

    // Método genérico para remover um elemento em uma posição da lista
    public static String[] remover(String[] lista, String elemento) {
        Integer posicaoDoElemento = null; // inicializa variável da posição com null

        for(int i = 0; i < lista.length; i++) { // percorre a lista
            if(lista[i] != null && lista[i].equals(elemento)) { // verifica a lista na posição i não é null e se o valor da lista na posição i é igual ao elemento
                posicaoDoElemento = i; // caso for verdadeiro, a posicação disponível recebe o a posição do i
                break; // para a iteração for
            }
        }

        if(posicaoDoElemento == null) { // verifica se a posição do elemento é nula
            throw new RuntimeException("Elemento não encontrado: " + elemento); // caso for verdadeiro, lance um erro informando que não foi encontrado o elemento
        }

        for(int i = posicaoDoElemento; i < lista.length - 1 ; i++) { // percorre a lista iniciando da posição informada até a penultima posição
            if(lista[i] != null) { // verifica a lista na posição i não é nulo (vazio)
                lista[i] = lista[i + 1]; // caso verdadeiro, atribui o valor da posição à frente para a posição atual
            }
        }

        lista[lista.length - 1] = null; // remove o último item do lista

        return lista; // retorna a lista após a inserção do elemento
    }

}
