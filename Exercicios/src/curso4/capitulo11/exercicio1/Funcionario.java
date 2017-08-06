package curso4.capitulo11.exercicio1;

public class Funcionario 
{
    private int codigo;
    private String funcao;
    private String nome;
    
    public Funcionario(){}
    
    public Funcionario(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }
    public String getFuncao()
    {
        return this.funcao;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
}
