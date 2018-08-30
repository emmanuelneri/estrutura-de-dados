package br.com.emmanuelneri.filas;

// Retornar quantidade de elementos da fila
public class RetornarQuantidadeElementoFila {

    public static void main(String args[]) {

        String[] fila =  {"A", "B", "C", "D", "E"}; // Cria um array de 5 posições com os valores A, B, C, D e E

        int quantidade = retornarQuantidadeDeElementos(fila);// retorna a quantidade de elementos da fila

        System.out.println(quantidade); // Apresenta Apresenta a quantidade de elementos

    }

    // Método para retornar elemento da posição informada
    public static int retornarQuantidadeDeElementos(String[] fila) {
        int quantidade = 0; // inicializa variável para contar a quantidade de elementos com zero

        for(int i = 0; i < fila.length ; i++) { // percorre a fila
            if(fila[i] != null) {  // verifica se o valor da fila na posição i é diferente de null
                quantidade++; // caso for verdadeiro, adiciona mais um na quantidade
            }
        }

        return quantidade; // retorna a quanidade
    }

}
