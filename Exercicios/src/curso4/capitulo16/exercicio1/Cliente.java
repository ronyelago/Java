package curso4.capitulo16.exercicio1;

public class Cliente extends Pessoa {
    
    public Cliente(String nome) {
        super(nome);
    }
    
    public Cliente(String nome, double saldo) {
        super(nome);
        this.saldo = saldo;
    }
    
    private double saldo;
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String toString() {
        return super.toString() + "\n Saldo: " + saldo;
    }
}
