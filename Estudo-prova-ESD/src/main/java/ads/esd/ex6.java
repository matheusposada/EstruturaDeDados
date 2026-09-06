package ads.esd;
//6. verifique se o array está em ordem crescente. Imprima "Ordenado" ou "Não ordenado".

public class ex6 {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 5, 7, 9};
        boolean ordenados = true;

        for (int i = 0; i < numeros.length - 1; i++){

            if (numeros[i] > numeros[i+1]){
                ordenados = false;
                break;
            }
        }

        System.out.println(ordenados ? "Ordenandos" : "Não ordenados");

    }
}
