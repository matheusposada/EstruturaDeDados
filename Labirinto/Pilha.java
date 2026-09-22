package atividade;


public class Pilha {
    private static class No {
        Posicao valor;
        No proximo;

        No(Posicao valor, No proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    private No topo;

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(Posicao p) {
        topo = new No(p, topo);
    }

    public Posicao desempilhar() {
        if (estaVazia()) {
            return null;
        }
        Posicao valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }
}
