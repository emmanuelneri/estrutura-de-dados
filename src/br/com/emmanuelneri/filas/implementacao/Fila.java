package br.com.emmanuelneri.filas.implementacao;

public class Fila {

    private Integer[] elementos = new Integer[10];
    private int proximaPosicao = 0;

    public void enfileirar(Integer elemento) {
        if(estaCheia()) {
            return;
        }

        elementos[proximaPosicao] = elemento;
        proximaPosicao = proximaPosicao + 1;
    }


    public void desenfileirar() {
        if(estaVazia()) {
            return;
        }

        for (int i = 0; i < elementos.length - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[elementos.length - 1] = null;

        proximaPosicao = proximaPosicao - 1;
    }

    public int retornarQuantidadeDeElementos() {
        return proximaPosicao;
    }

    public int proximo() {
        return elementos[0];
    }

    public boolean estaCheia() {
        return proximaPosicao == elementos.length;
    }

    public boolean estaVazia() {
        return proximaPosicao == 0;
    }

    public void imprimir() {
        String texto = "[ ";

        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] != null) {
                texto = texto + elementos[i] + " ";
            }
        }

        texto = texto + "]";

        System.out.println(texto);
    }

}
