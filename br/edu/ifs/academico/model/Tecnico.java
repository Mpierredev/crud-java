package br.edu.ifs.academico.model;

public class Tecnico extends Pessoa{
    private String nivelFormacao;
    private String areaAtuacao;

    public Tecnico(String nome) {
        super(nome);
    }

    public String getNivelFormacao() {
        return nivelFormacao;
    }

    public void setNivelFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", localNascimento='" + getLocalNascimento() + '\'' +
                ", sexo='" + getSexo() + '\'' +
                ", nivelFormacao='" + nivelFormacao + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }
}
