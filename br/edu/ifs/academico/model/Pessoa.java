package br.edu.ifs.academico.model;

public class Pessoa {

    private String cpf;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getLocalNascimento() {
        return localNascimento;
    }
    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    private String nome;
    private String localNascimento;
    private String dataNascimento;
    private char sexo;
    // CPF já está disponível para todas as subclasses
}
