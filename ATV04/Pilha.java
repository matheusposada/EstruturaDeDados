package atividade;

public class Pilha {

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