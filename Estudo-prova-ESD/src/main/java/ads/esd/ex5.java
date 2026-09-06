package ads.esd;
// 5. percorra o array procurando "alvo". Se encontrar, imprima o índice. Se não encontrar, imprima -1.


public class ex5 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        String alvo = "Carla";
        int indice = -1;

        for (int i = 0; i < nomes.length; i++){

            if (nomes[i].equals(alvo)){
                indice = i;
                break;
            }
        }

        System.out.println(indice);

    }

}
