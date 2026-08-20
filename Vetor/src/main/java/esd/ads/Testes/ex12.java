package esd.ads.Testes;

import esd.ads.Vetor;

import java.util.Random;

public class ex12 {
    static void main() {

        Vetor<Integer> vetor =  new Vetor<>(10);
        inserirAleatorio(vetor, 100, 200);

        vetor.imprimir();

    }

    public static void inserirAleatorio(Vetor<Integer> vetor, int quantidade, int range) {

        Random aleatorio = new Random();
        while (vetor.obterTamanho() < quantidade) {
            int numeroSorteado = aleatorio.nextInt(range);
            vetor.inserirOrdenadov2(numeroSorteado);
        }


    }

    public int buscarLinearOrdenada (Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.obterTamanho(); i++){
            if (vetor.ler(i) == alvo){
                return i;
            } else if (vetor.ler(i) > alvo) {
                return -1;
            }
        }
        return -1;
    };

    public int buscarBinaria(Vetor<Integer> vetor, int alvo){

        int inicio = 0;
        int fim = vetor.obterTamanho();

        while (inicio <= fim) {

            int meio = (inicio + fim)/2;

            if (vetor.ler(meio) == alvo){
                return  meio;
            } else if (vetor.ler(meio) > alvo) {
                fim = meio -1; // meio - 1 pq já olhamos o meio
            } else {
                inicio = meio + 1;
            }


        }
        return -1;
    }


}
