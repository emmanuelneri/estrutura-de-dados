package br.com.emmanuelneri.java.exercicios;

import java.util.ArrayList;
import java.util.List;

// Armazenar 5 números e apresentar o maior com List
public class ProblemaMaiorNumeroComList {

    public static void main(String args[]) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(30);
        numeros.add(5);
        numeros.add(1);
        numeros.add(25);

        Integer maior = numeros.get(0);

        for(Integer  numero: numeros) {
            if(numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior: " + maior);
    }
}
