package br.edu.ifs.academico;

public class Reitor extends Pessoa {
    private String dataPosse;
    private String dataExoneracao;
    private int votosRecebidos;

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
}