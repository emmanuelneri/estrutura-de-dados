package br.com.emmanuelneri.listas.estatica;

// Retornar quantidade de elementos da lista
public class RetornarQuantidadeElementoLista {

    public static void main(String args[]) {

        String[] lista =  {"A", "B", "C", "D", "E"}; // Cria um array de 5 posições com os valores A, B, C, D e E

        int quantidade = retornarQuantidadeDeElementos(lista);// retorna a quantidade de elementos da lista

        System.out.println(quantidade); // Apresenta a quantidade de elementos

    }

    // Método para retornar quantidade de elementos de uma lista
    public static int retornarQuantidadeDeElementos(String[] lista) {
        int quantidade = 0; // inicializa variável para contar a quantidade de elementos com zero

        for(int i = 0; i < lista.length ; i++) { // percorre a lista
            if(lista[i] != null) {  // verifica se o valor da lista na posição i é diferente de null
                quantidade++; // caso for verdadeiro, adiciona mais um na quantidade
            }
        }

        return quantidade; // retorna a qunatidade
    }

}
