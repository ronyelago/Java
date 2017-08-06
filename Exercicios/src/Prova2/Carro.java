package Prova2;

public class Carro 
{
    public Carro(String marca)
    {
        this.marca = marca;
    }
    public Carro(String marca, int ano)
    {
        this.marca = marca;
        this.ano = ano;
    }
    public Carro(String marca, int ano, double valor)
    {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }
    
    String marca = "Gurgel";
    int ano = 1990;
    double valor = 10.000;
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getMarca()
    {
        return this.marca;
    }
    
    public void segAno(int ano)
    {
        this.ano = ano;
    }
    public int getAno()
    {
        return this.ano;
    }
    
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    public double getValor()
    {
        return this.valor;
    }
    
    public void imprimir()
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.valor);
        System.out.println("Preco: " + this.valor);
    }
    
    public String toString()
    {
        return "Marca: " + this.marca + "\nAno: " + this.ano + "\nPreco: " + this.valor + "\n";
    }
}
