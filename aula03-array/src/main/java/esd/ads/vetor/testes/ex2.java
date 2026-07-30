package esd.ads.vetor.testes;

import esd.ads.vetor.VetorEstatico;

public class ex2 {
    static void main(){

        VetorEstatico vetor = new VetorEstatico(10);

        vetor.inserir( "A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir(2, "W");

        vetor.imprimir();
        System.out.println("\n" + "Tamanho: " + vetor.obterTamanho());
        vetor.removerFinal();
        vetor.imprimir();
        System.out.println("\n" + "Tamanho: " + vetor.obterTamanho());



    }


}
