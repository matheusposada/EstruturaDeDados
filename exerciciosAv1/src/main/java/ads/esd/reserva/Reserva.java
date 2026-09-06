package ads.esd.reserva;

import java.time.LocalDate;

public class Reserva {
    private String idReserva;
    private String nomeCliente;
    private LocalDate data;

    public Reserva(String idReserva, String nomeCliente, LocalDate data) {
        this.idReserva = idReserva;
        this.nomeCliente = nomeCliente;
        this.data = data;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva='" + idReserva + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", data=" + data +
                '}';
    }
}
