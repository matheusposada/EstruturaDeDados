package ads.esd.termometro;

public class TesteTemperatura {

    public static void main(String[] args) {
        Termometro t = new Termometro();
        t.setTemperatura(80);
        System.out.println(t.getTemperatura()); // deve imprimir 50.0
        t.setTemperatura(-50);
        System.out.println(t.getTemperatura()); // deve imprimir -30.0
        t.setTemperatura(22);
        System.out.println(t.getTemperatura()); // deve imprimir 22.0


    }
}
