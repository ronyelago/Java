package Prova_28_11_16;

public class Aluno extends Pessoa {
    
    public Aluno(int matricula) {
        this.matricula = matricula;
    }
    
    private int matricula;
    private Curso curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public String toString() {
        return super.toString() + "\nMatrícula: " + matricula + "\nCurso: " +
               curso;
    }
}
