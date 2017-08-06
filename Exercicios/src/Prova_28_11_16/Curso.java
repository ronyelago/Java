package Prova_28_11_16;

import java.util.ArrayList;

public class Curso {
    
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    
    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public String toString() {
        
        String prof = "";
        for (Professor p : professores) {
            prof += p.getNome() + "\n";
        }
        
        String a = "";
        for (Aluno al : alunos) {
            a += al.getNome() + "\n";
        }
        
        return "Código: " + codigo + "\nNome: " + nome +
                "\n---Alunos---\n" + a +
                "\n---Professores---\n" + prof;
    }
}
