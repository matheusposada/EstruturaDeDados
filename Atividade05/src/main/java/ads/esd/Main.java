package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        FilaCircular<Processo>filaProcessos = new FilaCircular<>(20);

        Processo processo = new Processo("somar", 1, 1);
        Processo processo1 = new Processo("subtrair", 2, 2);
        Processo processo2 = new Processo("dividir", 4, 4);
        Processo processo3 = new Processo("multiplicar", 3, 3);

        filaProcessos.enfileirar(processo);
        filaProcessos.enfileirar(processo1);
        filaProcessos.enfileirar(processo2);
        filaProcessos.enfileirar(processo3);

        System.out.println(filaProcessos.isEmpty());
;
        filaProcessos.imprimir();
        filaProcessos.desenfileirar();
        filaProcessos.imprimir();
        filaProcessos.desenfileirar();
        filaProcessos.imprimir();
        filaProcessos.desenfileirar();
        filaProcessos.imprimir();
        filaProcessos.desenfileirar();
        filaProcessos.imprimir();



    }
}
