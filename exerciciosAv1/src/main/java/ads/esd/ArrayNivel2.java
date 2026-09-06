package ads.esd;

public class ArrayNivel2 {
    private int[] elementos;
    private int tamanho;
    private String[] elementosTexto;

    public ArrayNivel2(int quantidade) {
        this.elementos = new int[quantidade];
        this.tamanho = 0;
        this.elementosTexto = new String[0]; // Inicializa vazio para evitar NullPointerException
    }

    public ArrayNivel2(String[] elementosTexto) {
        this.elementosTexto = elementosTexto;
        this.elementos = new int[0]; // Inicializa vazio para evitar NullPointerException
        this.tamanho = elementosTexto.length;
    }

    //9. Simule inserir um número na posição 0 de um array que já tem elementos, empurrando todo mundo um passo pra direita.
    public void inserirNoInicio(int numero){
        for (int i = elementos.length -1 ; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = numero;
        tamanho++;
    }

    // método para exibir o vetor
    public void exibir(){
        IO.print("[");
        // Se for um objeto de Strings
        if (elementosTexto.length > 0) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementosTexto[i]);
                if (i < tamanho - 1) {
                    System.out.print(", ");
                }
            }
        }
        // Se for um objeto de Inteiros
        else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i]);
                if (i < tamanho - 1) {
                    System.out.print(", ");
                }
            }
        }

        IO.println("]");

    }

    //10. Simule remover o elemento da posição 0, empurrando todo mundo um passo pra esquerda.
    public void removerDoInicio(){
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        elementos[tamanho] = 0;
    }

    //11. Escreva um método removerValor(int valor) que remove todas as ocorrências de um valor, mantendo o vetor compacto (sem buracos) — sem usar array auxiliar.
    public void removeValor(int valor){
        int posicao = 0;
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i] == valor){
                posicao = i;
            }
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        elementos[tamanho] = 0;
    }

    //12. Escreva um método que inverte um array in-place (sem criar array novo), trocando o primeiro com o último, o segundo com o penúltimo, e assim por diante.
    public void inverteVetor(){
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim){
            int temp = elementos[inicio];
            elementos[inicio] = elementos[fim];
            elementos[fim] = temp;

            inicio++;
            fim--;
        }
    }

    //14. Escreva a busca linear "clássica": método buscarLinear(int chave) que retorna o índice do elemento ou -1.
    public int buscarLinear(int chave){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == chave){
                return i;
            }
        }
        return -1;
    }

    //15. Modifique a busca linear pra contar quantas comparações foram feitas até achar o elemento (ou até acabar o array). Teste com o elemento no início, no meio e no fim — compare o número de comparações.
    public int contadorBuscaLinear(int chave){
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            contador++;
            if (elementos[i] == chave){
                return contador;
            }
        }
        return contador;
    }

    //ordenador de vetor.
    public void ordenarCrescente(){
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i ; j++) {
                if (elementos[j] > elementos[j + 1]){
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    //16. Escreva uma busca linear que funciona em um array já ordenado e para de procurar assim que encontra um valor maior que a chave (otimização vista no guia).
    public int buscaLinearOrdenada(int chave){
        ordenarCrescente();
        for (int i = 0; i < tamanho - 1; i++) {
            if (elementos[i] > chave){
                return elementos[i];
            }
        }
        return -1;
    }

    //17. Dado um array de nomes (Strings), escreva uma busca linear que retorna todos os índices onde um nome aparece (pode aparecer mais de uma vez).
    public int[] buscaLinearString(String nome){
        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementosTexto[i] != null && elementosTexto[i].equalsIgnoreCase(nome)){
                quantidade++;
            }
        }
        int[] indices = new int[quantidade];
        int posicao = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementosTexto[i] != null && elementosTexto[i].equalsIgnoreCase(nome)){
                indices[posicao] = i;
                posicao++;
            }
        }
        return indices;
    }

    //19. Agora programe: buscarBinario(int chave) na versão iterativa (com while), retornando o índice ou -1.
    public int buscaBinaria(int chave){
        ordenarCrescente();
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio <= fim){
            int meio = (inicio + fim) / 2;

            if (elementos[meio] == chave){
                return meio;
            }
            if(elementos[meio] < chave){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    //22. Escreva um método que usa busca binária pra descobrir onde um número deveria ser inserido num array ordenado, caso ele ainda não exista ali insira-o.
    public void inserirOrdenado(int valor){
        ordenarCrescente();
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio <= fim){
            int alvo = (inicio + fim) / 2;
            if (elementos[alvo] == valor){
                return;
            }
            if(elementos[alvo] < valor){
                inicio = alvo + 1;
            } else {
                fim = alvo - 1;
            }
        }
        int posicaoInsercao = inicio;
        for (int i = elementos.length -1 ; i > posicaoInsercao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicaoInsercao] = valor;
        tamanho++;
    }





}
