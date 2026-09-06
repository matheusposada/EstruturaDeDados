package ads.esd;

public class ArraysNivel1 {

    //2. Escreva um método imprimirInvertido(int[] vetor) que imprime os elementos de trás pra frente, sem criar um novo array.
    public static void imprimirInvertido(int[] vetor){
        for(int i = vetor.length - 1; i >= 0; i--){
            IO.println(vetor[i] + " ");
        }
    }

    //3. Escreva um método somarTudo(int[] vetor) que retorna a soma de todos os elementos.
    public static void somarTudo(int[] vetor){
        int somaTotal = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaTotal += vetor[i];
        }
        IO.println("A soma total do vetor é: " + somaTotal);
    }

    //4. Escreva um método contarPares(int[] vetor) que conta quantos números pares existem no array.
    public static void contarPares(int[] vetor){
        int pares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                pares++;
            }
        }
        IO.println("O vetor tem " + pares + " números pares!");
    }

    //5. Escreva um método existeNumero(int[] vetor, int numero) que retorna true ou false se o número existe no array (sem usar busca binária ainda — só percorra).
    public static boolean existeNumero(int[] vetor, int numero){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero){
                return true;
            }
        }
        return false;
    }

    //6. escreva o código que encontra o maior valor usando apenas um laço for.
    public static void encontraMaior(int[] vetor){
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        IO.println("O maior número é: " + maior);
    }

    //7. Escreva um método que recebe um array e devolve um novo array só com os números maiores que 10.
    public static int[] retornaMaiores(int[] vetor){
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 10){
                quantidade++;
            }
        }
        int[] maiores = new int[quantidade];
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 10){
                maiores[posicao] = vetor[i];
                posicao++;
            }
        }
        return maiores;
    }




}
