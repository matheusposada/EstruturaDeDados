package ADS.ESD;

public class Funcionarios {

    private String nome;
    private double salario;
    private double bonus;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionarios");
        sb.append("nome: ").append(nome).append('\'');
        sb.append("salario: ").append(salario);
        sb.append("bonus: ").append(bonus);
        return sb.toString();
    }
}
