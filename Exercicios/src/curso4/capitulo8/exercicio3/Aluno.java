package curso4.capitulo8.exercicio3;

public class Aluno 
{
    private String nome;
    private int matricula;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho1;
    private double notaTrabalho2;
    
    public Aluno()
    {}
    public Aluno(int matricula)
    {
        setMatricula(matricula);
    }
    public Aluno(int matricula, String nome)
    {
        setMatricula(matricula);
        setNome(nome);
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getMatricula() 
    {
        return matricula;
    }
    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public double getNotaProva1() 
    {
        return notaProva1;
    }
    public void setNotaProva1(double notaProva1) 
    {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() 
    {
        return notaProva2;
    }
    public void setNotaProva2(double notaProva2) 
    {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho1() 
    {
        return notaTrabalho1;
    }
    public void setNotaTrabalho1(double notaTrabalho1) 
    {
        this.notaTrabalho1 = notaTrabalho1;
    }

    public double getNotaTrabalho2() 
    {
        return notaTrabalho2;
    }
    public void setNotaTrabalho2(double notaTrabalho2) 
    {
        this.notaTrabalho2 = notaTrabalho2;
    }
    
    public double getMediaTrabalhos()
    {
        double mediaTrabalhos = (0.40 * getNotaTrabalho1())+(0.60 * getNotaTrabalho2());
        return mediaTrabalhos;
    }
    
    public double getMediaProvas()  
    {  
        double mediaProvas=(notaProva1*(1.0/3.0))+(notaProva2*(2.0/3.0));  
        return mediaProvas;  
    }
    
    public double getMediaFinal()  
    {  
        double mediaFinal=(getMediaTrabalhos()*0.25)+(getMediaProvas()*0.75);  
        double aux1=(int)mediaFinal;  
        double aux2=mediaFinal%1;  
          
        if(aux2>0 && aux2<0.25)
        {
            aux2=0.25;
        }
        else if (aux2>0.25 && aux2<0.50)
        {
            aux2=0.50;
        }
        else if (aux2>0.50 && aux2<0.75)
        {
            aux2=0.75;
        }
        else if (aux2>0.75 && aux2<1.0)
        {
            aux2=1.0;
        }
        return aux1+aux2;  
    }
    
    public String getResultadoFinal()  
    {  
        String resultado;  
          
        if(getMediaFinal()>=0 && getMediaFinal()<4)
        {
            resultado="Reprovado";
        }
        else if(getMediaFinal()>=4 && getMediaFinal()<7)
        {
            resultado="Recuperação";
        }
        else if(getMediaFinal()>=7 && getMediaFinal()<9.5)
        {
            resultado="Aprovado";
        }
        else
        {
            resultado = "Aprovado com Louvor";
        }
        return resultado;  
    }

    @Override
    public String toString() 
    {
        return "Nome: " + getNome() + ", Matricula: " + getMatricula() + ", Media Final: " +getMediaFinal()+ ", Resultado: "+getResultadoFinal();
    }
    
}