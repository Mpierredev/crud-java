package br.edu.ifs.academico.model;

public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        super(nome);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
