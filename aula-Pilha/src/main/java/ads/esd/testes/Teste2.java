package ads.esd.testes;

import ads.esd.filas.Fila;
import ads.esd.filas.Pacote;
import ads.esd.filas.Produtor;

public class Teste2 {

    static void main() {

        Fila<Pacote> fila = new Fila<Pacote>(10);

        Produtor pr1 = new Produtor("Produtor 1", "PC-A");
        Produtor pr2 = new Produtor("Produtor 2", "PC-B");

        pr1.produzirPacote(fila,1, "login", "Servidor 1", "AAAA");
        pr1.produzirPacote(fila,2, "imagem", "Servidor 2", "AAAA");

        pr2.produzirPacote(fila,3, "imagem", "Servidor 3", "AAAA");

        System.out.println("FILA DE PACOTES");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();



    }
}
