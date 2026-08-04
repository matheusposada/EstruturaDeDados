package esd.ads.vetor;

public class VetorEstatico {

    private String[] elementos;
    private int tamanho;



    public VetorEstatico(int quantidade){
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

//    public void inserir(String elemento){
//
//        for (int i = 0; i < elementos.length; i++){
//            if (elementos[i] == null) {
//                elementos[i] = elemento;
//                return;
//            }
//        }
//        System.out.println("Não tem posição disponivel");
//
//    }


    public void inserir(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Vetor está cheio!");
        }
    }


    public void inserir (int indice, String elemento) {

        if (tamanho >= elementos.length) {
            System.out.println("Vetor cheio!");
            return;
        }

        if (indice < 0 || indice > elementos.length){
            System.out.println("Posição inválida");
            return;
        }

        for (int i = tamanho; i > indice; i-- ){
            elementos[i] = elementos[i-1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }

    public void imprimir(){
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);
            if (i < elementos.length -1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


    //Escrever os métodos:
    // obterTamanho
    //removerFinal


    public int obterTamanho() {

        return this.tamanho;
    }

    public String ler(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
    }

    public void removerFinal(){
        if (tamanho > 0) {
            elementos[tamanho-1] = null;
            tamanho--;
        } else {
            System.out.println("Vetor vazio");
        }
    }

    public void remover(int indice){
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++){
            elementos[i] = elementos[i+1];
        }

        elementos[tamanho-1] = null;
        tamanho--;

    }

    public void remover(String elemento) {
        for (int i = 0; i < tamanho; i ++) {
            if (elementos[i].equals(elemento)){
                remover(i);
            }
        }
    }


}
