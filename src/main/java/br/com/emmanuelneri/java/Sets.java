package br.com.emmanuelneri.java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String args []) {

        Set<String> conjunto = new HashSet<>();
        conjunto.add("B");
        conjunto.add("B");
        conjunto.add("A");
        conjunto.add("A");
        conjunto.add("C");

        conjunto.remove("B");

        System.out.println(conjunto);

        TreeSet<String> conjuntoComArvore = new TreeSet<>();
        conjuntoComArvore.add("B");
        conjuntoComArvore.add("B");
        conjuntoComArvore.add("A");
        conjuntoComArvore.add("A");
        conjuntoComArvore.add("C");

        conjuntoComArvore.remove("B");
        conjuntoComArvore.first();
        conjuntoComArvore.last();

        System.out.println(conjuntoComArvore);
    }

}
