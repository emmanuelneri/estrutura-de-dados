package br.com.emmanuelneri.filas.estatica;

import java.util.Arrays;

// Desenfilierar (remover) elemento da fila
public class DesenfileirarNaFila {

    public static void main(String args[]) {

        String[] fila = {"A", "B", "C", "D", "E"}; // Cria um array de 10 posições com os valores A, B, C, D e E

       desenfileirar(fila); // desenfileira um elemento da fila - remove o elemento A
       desenfileirar(fila);  // desenfileira um elemento da fila - remove o elemento B

        System.out.println(Arrays.toString(fila)); // Apresenta valores do array
        // Resultado: C, D e E
    }

    // Método genérico para desenfileirar elemento da fila
    public static void desenfileirar(String[] fila) {
        for(int i = 0; i < fila.length -1; i++) { // percorre a fila até a penultima posição
            fila[i] = fila[i + 1]; // atribui o valor da posição à frente para a posição atual
        }

        fila[fila.length -1] = null;  // remove o último item do lista
    }

}
