package Prova_03_10_2016;

public class Venda 
{
    public Venda(int numero, double totalVenda, String descricao)
    {
        this.numero = numero;
        this.totalVenda = totalVenda;
        this.descricao = descricao;
    }
    public Venda(int numero, double totalVenda)
    {
        this.numero = numero;
        this.totalVenda = totalVenda;
    }
    
    private int numero;
    private double totalVenda;
    private String descricao;

    public String getDescricao() 
    {
        return descricao;
    }

    public int getNumero() 
    {
        return numero;
    }

    public double getTotalVenda() 
    {
        return totalVenda;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public void setTotalVenda(double totalVenda) 
    {
        this.totalVenda = totalVenda;
    }
    
    public String toString()
    {
        return "Numero: " + getNumero() +
               "\nTotal: " + getTotalVenda() +
               "\nDescricao: " + getDescricao();
    }
}
