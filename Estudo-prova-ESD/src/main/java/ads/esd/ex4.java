package ads.esd;
// 4. inverta o array IN-PLACE (trocando posições), sem criar outro array. Depois imprima o resultado.


public class ex4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio < fim) {

            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;
            inicio++;
            fim--;

        }

        for (int n : numeros) {
            System.out.println(n + " ");
        }



    }
}
