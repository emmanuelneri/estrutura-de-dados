package br.com.emmanuelneri.arvores.implementacao;

import java.util.LinkedList;

public class Arvore {

    private NoArvore raiz;
    private int quantidade = 0;

    public NoArvore criarArvore(String valor) {
        raiz = new NoArvore();
        raiz.setValor(valor);
        raiz.setPai(null);

        quantidade++;

        return raiz;
    }

    public NoArvore inserir(NoArvore pai, String valor) {
        pai = buscarNoNaArvore(pai);

        if(pai == null) {
           throw new RuntimeException("Pai não encontrado");
        }

        NoArvore novoNo = new NoArvore();
        novoNo.setValor(valor);
        novoNo.setPai(pai);

        if(pai.getFilhos() == null) {
            pai.setFilhos(new LinkedList<>());
        }

        pai.getFilhos().add(novoNo);

        quantidade++;

        return novoNo;
    }

    public void remover(NoArvore no) {
        NoArvore noNaArvore = buscarNoNaArvore(no);

        if(noNaArvore == null) {
            return;
        }

        if(noNaArvore.equals(raiz) && raiz.getFilhos() == null) {
            raiz = null;
            quantidade = 0;
            return;
        }

        if(noNaArvore.equals(raiz) && raiz.getFilhos() != null) {
            throw new RuntimeException("Não é possível apagar a raiz que possui filhos");
        }

        NoArvore pai = noNaArvore.getPai();
        pai.getFilhos().remove(noNaArvore);

        if(noNaArvore.getFilhos() != null) {
            for(NoArvore filho : noNaArvore.getFilhos()) {
                filho.setPai(pai);
            }

            pai.getFilhos().addAll(noNaArvore.getFilhos());
        }

        quantidade--;
    }

    private NoArvore buscarNoNaArvore(NoArvore no) {
        if(raiz == null) {
            return null;
        }

        if(raiz.equals(no)) {
            return raiz;
        }

        NoArvore noFilho = buscarNosFilhos(raiz, no);
        if (noFilho != null) {
            return noFilho;
        }

        return null;
    }

    private NoArvore buscarNosFilhos(NoArvore pai, NoArvore no) {
        if(pai.getFilhos() != null) {
            for(NoArvore filho : pai.getFilhos()) {
                if(filho.equals(no)) {
                    return filho;
                }

                NoArvore noFilhoEncontrado = buscarNosFilhos(filho, no);
                if(noFilhoEncontrado != null) {
                    return noFilhoEncontrado;
                }
            }
        }
        return null;
    }

    public int retornarQuantidadeDeNos() {
        return quantidade;
    }

    public String imprimir() {
        if(raiz == null) {
            String vazio = "()";
            System.out.println(vazio);
            return vazio;
        }

        StringBuilder elementos = new StringBuilder();

        elementos.append("(");
        elementos.append(raiz.getValor());
        apresentarNosFilhos(raiz, elementos);
        elementos.append(")");

        System.out.println(elementos.toString());

        return elementos.toString();
    }


    private void apresentarNosFilhos(NoArvore pai, StringBuilder elementos) {
        if(pai.getFilhos() != null) {
            for(NoArvore filho : pai.getFilhos()) {
                elementos.append("(");
                elementos.append(filho.getValor());

                apresentarNosFilhos(filho, elementos);
                elementos.append(")");
            }
        }
    }


}
