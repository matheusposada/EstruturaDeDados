package ads.esd;

//1. escreva um laço que soma todos os elementos de "numeros" e imprime o resultado no final.

public class ex1 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);

    }
}
