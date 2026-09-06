package ads.esd.ListaDinamica;

public class TestaVetorGenerico{
    public static void main(String[] args) {
        ListaDinamica<String> vetorTexto = new ListaDinamica<>();
        vetorTexto.inserir("Olá");
        vetorTexto.inserir("Mundo");
        System.out.println(vetorTexto.get(0)); // Olá
        System.out.println(vetorTexto.get(1)); // Mundo

        ListaDinamica<Integer> vetorNumeros = new ListaDinamica<>();
        vetorNumeros.inserir(10);
        vetorNumeros.inserir(20);
        vetorNumeros.inserir(30); // deve expandir sozinho
        System.out.println(vetorNumeros.get(2)); // 30
        System.out.println(vetorNumeros.getTamanho()); // 3
    }
}
