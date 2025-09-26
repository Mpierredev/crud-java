package br.edu.ifs.academico.model;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.imprimir();
        Scanner input = new Scanner(System.in);

        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
        ArrayList<Psicologo> listaPsicologos = new ArrayList<Psicologo>();
        ArrayList<Pedagogo> listaPedagogos = new ArrayList<Pedagogo>();
        ArrayList<Tecnico> listaTecnicos = new ArrayList<Tecnico>();
        ArrayList<Reitor> listaReitores = new ArrayList<Reitor>();
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();


        int opcao = input.nextInt();

        String nome;
        String dataNascimento;
        String localNascimento;
        char sexo;

        while (opcao != 0){
            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar aluno:");
                    System.out.println("Nome");
                    nome = input.next();
                    Aluno aluno = new Aluno(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    aluno.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    aluno.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    aluno.setSexo(sexo);
                    listaAlunos.add(aluno);
                    break;

                case 2:
                    System.out.println("Listar alunos:");
                    System.out.println("Lista de alunos");
                    System.out.println(listaAlunos);
                    break;

                case 3:
                    System.out.println("Cadastrar professor:");
                    System.out.println("Nome");
                    nome = input.next();
                    Professor professor = new Professor(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    professor.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    professor.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    professor.setSexo(sexo);
                    System.out.println("Formação");
                    String formacao = input.next();
                    professor.setFormacao(formacao);
                    listaProfessores.add(professor);

                    break;

                case 4:
                    System.out.println("Listar professor:");
                    System.out.println("Lista de professores");
                    System.out.println(listaProfessores);
                    break;

                case 5:
                    System.out.println("Cadastrar psicologo:");
                    System.out.println("Nome");
                    nome = input.next();
                    Psicologo psicologo = new Psicologo(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    psicologo.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    psicologo.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    psicologo.setSexo(sexo);
                    System.out.println("Número CRP");
                    double numeroCRP = input.nextDouble();
                    psicologo.setNumeroCRP(numeroCRP);
                    System.out.println("Classe");
                    String classe = input.next();
                    psicologo.setClasse(classe);
                    System.out.println("Especialidade");
                    String especialidade = input.next();
                    psicologo.setEspecialidade(especialidade);
                    listaPsicologos.add(psicologo);
                    break;

                case 6:
                    System.out.println("Listar psicologo:");
                    System.out.println("Lista de psicologos");
                    System.out.println(listaPsicologos);
                    break;

                case 7:
                    System.out.println("Cadastrar pedagogo:");
                    System.out.println("Nome");
                    nome = input.next();
                    Pedagogo pedagogo = new Pedagogo(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    pedagogo.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    pedagogo.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    pedagogo.setSexo(sexo);
                    System.out.println("Ano de formação");
                    int anoFormacao = input.nextInt();
                    pedagogo.setAnoFormacao(anoFormacao);
                    System.out.println("Experiencia");
                    String experiencia = input.next();
                    pedagogo.setExperiencia(experiencia);
                    listaPedagogos.add(pedagogo);
                    break;

                case 8:
                    System.out.println("Listar pedagogo:");
                    System.out.println("Lista de pedagogos");
                    System.out.println(listaPedagogos);
                    break;

                case 9:
                    System.out.println("Cadastrar técnico:");
                    System.out.println("Nome");
                    nome = input.next();
                    Tecnico tecnico = new Tecnico(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    tecnico.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    tecnico.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    tecnico.setSexo(sexo);
                    System.out.println("Nivel de formação");
                    String nivelFormacao = input.next();
                    tecnico.setNivelFormacao(nivelFormacao);
                    System.out.println("Área de Atuação");
                    String areaAtuacao = input.next();
                    tecnico.setAreaAtuacao(areaAtuacao);
                    listaTecnicos.add(tecnico);
                    break;

                case 10:
                    System.out.println("Listar técnico");
                    System.out.println("Lista de técnicos");
                    System.out.println(listaTecnicos);
                    break;

                case 11:
                    System.out.println("Cadastrar reitor");
                    System.out.println("Nome");
                    nome = input.next();
                    Reitor reitor = new Reitor(nome);
                    System.out.println("Data Nascimento");
                    dataNascimento = input.next();
                    reitor.setDataNascimento(dataNascimento);
                    System.out.println("Local Nascimento");
                    localNascimento = input.next();
                    reitor.setLocalNascimento(localNascimento);
                    System.out.println("Sexo");
                    sexo = input.next().charAt(0);
                    reitor.setSexo(sexo);
                    System.out.println("Data da Posse");
                    String dataPosse = input.next();
                    reitor.setDataPosse(dataPosse);
                    System.out.println("Data de Exoneração");
                    String dataExoneracao = input.next();
                    reitor.setDataExoneracao(dataExoneracao);
                    System.out.println("Votos recebidos");
                    int votosRecebidos = input.nextInt();
                    reitor.setVotosRecebidos(votosRecebidos);
                    listaReitores.add(reitor);
                    break;

                case 12:
                    System.out.println("Listar reitor");
                    System.out.println("Lista de reitores");
                    System.out.println(listaReitores);
                    break;
            }
            menu.imprimir();
            opcao = input.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}