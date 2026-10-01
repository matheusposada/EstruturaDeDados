package ads.esd.testes;
import ads.esd.FilaCircular;

public class Teste2 {

    static void main() {
        FilaCircular<String> fila = new FilaCircular<>(4);

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");

        fila.imprimir();

        System.out.println("Removido " + fila.desenfileirar());
        System.out.println("Removido " + fila.desenfileirar());
        fila.imprimir();

        fila.enfileirar("E");
        fila.enfileirar("F");

        fila.imprimir();



    }
}
