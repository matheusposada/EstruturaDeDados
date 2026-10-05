package ads.esd;

import java.util.ArrayList;

public class Escalonador {
    FilaCircular<Processo> fila;
    ArrayList<Processo> naoChegaram;
    private int tempo;

    public Escalonador() {

        this.tempo = 0;
    }


}
