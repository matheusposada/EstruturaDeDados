package ads.esd;

public class FilaCircular<T> {

    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho; //o que realmente está preenchido

    public FilaCircular(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
        fim = -1;
        inicio = 0;
    }

    public void enfileirar(T elemento){
        if(tamanho == elementos.length){
            throw new RuntimeException("Ta cheio!");
        }


        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public T desenfileirar(){
        if(isEmpty()){
            throw  new RuntimeException("Ta vazio!");
        }

        T valor = elementos[inicio];
        elementos[inicio] = null;

        //não precisa deslocar
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }


    public void imprimir(){
        System.out.println("Fila: ");
        if (isEmpty()){
            System.out.println("A fila está vazia!");
        }
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % elementos.length;
            System.out.print(elementos[indice] + " ");
        }
        System.out.println();
    }




}
