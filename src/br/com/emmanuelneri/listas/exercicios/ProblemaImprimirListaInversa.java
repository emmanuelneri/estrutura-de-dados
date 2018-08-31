package br.com.emmanuelneri.listas.exercicios;

//Imprima 10 elementos de uma lista na ordem inversa
public class ProblemaImprimirListaInversa {

    public static void main(String args[]) {
        Integer[] lista =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Cria um array de 10 posições com os valores

        for(int i = lista.length - 1; i >= 0; i--) { // percorre a lista iniciando na última posição da lista (lista.length - 1) para i mair ou igual a zero decrementando em 1
            System.out.println(lista[i]); // imprime o elemento na posição i
        }
        // Resultado: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    }

}
