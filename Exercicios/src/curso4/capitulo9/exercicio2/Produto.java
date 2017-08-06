package curso4.capitulo9.exercicio2;

public class Produto 
{
    private String nome;
    private float preco;
    private int quantidade;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    public float getPreco()
    {
        return this.preco;
    }
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    public int getQuantidade()
    {
        return this.quantidade;
    }
    
    public float getValorEstoque()
    {
        return getQuantidade() * getPreco();
    }
    
    public String toString()
    {
        return "Nome: " + getNome() +
               " Preco: " + getPreco() +
               " Quantidade: " + getQuantidade() +
               " Valor em Estoque" + getValorEstoque();
    }
}
