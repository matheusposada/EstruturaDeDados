package ads.esd;
//3.conte quantas vezes "alvo" aparece em "numero e imprima a contagem.

public class ex3 {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 3, 2, 3, 7, 3};
        int alvo = 3;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] == alvo){
                contador++;
            }

        }

        System.out.println(contador);



    }

}
