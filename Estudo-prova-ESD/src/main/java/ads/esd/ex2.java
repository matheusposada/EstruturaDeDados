package ads.esd;
//2. percorra o array e descubra o MAIOR valor. Imprima esse valor no final.


public class ex2 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 42, 16, 23, 15};
        int maior = 0;

            for (int i = 0; i < numeros.length; i++) {
                //maior = numeros[i] > maior ? numeros[i] : maior;
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }

            }

        System.out.println(maior);





    }
}
