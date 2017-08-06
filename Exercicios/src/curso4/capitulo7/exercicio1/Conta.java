package curso4.capitulo7.exercicio1;

public class Conta 
{
    
    public Conta(int numConta)
    {
        this.numeroConta = numConta;
    }
    
    private String cliente;
    private double saldo;
    private int numeroConta;
    
    public void depositar(double valor)
    {
        if (valor > 0)
            this.saldo += valor;
    }
    
    public boolean sacar(double valor)
    {
        if (saldo > 0 && valor <= saldo && valor > 0)
        {
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    public String toString()
    {
        return "Cliente: " + cliente + "Numero da Conta: " + numeroConta + "Saldo: " + saldo;
    }
    
    public String getCliente()
    {
        return cliente;
    }

    public void setCliente(String cliente) 
    {
        this.cliente = cliente;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }
}
