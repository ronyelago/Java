package Prova_28_11_16;

import java.util.ArrayList;

public class Professor extends Pessoa {
    
    private int numero;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public String toString() {
        return super.toString() + "\nNúmero: " + numero + "\nCursos: " +
               cursos;
    }
}
