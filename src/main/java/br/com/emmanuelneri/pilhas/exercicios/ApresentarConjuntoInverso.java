package br.com.emmanuelneri.pilhas.exercicios;

import br.com.emmanuelneri.pilhas.implementacao.Pilha;

//Dados o conjunto de dados {10, 20, 30, 40, 50} imprima os valores na ordem invertida utilizando a estrutura de dados pilha
public class ApresentarConjuntoInverso {

    public static void main(String args[]) {

        Pilha pilha = new Pilha(); // inicializa a pilha
        pilha.empilhar(10); // empilha elemento 10
        pilha.empilhar(20); // empilha elemento 20
        pilha.empilhar(30); // empilha elemento 30
        pilha.empilhar(40); // empilha elemento 40
        pilha.empilhar(50); // empilha elemento 50

        int quantidadeDeElementos = pilha.retornarQuantidadeDeElementos(); // cria variável com a quantidade de elementos da pilha

       for(int i = 0; i < quantidadeDeElementos; i++) { // percorre os elementos da pilha
           System.out.print(pilha.desempilhar() + " "); // imprime o valor desempilhado a cada iteração
       }
    }

}
