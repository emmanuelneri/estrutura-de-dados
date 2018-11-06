package br.com.emmanuelneri.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String args []) {

        List<String> lista = new ArrayList<>();
        lista.add(0, "Z");
        lista.add(1, "C");
        lista.add(1, "B");
        lista.add("C");
        lista.add("A");

        lista.remove(1);

        System.out.println(lista);

        List<String> listaLigada = new LinkedList<>();
        listaLigada.add(0, "Z");
        listaLigada.add(1, "C");
        listaLigada.add(1, "B");
        listaLigada.add("C");
        listaLigada.add("A");

        listaLigada.remove(1);

        System.out.println(listaLigada);

    }

}
