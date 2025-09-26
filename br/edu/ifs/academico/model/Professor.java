package br.edu.ifs.academico.model;

public class Professor extends Pessoa{
    private String formacao;

    public Professor(String nome) {
        super(nome);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
