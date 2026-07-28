package ADS.ESD;

import java.util.ArrayList;

public class Projetos {

    private Gerente gerente;
    private ArrayList<Funcionarios> funcionario = new ArrayList<>();
    private double custo;

    public Projetos(Gerente gerente) {
        this.gerente = gerente;
    }

    public void addFuncionario(Funcionarios f){
        funcionario.add(f);
    }

    public double calculoCusto(){
        for (Funcionarios f: funcionario){
            custo = f.getSalario() + gerente.getSalario();
        }



    }

    public double calcularBonusGerente(){
        double porcentagemBonus = funcionario.size();
        return porcentagemBonus;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Projeto");
        sb.append("gerente: ").append(gerente);
        sb.append("funcionario: ").append(funcionario);
        sb.append("custo: ").append(custo);
        return sb.toString();
    }
}
