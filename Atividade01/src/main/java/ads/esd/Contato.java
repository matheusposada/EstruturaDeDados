package ads.esd;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void atualizarEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\"");
        sb.append("nome: ").append(nome).append('\'');
        sb.append("telefone:").append(telefone).append('\'');
        sb.append("email: ").append(email).append('\'');
        sb.append("\"");
        return sb.toString();
    }
}
