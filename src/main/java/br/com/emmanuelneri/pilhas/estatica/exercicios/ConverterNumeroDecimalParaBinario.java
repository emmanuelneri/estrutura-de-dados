package br.com.emmanuelneri.pilhas.estatica.exercicios;

import br.com.emmanuelneri.pilhas.estatica.implementacao.Pilha;

// Fazer um algoritmo para converter de decimal para binário utilizando pilha
public class ConverterNumeroDecimalParaBinario {

    public static void main(String args[]) {
        System.out.println("10 em binário: " + converter(10)); // imprime 10 em binário = 1010
        System.out.println("25 em binário: " + converter(25)); // imprime 10 em binário 11001
        System.out.println("3 em binário: " + converter(3)); // imprime 10 em binário = 11
    }

    // Método genérico para converter número para binário
    public static String converter(int numero) {
        Pilha pilha = new Pilha(); // inicializa pilhas
        int restoDaDivisao = 0; // cria variável para receber o resto da divisão

        while (numero > 0) { // enquanto o número for maior que zero faça
            restoDaDivisao = numero % 2; // resto da divisão recebe numero divido por 2
            pilha.empilhar(restoDaDivisao); // impilha o resto da divisão (sempre em inteiro, ou seja, desconsiderando os números após a virgula)
            numero = numero / 2; // numero recebe o número divido por 2, assim, o número será divido enquanto for maior que zero
        }

        String numeroBinario = ""; // inicializa variável para armazenar os números em binário
        while (!pilha.estaVazia()) { // enquanto a pilha não estiver vazia faça
            numeroBinario = numeroBinario + pilha.desempilhar(); // atribui para váriavel o valor desempilhado
        }

        return numeroBinario; // retorna a variável utilizada para armazenar os valores empilhados, que são os restos das divisões
    }

}
