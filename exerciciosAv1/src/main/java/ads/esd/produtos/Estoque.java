package ads.esd.produtos;

import java.util.Arrays;

public class Estoque {

    private Produto[] produtos;
    private int tamanho;

    public Estoque(int capacidadeInicial) {
        this.produtos = new Produto[capacidadeInicial];
        this.tamanho = 0;
    }

    private void garantirCapacidade(){
        if (tamanho == produtos.length){
            int novaCapacidade = produtos.length == 0 ? 10 : produtos.length  * 2;
            produtos = Arrays.copyOf(produtos, novaCapacidade);
        }
    }

    private void diminuirCapacidade(){
        int capacidadeMinima = 10;
        if (tamanho <= produtos.length/4 && (produtos.length / 2) >= capacidadeMinima){
            int novaCapacidade = produtos.length/2;
            produtos = Arrays.copyOf(produtos, novaCapacidade);
        }
    }

    public void adicionarProduto(Produto p){
        garantirCapacidade();
        produtos[tamanho] = p;
        tamanho++;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) throws Exception {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i] != null && produtos[i].getCodigo().equalsIgnoreCase(codigo)){
                produtos[i].setQuantidade(novaQuantidade);
                return;
            }
        }
        throw new Exception("Produto com código " + codigo + " não encontrado.");
    }

    public void removerProduto(String codigo) throws Exception{
        int posicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i] != null && produtos[i].getCodigo().equalsIgnoreCase(codigo)){
                posicao = i;
                break;
            }
        }
        if (posicao == -1){
            throw new Exception("Produto com código " + codigo + " não encontrado.");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            produtos[i] = produtos[i + 1];
        }
        tamanho--;
        produtos[tamanho] = null;
        diminuirCapacidade();
    }

    public Produto[] listarProdutosPorQuantidade(int quantidade){
        int recorrencia = 0;
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i] != null && produtos[i].getQuantidade() < quantidade){
                recorrencia++;
            }
        }
        Produto[] resultado = new Produto[recorrencia];
        int pos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i] != null && produtos[i].getQuantidade() < quantidade){
                resultado[pos] = produtos[i];
                pos++;
            }
        }
        return resultado;
    }
}
