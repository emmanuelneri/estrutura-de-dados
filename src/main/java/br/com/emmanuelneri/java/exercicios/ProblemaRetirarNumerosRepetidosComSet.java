package br.com.emmanuelneri.java.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Armazenar 5 números e remover os repetidos
public class ProblemaRetirarNumerosRepetidosComSet {

    public static void main(String args[]) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(5);
        numeros.add(1);
        numeros.add(1);

        System.out.println(numeros);
    }
}
