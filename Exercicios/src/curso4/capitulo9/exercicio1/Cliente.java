package curso4.capitulo9.exercicio1;

public class Cliente 
{
    private int codigo;
    private String nome;
    private double saldo;
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
    
    
    public Cliente() {}
    
    public Cliente(int codigo)
    {
        this.codigo = codigo;
    }
    
    public Cliente(double saldo, int codigo)
    {
        this.codigo = codigo;
        this.saldo = saldo;
    }
    
    public String toString()
    {
        return ("Codigo: " + getCodigo() + 
                "Nome: " + getNome() + "Saldo: " + getSaldo());
    }
}
