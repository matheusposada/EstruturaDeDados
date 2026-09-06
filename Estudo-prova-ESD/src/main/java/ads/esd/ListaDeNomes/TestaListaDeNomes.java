package ads.esd.ListaDeNomes;

public class TestaListaDeNomes {
    public static void main(String[] args) {
        ListaDeNomes lista = new ListaDeNomes();
        lista.inserir("Ana");
        lista.inserir("Bruno");
        lista.inserir("Carla");
        lista.listar();                        // Ana, Bruno, Carla

        System.out.println(lista.buscar("Bruno")); // 1
        System.out.println(lista.buscar("Zeca"));  // -1

        lista.inserirNaPosicao(1, "Diego");
        lista.listar();                        // Ana, Diego, Bruno, Carla

        lista.removerPorIndice(0);
        lista.listar();                        // Diego, Bruno, Carla

        lista.removerPorValor("Bruno");
        lista.listar();                        // Diego, Carla

        System.out.println(lista.estaVazia()); // false
        lista.limpar();
        System.out.println(lista.estaVazia()); // true
    }
}
