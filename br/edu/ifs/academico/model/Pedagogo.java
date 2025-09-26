package br.edu.ifs.academico.model;

public class Pedagogo extends Pessoa{
    private int anoFormacao;
    private String experiencia;

    public Pedagogo(String nome) {
        super(nome);
    }

    public int getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(int anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
