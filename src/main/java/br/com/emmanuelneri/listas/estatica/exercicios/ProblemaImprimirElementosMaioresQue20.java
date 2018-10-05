package br.com.emmanuelneri.listas.estatica.exercicios;

//Dado uma lista de 10 elementos inteiros retorne todos elementos que são maior que 20
public class ProblemaImprimirElementosMaioresQue20 {

    public static void main(String args[]) {
        Integer[] lista =  {20, 2, 13, 21, 5, 73, 0, 100, 9, null}; // Cria um array de 10 posições com os valores

        String elementosMaioresQue20 = ""; // inicializa variável para armazenar valores maiores que 20

        for(int i = 0; i < lista.length; i++) { // percorre a lista iniciando na posição 0
            if(lista[i] != null && lista[i] > 20) {  // verifica se elemento na posição i é diferente de nulo e maior que 20
                elementosMaioresQue20 = elementosMaioresQue20 + lista[i] + " "; // caso for verdadeiro, concate valor na variável
            }

        }

        System.out.println(elementosMaioresQue20); // imprime valores
        // Resultado: 21, 73, 100
    }

}
