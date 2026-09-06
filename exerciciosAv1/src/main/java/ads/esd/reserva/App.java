package ads.esd.reserva;

import java.time.LocalDate;

public class App {
    static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas(5);

        System.out.println("=== 1. CRIANDO RESERVAS ===");
        sistema.criarReserva(new Reserva("R01", "Lucas", LocalDate.of(2026, 10, 15)));
        sistema.criarReserva(new Reserva("R02", "Mariana", LocalDate.of(2026, 10, 16)));
        sistema.criarReserva(new Reserva("R03", "Lucas", LocalDate.of(2026, 11, 20)));
        sistema.criarReserva(new Reserva("R04", "Beatriz", LocalDate.of(2026, 12, 01)));

        System.out.println("\n=== 2. LISTANDO TODAS AS RESERVAS ===");
        for (Reserva r : sistema.listarReservas()) {
            System.out.println(r);
        }

        System.out.println("\n=== 3. BUSCANDO RESERVAS POR CLIENTE ('Lucas') ===");
        Reserva[] reservasLucas = sistema.buscarReservasCliente("Lucas");
        for (Reserva r : reservasLucas) {
            System.out.println(r);
        }

        System.out.println("\n=== 4. CANCELANDO RESERVA PELO ID ('R02') ===");
        try {
            sistema.cancelarReservaID("R02");
            System.out.println("Reserva R02 cancelada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== 5. LISTANDO RESERVAS APÓS CANCELAMENTO ===");
        for (Reserva r : sistema.listarReservas()) {
            System.out.println(r);
        }

        System.out.println("\n=== 6. TESTANDO CANCELAMENTO DE ID INEXISTENTE ===");
        try {
            sistema.cancelarReservaID("R999");
        } catch (Exception e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }
    }
}
