package ads.esd;
public class PilhaHeranca<T extends Comparable<T>> extends Vetor<T> {
    public PilhaHeranca(int capacidade) {
        super(capacidade);
    }
    public void push(T valor) {
        inserir(valor); // insere no fim
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        T valor = ler(obterTamanho() - 1);
        remover(obterTamanho() - 1);
        return valor;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return ler(obterTamanho() - 1);
    }
    public boolean isEmpty() {
        return obterTamanho() == 0;
    }
}