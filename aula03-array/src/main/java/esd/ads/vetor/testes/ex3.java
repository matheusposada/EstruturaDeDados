package esd.ads.vetor.testes;

import esd.ads.vetor.VetorEstatico;

public class ex3 {

    static void main(){

        VetorEstatico vetor = new VetorEstatico(6);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("F");

        vetor.imprimir();

        IO.println("Removendo na posição 2");
        vetor.remover(2);

        IO.println("Arranjo após a remoção");
        vetor.imprimir();

    }
}

