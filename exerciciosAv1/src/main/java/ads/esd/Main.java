package ads.esd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] meuVetor = {7, 58, 9, 44, 57};

        System.out.print("Vetor invertido: \n");
        imprimirInvertido(meuVetor);
        somarTudo(meuVetor);
        contarPares(meuVetor);
        IO.println(existeNumero(meuVetor, 13));
        encontraMaior(meuVetor);
        IO.println(Arrays.toString(retornaMaiores(meuVetor)));*/

        String[] nomes = {"Ana", "Carlos", "ana", "Beatriz", "ANA", "João", "Carlos"};
        ArrayNivel2 vetorNomes = new ArrayNivel2(nomes);
        ArrayNivel2 vetor = new ArrayNivel2(10);



        IO.println("\nInserindo valores no início:");
        vetor.inserirNoInicio(25);
        vetor.inserirNoInicio(43);
        vetor.inserirNoInicio(98);
        vetor.inserirNoInicio(7);
        vetor.inserirNoInicio(129);
        vetor.inserirNoInicio(54);
        vetor.inserirNoInicio(13);
        vetor.inserirNoInicio(77);
        vetor.inserirNoInicio(24);
        vetor.inserirNoInicio(15);
        vetor.exibir();

        IO.println("\nRemovendo valor do início:");
        vetor.removerDoInicio();
        vetor.exibir();

        IO.println("\nRemovendo valor específico:");
        vetor.removeValor(25);
        vetor.exibir();

        IO.println("\nInvertendo a posição do vetor:");
        vetor.inverteVetor();
        vetor.exibir();

        IO.println("\nBusca linear: ");
        IO.println(vetor.buscarLinear(77));

        IO.println("\nContador buscaLinear: ");
        IO.println(vetor.contadorBuscaLinear(77));

        IO.println("\nOrdenando o vetor em crescente");
        vetor.ordenarCrescente();
        vetor.exibir();

        IO.println("\nInvertendo a posição do vetor:");
        vetor.inverteVetor();
        vetor.exibir();

        IO.println("\nBusca Linear lista Ordenada: ");
        IO.println(vetor.buscaLinearOrdenada(13));
        vetor.exibir();

        IO.println("\nBusca Linear de String: ");
        IO.println(Arrays.toString(vetorNomes.buscaLinearString("ana")));
        IO.println(Arrays.toString(vetorNomes.buscaLinearString("CARLOS")));
        vetorNomes.exibir();

        IO.println("\nInvertendo a posição do vetor:");
        vetor.inverteVetor();
        vetor.exibir();

        IO.println("\nBusca Binaria: ");
        IO.println(vetor.buscaBinaria(129));
        vetor.exibir();

        IO.println("\nInserindo de forma ordenada binária: ");
        vetor.inserirOrdenado(55);
        vetor.exibir();
    }
}
