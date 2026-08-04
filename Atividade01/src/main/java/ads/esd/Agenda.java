package ads.esd;

public class Agenda {

    private Contato[] contatos = new Contato[20];
    private int tamanho;

    public void adicionarContato(Contato c) {
        for (Contato contato: contatos) {
            if (c.getNome().equalsIgnoreCase(contato.getNome())){
                System.out.println("Nome já existente");
                return;
            }
            if (c.getTelefone().equalsIgnoreCase(contato.getTelefone())){
                System.out.println("Telefone já existente");
                return;
            }
            if (tamanho >= contatos.length) {
                System.out.println("Agenda cheia");
                return;
            } else {
                contatos[tamanho] = c;
            }

        }
    }

    public void remover(int indice){
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++){
            contatos[i] = contatos[i+1];
        }

        contatos[tamanho-1] = null;
        tamanho--;

    }


    public void removerContato(Contato c) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(c)){
                remover(i);
            } else System.out.println("Contato inexistente!");
        }
    }

    public String listarContatos(){
        final StringBuilder sb = new StringBuilder("Lista de Contatos\'");
        for (Contato c : contatos){
            sb.append(c.toString());
        }
        return sb.toString();
    }

    public String buscarContato(Contato nome){
        return nome.toString() ;
    }

    public String buscarContato(Contato telefone){
        
    }







}
