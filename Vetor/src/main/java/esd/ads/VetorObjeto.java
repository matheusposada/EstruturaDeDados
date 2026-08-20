package esd.ads;

public class VetorObjeto<T> {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void inserir (Object elemento){
        if (tamanho == elementos.length){
            System.out.println("Ta cheio");
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @SuppressWarnings("Unchecked")
    public T ler(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return (T) elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
    }
}
