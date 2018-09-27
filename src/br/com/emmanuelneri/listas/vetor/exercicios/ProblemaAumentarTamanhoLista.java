package br.com.emmanuelneri.listas.vetor.exercicios;

import java.util.Arrays;

//Criar um comportamento na lista que ao atingir seu limite de tamanho na inserção de elementos ela possa aumentar seu tamanho
public class ProblemaAumentarTamanhoLista {

    public static void main(String args[]) {

        Integer[] lista =  new Integer[3]; // Cria um array de 5 posições com os valores
        lista = inserir(lista, 1);
        lista = inserir(lista, 2);
        lista = inserir(lista, 3);
        lista = inserir(lista, 4);

        System.out.println(Arrays.asList(lista));
    }

    public static Integer[] inserir(Integer[] lista, Integer elemento) {
        Integer posicaoDisponivel = null; // inicializa variável com null

        for(int i = 0; i < lista.length; i++) { // percorre a lista
            if(lista[i] == null) { // verifica a lista na posição i tem valor null (vazio)
                posicaoDisponivel = i; // caso for verdadeiro, a posicação disponível recebe o a posição do i
                break; // para a iteração for
            }
        }
        if(posicaoDisponivel == null) { // verifica se não encontrou posição disponível
            posicaoDisponivel = lista.length; // caso verdadeiro, posicaoDisponivel recebe o tamanho da lista (que é a última posição + 1)

            Integer[] novaLista =  new Integer[lista.length * 2]; // cria uma nova lista com o dobro de tamanho
            for(int i = 0; i < lista.length; i ++) { // pecorre a lista
                novaLista[i] = lista[i]; // atribui o valor da lista na posição i para a nova lista na posição i
            }

            lista = novaLista; // lista recebe a nova lista, ou seja, a nova lista com maior capacidade
        }

        lista[posicaoDisponivel] = elemento; //atribui elemento na posição disponível

        return lista; // retorna a lista após a inserção do elemento
    }
}
