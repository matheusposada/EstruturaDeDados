package ads.esd.reserva;

import java.util.Arrays;

public class SistemaReservas {

    private Reserva[] reservas;
    private int tamanho;

    public SistemaReservas(int capacidadeInicial) {
        this.reservas = new Reserva[capacidadeInicial];
        this.tamanho = 0;
    }

    public void garantirCapacidade(){
        if(tamanho == reservas.length){
            int novaCapacidade = reservas.length == 0 ? 10 : reservas.length * 2;
            reservas = Arrays.copyOf(reservas, novaCapacidade);
        }
    }

    public void diminuirCapacidade(){
        int capacidadeMinima = 10;
        if (tamanho <= reservas.length/4 && (reservas.length/2) >= capacidadeMinima){
            int novaCapacidade = reservas.length/2;
            reservas = Arrays.copyOf(reservas, novaCapacidade);
        }
    }

    public void criarReserva(Reserva r){
        garantirCapacidade();
        reservas[tamanho] = r;
        tamanho++;
    }

    public void cancelarReservaID(String id) throws Exception {
        int pos = -1;
        for (int i = 0; i < tamanho; i++) {
            if(reservas[i] != null && reservas[i].getIdReserva().equalsIgnoreCase(id)){
                pos = i;
                break;
            }
        }
        if (pos == -1){
            throw new Exception("Reserva com o ID: " + id + "não encontrada");
        }
        for (int i = pos; i < tamanho - 1; i++) {
            reservas[i] = reservas[i+1];
        }
        tamanho--;
        reservas[tamanho] = null;
        diminuirCapacidade();
    }

    public Reserva[] buscarReservasCliente(String nome){
        int tam = 0;
        for (int i = 0; i < tamanho; i++) {
            if (reservas[i] != null && reservas[i].getNomeCliente().equalsIgnoreCase(nome)){
                tam++;
            }
        }
        Reserva[] resultado = new Reserva[tam];
        int pos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (reservas[i] != null && reservas[i].getNomeCliente().equalsIgnoreCase(nome)){
                resultado[pos] = reservas[i];
                pos++;
            }
        }
        return resultado;
    }

    public Reserva[] listarReservas(){
        return Arrays.copyOf(reservas, tamanho);
    }

}
