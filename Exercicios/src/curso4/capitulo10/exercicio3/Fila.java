package curso4.capitulo10.exercicio3;
import java.util.ArrayList;
import java.util.List;

public class Fila 
{
    private List pessoasSemPreferencia = new ArrayList();
    private List pessoasComPreferencia = new ArrayList();
    private int anterior = -1;
    
    public List getPessoaSemPreferencia()
    {
        return pessoasSemPreferencia;
    }
    
    public List getPessoasComPreferencia()
    {
        return pessoasComPreferencia;
    }
    
    public List getFila()
    {
        List fila = new ArrayList();
        fila.addAll(pessoasComPreferencia);
        fila.addAll(pessoasSemPreferencia);
        return fila;
    }
    
    public void addPessoa(int idade)
    {        
        if (idade >= 60)
        {
            pessoasComPreferencia.add(idade);
        }
        else if (idade < 60 && idade >= 15)
        {
            if (anterior <= 4 && anterior >= 0)
            {
                pessoasComPreferencia.add(idade);
                anterior = -1;
            }
            else
            {
                pessoasSemPreferencia.add(idade);
            }
        }
        else
        {
            anterior = idade;
        }
    }
}
