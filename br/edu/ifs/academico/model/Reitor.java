package br.edu.ifs.academico.model;

public class Reitor extends Pessoa {
    private String dataPosse;
    private String dataExoneracao;
    private int votosRecebidos;

    public Reitor(String nome) {
        super(nome);
    }

    public String getDataPosse() {
        return dataPosse;
    }

    public void setDataPosse(String dataPosse) {
        this.dataPosse = dataPosse;
    }

    public String getDataExoneracao() {
        return dataExoneracao;
    }

    public void setDataExoneracao(String dataExoneracao) {
        this.dataExoneracao = dataExoneracao;
    }

    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    public void setVotosRecebidos(int votosRecebidos) {
        this.votosRecebidos = votosRecebidos;
    }
    @Override
    public String toString() {
        return "Reitor{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", localNascimento='" + getLocalNascimento() + '\'' +
                ", sexo='" + getSexo() + '\'' +
                ", dataPosse='" + dataPosse + '\'' +
                ", dataExoneracao='" + dataExoneracao + '\'' +
                ", votosRecebidos=" + votosRecebidos +
                '}';
    }
}
