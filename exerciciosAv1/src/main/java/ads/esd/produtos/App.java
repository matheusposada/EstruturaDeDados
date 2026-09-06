package ads.esd.produtos;

public class App {
    static void main(String[] args) {
        Estoque estoque = new Estoque(5); // Inicia com capacidade de 5

        System.out.println("=== 1. ADICIONANDO PRODUTOS ===");
        estoque.adicionarProduto(new Produto("P1", "Teclado", 15));
        estoque.adicionarProduto(new Produto("P2", "Mouse", 5));
        estoque.adicionarProduto(new Produto("P3", "Monitor", 2));
        estoque.adicionarProduto(new Produto("P4", "Headset", 8));
        System.out.println("Quantidade total de produtos no estoque: " + estoque.getTamanho());

        System.out.println("\n=== 2. ATUALIZANDO QUANTIDADE ===");
        try {
            estoque.atualizarQuantidade("P2", 20); // Altera o Mouse de 5 para 20
            System.out.println("Quantidade do produto P2 atualizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== 3. LISTANDO PRODUTOS ABAIXO DO LIMITE (ex: < 10) ===");
        Produto[] produtosAbaixo = estoque.listarProdutosPorQuantidade(10);
        for (Produto p : produtosAbaixo) {
            System.out.println(p);
        }

        System.out.println("\n=== 4. REMOVENDO UM PRODUTO ===");
        try {
            estoque.removerProduto("P3"); // Remove o Monitor
            System.out.println("Produto P3 removido com sucesso!");
            System.out.println("Novo tamanho do estoque: " + estoque.getTamanho());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== 5. TESTANDO EXCEÇÃO (CÓDIGO INEXISTENTE) ===");
        try {
            estoque.removerProduto("P999"); // Tenta remover um código que não existe
        } catch (Exception e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }
    }
}
