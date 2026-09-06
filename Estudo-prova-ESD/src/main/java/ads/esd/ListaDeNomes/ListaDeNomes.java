package ads.esd.ListaDeNomes;

public class ListaDeNomes {

    private String[] nomes = new String[10];
    private int tamanho = 0;

    //Exercício: inserir no final
    //Regra: se já estiver cheio, imprime "Lista cheia!" e não faz nada.

    public void inserir(String nome){
        if (tamanho >= nomes.length) {
            System.out.println("Lista cheia!");
        } else {
            nomes[tamanho] = nome;
            tamanho++;
        }
    }

    //Exercício: listar todos os nomes
    public void listar() {
        for (int i = 0; i < tamanho; i++){
            System.out.println(nomes[i]);
        }
    }

    //Exercício: buscar um nome e retornar o índice (-1 se não achar)
    public int buscar(String nome){
        for(int i = 0; i < tamanho; i++){
            if (nome.equals(nomes[i])){
                return i;
            }
        }
        return -1;
    }

    // Exercício: remover pelo índice, COM deslocamento
    // (todo mundo depois do índice removido anda uma posição p/ trás)
    public void removerPorIndice(int indice) {
        for(int i = indice; i < tamanho; i++){
            nomes[i] = nomes[i+1];
        }
        nomes[tamanho-1] = null;
        tamanho--;
    }

    //Exercício: remover pelo VALOR (usa o buscar() + removerPorIndice())
    public void removerPorValor(String nome) {
        int indice = 0;
        for(int i = 0; i < tamanho; i++){
            if (nome.equals(nomes[i])){
                indice =  i;
            }
        }
        for(int i = indice; i < tamanho; i++){
            nomes[i] = nomes[i+1];
        }
        nomes[tamanho-1] = null;
        tamanho--;
    }

    //Exercício: inserir em uma posição específica, COM deslocamento
    public void inserirNaPosicao(int indice, String nome) {
        if (tamanho >= nomes.length) {
            System.out.println("Lista cheia!");
        }
        for(int i = tamanho; i > indice; i--){
            nomes[i] = nomes[i-1];
        }
        nomes[indice] = nome;
        tamanho++;

    }

    //Exercício: verificar se a lista está vazia
    public boolean estaVazia() {
        if (tamanho == 0){
            return true;
        } else return false;
    }

    //Exercício: limpar a lista inteira (remove tudo)
    public void limpar() {
        for(int i = 0; i < tamanho; i++){
            nomes[i] = null;
        }
        tamanho = 0;
    }




}
