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
        for (Contato c : contatos){
            System.out.println(c.getNome() + " - " + c.getTelefone());            
        }        
    }

    public String buscarContato(Contato c){
        for (Contato contato: contatos){
            if(c.getNome().equalsIgnoreCase(contato.getNome())){
                return this.contato;
            }
            if(c.getTelefone().equalsIgnoreCase(contato.getTelefone())){
                return this.contato;
            }
        }        
    }

    public void atualizarContato (Contato c){
        for (Contato contato: contatos){
            if (c.getNome().equalsIgnoreCase(contato.getNome())) {
                c.atualizarNome();
                c.atualizarEmail();
                c.atualizarTelefone();
            }
        }
    }
   
    public String buscarPrefixo(Contato c){
        for (Contato contato : contatos){
            if(contato.startsWith(c)){
                return this.contato;
            } else {
                System.out.println("Contato não localizado!");
            }
        }
    }

    public void adicoinarEmLote(Contato[] novosContatos){
        if (this.tamanho + novosContatos.length > this.contatos.length) {
            System.out.println("Não há espaço suficente na agenda!");
            return;
        }
        for (int i = 0; i > novosContatos.length; i++) {
            this.contatos[this.tamanho] = novosContatos[i];
            this.tamanho++;
        }

    }




}
