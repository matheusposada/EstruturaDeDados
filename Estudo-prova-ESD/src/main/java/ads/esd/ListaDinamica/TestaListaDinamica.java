package ads.esd.ListaDinamica;

public class TestaListaDinamica {
    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();
        System.out.println(lista.getCapacidade()); // 2

        lista.inserir("Ana");
        lista.inserir("Bruno");
        System.out.println(lista.getCapacidade()); // 2 (ainda cabe)

        lista.inserir("Carla"); // aqui deve expandir!
        System.out.println(lista.getCapacidade()); // 4
        System.out.println(lista.getTamanho());    // 3

        lista.inserir("Diego");
        lista.inserir("Eva");   // deve expandir de novo
        System.out.println(lista.getCapacidade()); // 8
    }
}
