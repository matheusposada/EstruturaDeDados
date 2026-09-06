package ads.esd.ListaDinamica;

@SuppressWarnings("unchecked")
public class ListaDinamica<T> {
    private T[] nomes = (T[]) new Object[2];
    private int tamanho = 0;

    //Exercício: inserir no final, expandindo se necessário
    public void inserir(T nome) {
        // TODO: se tamanho == nomes.length, chame expandir() antes de inserir
        if (tamanho >= nomes.length){
            expandir();
        }
        nomes[tamanho] = nome;
        tamanho++;
    }

    //Exercício: expandir (dobrar a capacidade)
    @SuppressWarnings("unchecked")
    private void expandir() {
        // TODO: crie um novo array com o DOBRO do tamanho atual,
        // copie todos os elementos existentes, e troque o array interno.
        T[] novoNomes = (T[]) new Object[nomes.length*2];
        for (int i = 0; i < tamanho; i++){
            novoNomes[i] = nomes[i];
        }
        nomes = novoNomes;
    }

    //Exercício: remover o último elemento
    public void removerUltimo() {
        if(tamanho == 0){
            System.out.println("Lista vazia!");
            return;
        }
        nomes[tamanho-1] = null;
        tamanho--;
        reduzir();
    }

    //Exercício (mais difícil): reduzir a capacidade quando o vetor
    // estiver com 25% de ocupação ou menos (tamanho <= nomes.length / 4),
    // mas nunca reduza abaixo de uma capacidade mínima de 2.
    @SuppressWarnings("unchecked")
    private void reduzir() {
        if(tamanho <= nomes.length/4) {
            int novaCapacidade = nomes.length/2;
            if (novaCapacidade < 2){
                novaCapacidade = 2;
            }
            if (novaCapacidade < nomes.length) {
                T[] novoNomes = (T[]) new Object[novaCapacidade];
                for (int i = 0; i < tamanho; i++) {
                    novoNomes[i] = nomes[i];
                }
                nomes = novoNomes;
            }
        }
    }

    public void listar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(nomes[i]);
        }
    }

    public T get(int indice) {
        // TODO: retorna o elemento na posição "indice"
        // (dica: se indice for inválido, lance uma exceção com "throw new IndexOutOfBoundsException()")

        if(indice < 0 || indice > tamanho){
            throw new IndexOutOfBoundsException();
        }
        return nomes[indice];
    }


    public int getCapacidade() {
        return nomes.length;
    }

    public int getTamanho() {
        return tamanho;
    }


}
