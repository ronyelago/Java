package Prova1;

public class Aluno 
{
    public Aluno(int matricula)
    {
        this.matricula = matricula;
    }
    public Aluno(int matricula, double notaProva1, double notaProva2)
    {
        this.matricula = matricula;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
    }
    
    private int matricula;
    private double notaProva1, notaProva2;
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    public int getMatricula()
    {
        return this.matricula;
    }
    public void setNotaProva1(double notaProva1)
    {
        this.notaProva1 = notaProva1;
    }
    public double getNotaProva1()
    {
        return this.notaProva1;
    }
    public void setNotaProva2(double notaProva2)
    {
        this.notaProva2 = notaProva2;
    }
    public double getNotaProva2()
    {
        return this.notaProva2;
    }
    
    public double obterMediaAluno()
    {
        return (getNotaProva1() + getNotaProva2()) / 2;
    }
    public void imprimeDadosAluno()
    {
        System.out.println("Numero da Matricula: " + getMatricula());
        System.out.println("Nota da Prova 1: " + getNotaProva1());
        System.out.println("Nota da Prova 2: " + getNotaProva2());
        System.out.println("Media Final: " + obterMediaAluno());
    }
    
}

