package br.com.emmanuelneri.java;

import java.util.*;

public class Maps {

    public static void main(String args []) {
        Map<String, Integer> map = new HashMap<>();
        map.put("B", 10);
        map.put("B", 100);
        map.put("A", 1);
        map.put("A", 2);;
        map.put("C", 10);

        map.remove("B");

        System.out.println(map);

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
