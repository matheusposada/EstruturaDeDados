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


   public void removerContato(String n) {
        boolean encontrado = false;
    
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(n)) {
                remover(i);
                encontrado = true;
                break; 
            }
        }
    
        if (!encontrado) {
            System.out.println("Contato inexistente!");
        }
    }
        
        

    public void listarContatos(){        
        for (Contato c : contatos){
            System.out.println(c.getNome() + " - " + c.getTelefone());            
        }        
    }

    public String buscarContato(String n){
        for (Contato contato: contatos){
            if(contato.getNome().equalsIgnoreCase(n)){
                return n;
            }
            if(contato.getTelefone().equalsIgnoreCase(n)){
                return n;
            }
        } 
        return "Contato não localizado!";       
    }

    public void atualizarContato (Contato c){
        for (Contato contato: contatos){
            if (c.getNome().equalsIgnoreCase(contato.getNome())) {
                contato.atualizarNome(c.getNome());
                contato.atualizarEmail(c.getEmail());
                contato.atualizarTelefone(c.getTelefone());
            }
        }
    }
   
    public String buscarPrefixo(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                return nome;
            }
        }
        return nome;
    }

    public void adicionarEmLote(Contato[] novosContatos){
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
