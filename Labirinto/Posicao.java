package atividade;


public class Posicao {
    int linha;
    int coluna;
    Posicao anterior;

    public Posicao(int linha, int coluna, Posicao anterior) {
        this.linha = linha;
        this.coluna = coluna;
        this.anterior = anterior;
    }
}
