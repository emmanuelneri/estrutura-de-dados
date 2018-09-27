package br.com.emmanuelneri.listas.vetor;

import java.util.Arrays;

// Inserir um elemento na lista
public class InserirElementoLista {

    public static void main(String args[]) {

        String[] lista = new String[10]; // Criar um array de 10 posições do tipo "Texto"

        insere(lista, "A"); // Adiciona A na lista pelo método insere
        insere(lista, "B"); // Adiciona b na lista pelo método insere

        System.out.println(Arrays.toString(lista)); // Apresenta valores da lista

    }

    // Método genérico para inserir um elemento do tipo texto em uma lista do tipo texto
    public static String[] insere(String[] lista, String elemento) {
        int posicaoDisponivel = 0; // inicializa variável com a posição incial de um array

        for(int i = 0; i < lista.length; i++) { // percorre a lista
            if(lista[i] == null) { // verifica a lista na posição i tem valor null (vazio)
                posicaoDisponivel = i; // caso for verdadeiro, a posicação disponível recebe o a posição do i
                break; // para a iteração for
            }
        }

        lista[posicaoDisponivel] = elemento; //atribui elemento na posição disponível

        return lista; // retorna a lista após a inserção do elemento
    }


}
