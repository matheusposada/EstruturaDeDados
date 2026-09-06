package ads.esd.termometro;
/*Crie uma classe Termometro que guarda uma temperatura (double), com as seguintes regras:

Se o valor definido for maior que 50, trava em 50.
Se for menor que -30, trava em -30.
Caso contrário, guarda o valor normalmente.

TODO: atributo privado "temperatura"
TODO: método público setTemperatura(double valor) com as regras acima
TODO: método público getTemperatura() que retorna o valor*/

public class Termometro {

    private double temperatura;



    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura > 50){
            this.temperatura = 50;
        } else if (temperatura < -30) {
            this.temperatura = -30;
        } else this.temperatura = temperatura;
    }
}
