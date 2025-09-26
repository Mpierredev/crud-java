package br.edu.ifs.academico;

public class Psicologo extends Pessoa{
    private double numeroCRP;
    private String classe;
    private String especialidade;

    public double getNumeroCRP() {
        return numeroCRP;
    }

    public void setNumeroCRP(double numeroCRP) {
        this.numeroCRP = numeroCRP;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}